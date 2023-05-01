package com.example.apptvqbopatrones.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.apptvqbopatrones.apirest.response.Result
import com.example.apptvqbopatrones.repository.PersonRepository

class PersonViewModel : ViewModel(){

    private var repository = PersonRepository()

    fun personList(): LiveData<List<Result>>{
        return repository.personList()
    }

}