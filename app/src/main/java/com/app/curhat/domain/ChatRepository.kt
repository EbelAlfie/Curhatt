package com.app.curhat.domain

import com.app.curhat.domain.entity.Message

interface ChatRepository {
  fun sendMessage(message: Message)
  fun getMessages(id: String): List<Message>
}