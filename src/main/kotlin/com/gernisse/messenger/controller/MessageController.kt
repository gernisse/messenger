package com.gernisse.messenger.controller

import com.gernisse.messenger.dto.MessageDto
import com.gernisse.messenger.entity.Message
import com.gernisse.messenger.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(
    private val messageService: MessageService
) {

    @PostMapping
    fun save(@RequestBody messageDto: MessageDto) {
        messageService.save(messageDto)
    }

    @GetMapping
    fun getMessages(): List<Message> = messageService.getAll()
}
