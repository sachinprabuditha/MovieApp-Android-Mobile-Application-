package com.example.filmapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DramaActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dramaList: ArrayList<DramaImage>
    private lateinit var dramaAdapter: DramaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama)
        inits()
    }
    private fun inits(){
        recyclerView = findViewById(R.id.drama)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        dramaList = ArrayList()
        addDataToList()

        dramaAdapter = DramaAdapter(dramaList)
        recyclerView.adapter = dramaAdapter
    }

    private fun addDataToList(){
        dramaList.add(DramaImage(R.drawable.kk))
       dramaList.add(DramaImage(R.drawable.m))
       dramaList.add(DramaImage(R.drawable.k))
        dramaList.add(DramaImage(R.drawable.b))
        dramaList.add(DramaImage(R.drawable.j))
        dramaList.add(DramaImage(R.drawable.e))
        dramaList.add(DramaImage(R.drawable.d))
        dramaList.add(DramaImage(R.drawable.a))
        dramaList.add(DramaImage(R.drawable.bbbbb))
        dramaList.add(DramaImage(R.drawable.filmteaser))
        dramaList.add(DramaImage(R.drawable.rrrrr))
        dramaList.add(DramaImage(R.drawable.jjjjj))
    }
}