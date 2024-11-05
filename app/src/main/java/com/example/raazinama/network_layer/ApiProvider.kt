package com.example.raazinama.network_layer

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiProvider {
    fun ProvideApi() = Retrofit.Builder().baseUrl(BASE_URL).client(OkHttpClient.Builder().build())
        .addConverterFactory(GsonConverterFactory.create()).build().create(ApiServices::class.java)
}