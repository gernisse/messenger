package com.gernisse.messenger.dto

import com.gernisse.messenger.entity.Message

data class MessageDto(
    val message: String,
    val authorId: Long
) {
    fun toEntity() = Message(
        id = null,
        message = message,
        authorId = authorId
    )
}
