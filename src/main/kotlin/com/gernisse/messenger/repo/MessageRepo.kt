package com.gernisse.messenger.repo

import com.gernisse.messenger.entity.Message
import org.springframework.data.jpa.repository.JpaRepository

interface MessageRepo : JpaRepository<Message, Long>
