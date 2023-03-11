package dev.wolfort.chatroleplay.domain.model.game

data class GameParticipant(
    val id: Int,
    val name: String,
    val playerId: Int,
    val charaId: Int,
)