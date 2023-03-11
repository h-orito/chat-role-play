package dev.wolfort.chatroleplay.domain.model.player

interface PlayerRepository {

    fun find(id: Int): Player?

    fun findByUsername(username: String): Player?

    fun save(player: Player): Player
}