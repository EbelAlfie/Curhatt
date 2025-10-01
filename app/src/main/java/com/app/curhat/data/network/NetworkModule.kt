package com.app.curhat.data.network

import com.app.curhat.data.service.OllamaApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit

class NetworkModule {

  private fun getHttpClient() = OkHttpClient
    .Builder()
    .build()

  private fun provideRetrofit(): Retrofit {
    val client = getHttpClient()

    return Retrofit.Builder()
      .client(client)
      .build()
  }

  fun getOllamaApi() = provideRetrofit().create(OllamaApi::class.java)
}