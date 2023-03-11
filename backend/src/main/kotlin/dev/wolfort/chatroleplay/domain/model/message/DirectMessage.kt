package dev.wolfort.chatroleplay.domain.model.message

data class DirectMessage(
    val id: Long,
    val participantGroupId: Int,
    val content: DirectMessageContent,
    val time: MessageTime,
    val sender: MessageSender
)