package dev.wolfort.chatroleplay.domain.model.message

import java.time.LocalDateTime

data class MessageTime(
    val gamePeriodId: Int,
    val datetime: LocalDateTime,
    val unixTimeMilli: Long
)
