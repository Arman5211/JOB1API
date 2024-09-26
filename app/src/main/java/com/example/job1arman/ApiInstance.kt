package com.example.job1arman

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstance {
    fun getProducts(): Any {

    }

    val retoFit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retoFit.create(ApiService::class.java)

}