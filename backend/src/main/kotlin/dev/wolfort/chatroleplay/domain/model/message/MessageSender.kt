package dev.wolfort.chatroleplay.domain.model.message

import dev.wolfort.chatroleplay.domain.model.chara.FaceType

data class MessageSender(
    val participantId: Int,
    val name: String,
    val faceType: FaceType
)
