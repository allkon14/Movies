package com.example.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter (private var title: List<String>, private var score: List<String>,private var images: List<Int>):RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder> (){

    inner class Pager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val itemTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val itemScore: TextView = itemView.findViewById(R.id.tvScore)
        val itemImage: ImageView = itemView.findViewById(R.id.ivImage)

        init{
            itemImage.setOnClickListener(){}
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_pages, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {

        holder.itemTitle.text = title[position]
        holder.itemScore.text = score[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

}