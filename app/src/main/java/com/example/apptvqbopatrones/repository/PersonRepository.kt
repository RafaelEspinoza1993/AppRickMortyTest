package com.example.apptvqbopatrones.repository

import androidx.lifecycle.MutableLiveData
import com.example.apptvqbopatrones.apirest.RetrofitClient
import com.example.apptvqbopatrones.apirest.response.PersonResult
import com.example.apptvqbopatrones.apirest.response.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PersonRepository {

    var result = MutableLiveData<List<Result>>()

    fun personList(): MutableLiveData<List<Result>>{
        val call : Call<PersonResult> = RetrofitClient.retrofitService.personList()
        call.enqueue(object : Callback<PersonResult>{

            override fun onResponse(call: Call<PersonResult>, response: Response<PersonResult>) {
                result.value = response.body()!!.results
            }

            override fun onFailure(call: Call<PersonResult>, t: Throwable) {

            }

        })
        return result
    }
}