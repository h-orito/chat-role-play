package dev.wolfort.chatroleplay.fw

import org.springframework.core.convert.converter.Converter
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.stereotype.Component

@Component
class JwtConverter(
    private val userInfoService: UserInfoService
) : Converter<Jwt, CustomToken> {

    override fun convert(token: Jwt): CustomToken? {
        val username = token.subject
        val userInfo = try {
            userInfoService.loadUserByUsername(username)
        } catch (e: UsernameNotFoundException) {
            userInfoService.register(username)
        }

        // CustomToken生成
        val customToken = CustomToken(userInfo.authorities!!, userInfo as UserInfo)
        customToken.isAuthenticated = true
        return customToken
    }
}