package dev.wolfort.chatroleplay.domain.model.message

data class MessageReactions(
    val replies: MessageReplies,
    val favorites: MessageFavorites
)
