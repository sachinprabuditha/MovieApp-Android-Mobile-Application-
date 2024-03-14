package com.example.filmapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CrimeAdapter(private val crimeList: ArrayList<CrimeImage>) : RecyclerView.Adapter<CrimeAdapter.CrimeviewHolder>(){
    class CrimeviewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.cardfilm)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrimeviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.film_cards , parent ,false)
        return CrimeviewHolder(view)
    }

    override fun getItemCount(): Int {
        return crimeList.size
    }

    override fun onBindViewHolder(holder: CrimeviewHolder, position: Int) {
        val crime = crimeList[position]
        holder.imageView.setImageResource(crime.image)


    }
}