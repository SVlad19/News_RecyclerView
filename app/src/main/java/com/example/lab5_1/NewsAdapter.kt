package com.example.lab5_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView


class NewsAdapter(val listNews: ArrayList<News>,val context: Context): RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news,parent,false))
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.header.text = listNews[position].header
        holder.description.text = listNews[position].description
        holder.image.setImageBitmap(listNews[position].image)
    }
}

class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val image: ImageView = itemView.findViewById(R.id.ivNews)
    val header: TextView = itemView.findViewById(R.id.tvHeader)
    val description: TextView = itemView.findViewById(R.id.tvDescription)
}