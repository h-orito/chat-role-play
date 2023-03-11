package dev.wolfort.chatroleplay.domain.model.player

data class Player(
    val id: Int,
    val name: String,
    val authorities: List<Authority>
)