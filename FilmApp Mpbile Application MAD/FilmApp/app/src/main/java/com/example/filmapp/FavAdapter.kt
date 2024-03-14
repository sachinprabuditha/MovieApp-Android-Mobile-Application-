package com.example.filmapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FavAdapter(private val context: Activity, private val arrayList: ArrayList<FavFilm>)  : ArrayAdapter<FavFilm>(context,
    R.layout.fav_list,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.fav_list,null)

        val imageView : ImageView = view.findViewById(R.id.favPic)
        val filmName : TextView = view.findViewById(R.id.favName)

        imageView.setImageResource(arrayList[position].imageId)
        filmName.text = arrayList[position].name



        return view
    }
}