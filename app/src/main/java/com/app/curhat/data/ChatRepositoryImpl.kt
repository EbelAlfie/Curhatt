package com.app.curhat.data

import com.app.curhat.domain.ChatRepository
import com.app.curhat.domain.entity.Message

class ChatRepositoryImpl: ChatRepository {
  override fun sendMessage(message: Message) {

  }

  override fun getMessages(id: String): List<Message> {
    TODO("Not yet implemented")
  }
}