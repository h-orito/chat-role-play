package dev.wolfort.chatroleplay.application.service

import dev.wolfort.chatroleplay.domain.model.player.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerService(
    private val playerRepository: PlayerRepository
) {
}