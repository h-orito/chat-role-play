package dev.wolfort.chatroleplay.fw

import jakarta.servlet.ServletException
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.AuthenticationException
import org.springframework.security.oauth2.jwt.*
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.access.AccessDeniedHandler
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import java.io.IOException


@Configuration
@ConfigurationProperties(prefix = "security")
@EnableWebSecurity
@EnableMethodSecurity
class SecurityConfig(
    private val jwtConverter: JwtConverter
) {

    // CORSを許可するドメイン
    lateinit var corsClientUrls: List<String>

    @Value("\${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
    private val issuer: String? = null

    @Bean
    @Throws(Exception::class)
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        return http
            .authorizeHttpRequests {
                it.requestMatchers("/api/v1/private").authenticated()
                    .anyRequest().permitAll()
//                it.anyRequest().authenticated()
            }
            // EXCEPTION
            .exceptionHandling {
                it.authenticationEntryPoint(authenticationEntryPoint())
                    .accessDeniedHandler(accessDeniedHandler())
            }
            // CSRF
            .csrf().disable()
            // CORS
            .cors().configurationSource(getCorsConfigurationSource()).and()
            // session
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            // JWT Authentication
            .oauth2ResourceServer {
                it.jwt().jwtAuthenticationConverter(jwtConverter).decoder(jwtDecoder())
            }
            .build()
    }

    @Bean
    fun jwtDecoder(): JwtDecoder {
        return JwtDecoders.fromIssuerLocation(issuer)
    }

    internal fun authenticationEntryPoint(): AuthenticationEntryPoint {
        return MyAuthenticationEntryPoint()
    }

    internal fun accessDeniedHandler(): AccessDeniedHandler {
        return MyAccessDeniedHandler()
    }

    /**
     * see https://rennnosukesann.hatenablog.com/entry/2019/09/18/235731
     */
    private fun getCorsConfigurationSource(): CorsConfigurationSource {
        val corsConfiguration = CorsConfiguration()

        // CORSを許可するURLの登録(Access-Control-Allow-Origin)
        this.corsClientUrls.forEach { corsConfiguration.addAllowedOrigin(it) }

        // 許可するHeaderの登録(Access-Control-Allow-Headers)
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL)
        corsConfiguration.addExposedHeader("X-AUTH-TOKEN")

        // 許可するMethodの登録(Access-Control-AllowMethods)
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL)

        // 認証情報送信許可の登録(Access-Control-Allow-Credentials)
        corsConfiguration.allowCredentials = true

        val corsSource = UrlBasedCorsConfigurationSource()

        // どのパスに上記ルールを適用するか
        corsSource.registerCorsConfiguration("/**", corsConfiguration)

        return corsSource
    }

    class MyAuthenticationEntryPoint : AuthenticationEntryPoint {

        private val logger = LoggerFactory.getLogger(MyAuthenticationEntryPoint::class.java)

        // 401とデフォルトメッセージを返すだけにしておく
        @Throws(IOException::class, ServletException::class)
        override fun commence(
            request: HttpServletRequest,
            response: HttpServletResponse,
            exception: AuthenticationException
        ) {
            if (response.isCommitted) {
                logger.info("Response has already been committed.")
                return
            }
            response.sendError(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.reasonPhrase)
        }
    }

    class MyAccessDeniedHandler : AccessDeniedHandler {

        // 403とデフォルトメッセージを返すだけにしておく
        @Throws(IOException::class, ServletException::class)
        override fun handle(
            request: HttpServletRequest,
            response: HttpServletResponse,
            exception: org.springframework.security.access.AccessDeniedException
        ) {
            response.sendError(HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.reasonPhrase)
        }
    }
}