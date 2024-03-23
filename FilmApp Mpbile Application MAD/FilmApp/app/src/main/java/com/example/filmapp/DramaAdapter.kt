package com.example.filmapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class DramaAdapter(private val dramaList: ArrayList<DramaImage>) : RecyclerView.Adapter<DramaAdapter.DramaviewHolder>(){
    class DramaviewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val dimageView : ImageView = itemView.findViewById(R.id.cardfilm)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DramaviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.film_cards , parent ,false)
        return DramaviewHolder(view)
    }

    override fun getItemCount(): Int {
        return dramaList.size
    }

    override fun onBindViewHolder(holder: DramaviewHolder, position: Int) {
        val crime = dramaList[position]
        holder.dimageView.setImageResource(crime.dimage)

    }
}
