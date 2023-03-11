package dev.wolfort.chatroleplay.domain.model.chara

data class Chara(
    val id: Int,
    val name: String,
    val size: CharaSize,
    val images: List<CharaImage>
)