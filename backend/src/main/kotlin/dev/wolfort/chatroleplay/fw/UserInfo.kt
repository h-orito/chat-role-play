package dev.wolfort.chatroleplay.fw

import dev.wolfort.chatroleplay.domain.model.player.Authority
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

data class UserInfo(
    val userName: String,
    val authorities: List<Authority>
) : UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return authorities.map { SimpleGrantedAuthority(it.name) }.toMutableList()
    }

    override fun getPassword(): String = ""
    override fun getUsername(): String = userName

    override fun isAccountNonExpired(): Boolean = true
    override fun isAccountNonLocked(): Boolean = true
    override fun isCredentialsNonExpired(): Boolean = true
    override fun isEnabled(): Boolean = true
}