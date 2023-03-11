package dev.wolfort.chatroleplay.domain.model.player

enum class Authority {
    Player,
    Admin
    ;

    companion object {
        fun defaultAuthorities() = listOf(Player)
    }
}