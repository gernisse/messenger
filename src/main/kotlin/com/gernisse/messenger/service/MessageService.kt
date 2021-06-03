package com.gernisse.messenger.service

import com.gernisse.messenger.dto.MessageDto
import com.gernisse.messenger.repo.MessageRepo
import org.springframework.stereotype.Service

@Service
class MessageService(
    private val messageRepo: MessageRepo
) {

    fun save(messageDto: MessageDto) = messageRepo.save(messageDto.toEntity())

    fun getAll() = messageRepo.findAll()
}
