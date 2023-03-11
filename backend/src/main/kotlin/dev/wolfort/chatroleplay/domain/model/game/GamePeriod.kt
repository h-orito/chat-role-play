package dev.wolfort.chatroleplay.domain.model.game

data class GamePeriod(
    val id: Int,
    val name: String,
    val prefix: String?,
    val suffix: String?
) {
    fun fullName(): String = "${prefix.orEmpty()}$name${suffix.orEmpty()}"
}
