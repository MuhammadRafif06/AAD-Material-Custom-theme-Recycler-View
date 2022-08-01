package com.rafif.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rafif.recyclerview.databinding.ActivityFirstBinding
import com.rafif.recyclerview.databinding.ActivityMainBinding
import com.rafif.recyclerview.firstrecyclerview.FirstActivity
import com.rafif.recyclerview.secondrecyclerview.MainActivity
import com.rafif.recyclerview.thirdrecyclerview.ThirdActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstRecyclerView.setOnClickListener{
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }

        binding.secondRecyclerView.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.thirdRecyclerView.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}