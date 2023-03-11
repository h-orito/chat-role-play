package dev.wolfort.chatroleplay.domain.model.message

data class Message(
    val id: Long,
    val content: MessageContent,
    val time: MessageTime,
    val sender: MessageSender,
    val reactions: MessageReactions
)