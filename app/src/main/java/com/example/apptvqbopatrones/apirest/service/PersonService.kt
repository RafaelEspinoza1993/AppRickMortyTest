package com.example.apptvqbopatrones.apirest.service

import com.example.apptvqbopatrones.apirest.response.PersonResult
import retrofit2.Call
import retrofit2.http.GET

interface PersonService {

    @GET("character")
    fun personList(): Call<PersonResult>

}