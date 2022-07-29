package com.rafif.recyclerview.secondrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rafif.recyclerview.R
import com.rafif.recyclerview.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {

    private lateinit var rvBike: RecyclerView
    private var list: ArrayList<Image> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        rvBike = findViewById(R.id.imagesRecyclerView)
        rvBike.setHasFixedSize(true)

        list.addAll(DataBike.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBike.layoutManager = LinearLayoutManager(this)
        val listBikeAdapter = ImageAdapter(list)
        rvBike.adapter = listBikeAdapter
    }
}