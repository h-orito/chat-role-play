package dev.wolfort.chatroleplay.domain.model.game

data class Game(
    val id: Int,
    val name: String,
    val participants: GameParticipants,
    val periods: GamePeriods,
    val setting: GameSetting
)