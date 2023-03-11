package dev.wolfort.chatroleplay.domain.model.message

data class DirectMessageContent(
    val number: Int,
    val text: String,
    val isConvertDisable: Boolean
)
