package dev.wolfort.chatroleplay.api.controller

import dev.wolfort.chatroleplay.application.service.PlayerService
import dev.wolfort.chatroleplay.fw.UserInfo
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*


@RestController
class PlayerController(
    private val playerService: PlayerService
) {
    @ResponseBody
    @GetMapping("/api/v1/public")
    fun publicApi(
        @AuthenticationPrincipal principal: UserInfo?
    ): String {
        println(principal)
        return "public"
    }

    @ResponseBody
    @GetMapping("/api/v1/private")
    fun privateApi(
        @AuthenticationPrincipal principal: UserInfo?
    ): String {
        println(principal)
        return "private"
    }
}