package com.example.apptvqbopatrones.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apptvqbopatrones.apirest.response.Result
import com.example.apptvqbopatrones.databinding.PersonItemBinding

class PersonAdapter(private val listPerson : List<Result>) : RecyclerView.Adapter<PersonAdapter.ViewHolder>()
{
    inner class ViewHolder(val binding: PersonItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonAdapter.ViewHolder {
        val binding = PersonItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonAdapter.ViewHolder, position: Int) {
        with(holder){
            with(listPerson[position]){
                binding.tvnombre.text = name
                binding.tvgenero.text = gender
            }
        }
    }

    override fun getItemCount() = listPerson.size

}