package com.example.apptvqbopatrones.apirest

import com.example.apptvqbopatrones.apirest.service.PersonService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private fun builderRetrofit() = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofitService: PersonService by lazy {
        builderRetrofit().create(PersonService::class.java)
    }
}