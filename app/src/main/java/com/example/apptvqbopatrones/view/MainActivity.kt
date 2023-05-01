package com.example.apptvqbopatrones.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.apptvqbopatrones.R
import com.example.apptvqbopatrones.databinding.ActivityMainBinding
import com.example.apptvqbopatrones.view.adapter.PersonAdapter
import com.example.apptvqbopatrones.viewmodel.PersonViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var personViewModel: PersonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        personViewModel = ViewModelProvider(this).get(PersonViewModel::class.java)
        binding.rvperson.layoutManager = GridLayoutManager(applicationContext, 2)
        personViewModel.personList().observe(this, Observer {
            binding.rvperson.adapter = PersonAdapter(it)
        })
    }
}