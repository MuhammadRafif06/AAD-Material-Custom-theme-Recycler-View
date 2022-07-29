package com.rafif.recyclerview.secondrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rafif.recyclerview.R

class ImageAdapter(private val listBike: ArrayList<Image>): RecyclerView.Adapter<ImageAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgBike: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_images, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val bike = listBike[position]
        Glide.with(holder.itemView.context)
            .load(bike.imageSrc)
            .apply(RequestOptions().override(150, 150))
            .into(holder.imgBike)
        holder.tvName.text = bike.title

    }

    override fun getItemCount(): Int {
        return listBike.size
    }
}