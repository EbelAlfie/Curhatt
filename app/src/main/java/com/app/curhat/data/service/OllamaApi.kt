package com.app.curhat.data.service

import retrofit2.http.POST

interface OllamaApi {

  @POST
  fun generateCompletion()

  @POST
  fun generateChat()
}