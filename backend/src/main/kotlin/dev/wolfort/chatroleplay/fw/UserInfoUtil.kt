package dev.wolfort.chatroleplay.fw

import org.springframework.security.core.context.SecurityContextHolder

object UserInfoUtil {

    fun getUserInfo(): UserInfo? {
        val authentication = SecurityContextHolder.getContext().authentication ?: return null
        return if (authentication.principal is UserInfo) {
            authentication.principal as UserInfo
        } else null
    }
}