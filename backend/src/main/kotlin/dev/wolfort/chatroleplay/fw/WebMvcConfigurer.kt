package dev.wolfort.chatroleplay.fw

import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

class WebMvcConfigurer : WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(AccessContextInterceptor()).addPathPatterns("/**")
    }
}