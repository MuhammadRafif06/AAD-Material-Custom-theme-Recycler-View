package com.rafif.recyclerview.firstrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rafif.recyclerview.R
import com.rafif.recyclerview.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalList = AnimalModel(this).getAnimalList()
        binding.recyclerView.adapter = AnimalAdapter(animalList)
    }
}