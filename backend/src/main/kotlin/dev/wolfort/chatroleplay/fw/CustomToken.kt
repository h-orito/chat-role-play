package dev.wolfort.chatroleplay.fw

import org.springframework.security.authentication.AbstractAuthenticationToken
import org.springframework.security.core.GrantedAuthority


class CustomToken(
    private val authorities: Collection<GrantedAuthority>,
    private val userInfo: UserInfo?
) : AbstractAuthenticationToken(authorities) {

    override fun getPrincipal(): UserInfo? {
        return userInfo
    }

    override fun getCredentials(): Any? {
        return null
    }
}