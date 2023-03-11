package dev.wolfort.chatroleplay.domain.model.message

data class MessageContent(
    val type: MessageType,
    val number: Int,
    val text: String,
    val isConvertDisable: Boolean
)
