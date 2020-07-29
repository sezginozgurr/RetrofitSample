package com.example.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Network {
    fun getClient() {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https:/api.github.com/")
            .addConverterFactory(GsonConverterFactory.create()).build()

        val service = retrofit.create(ApiService::class.java)
    }
}
