package com.rafif.recyclerview.secondrecyclerview

import com.rafif.recyclerview.R

object DataBike {

    private val nameBike = arrayOf(
        "Bike 1",
        "Bike 2",
        "Bike 3"
    )
    private val imgBike = intArrayOf(
        R.drawable.bike1,
        R.drawable.bike2,
        R.drawable.bike3
    )

    val listData: ArrayList<Image>
    get() {
        val list = arrayListOf<Image>()
        for (position in nameBike.indices) {
            val motor = Image(
                title = nameBike[position],
                imageSrc = imgBike[position]
            )
            list.add(motor)
        }
        return list
    }
}