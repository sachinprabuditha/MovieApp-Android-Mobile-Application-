package com.example.filmapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.filmapp.databinding.ActivityFavoriteBinding

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding

    private lateinit var filmArrayList: ArrayList<FavFilm>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.c,
            R.drawable.d,
            R.drawable.jjjjj,
            R.drawable.j,
            R.drawable.i,
            R.drawable.k,
            R.drawable.bk,
            R.drawable.l,

        )

        val name = arrayOf(
            "Luther",
            "Isle of Dogs",
            "Pathan",
            "Mind Cage",
            "The Vanished",
            "Dispecable Me 4",
            "Animal",
            "Tiger 3",

        )

        filmArrayList = ArrayList()
        for (i in name.indices){
            val film = FavFilm(name[i], imageId[i])
            filmArrayList.add(film)
        }

        binding.listViewFav.isClickable = true
        binding.listViewFav.adapter = FavAdapter(this, filmArrayList)




    }
}