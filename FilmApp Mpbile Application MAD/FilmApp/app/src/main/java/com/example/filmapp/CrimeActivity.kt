package com.example.filmapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CrimeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var crimeList: ArrayList<CrimeImage>
    private lateinit var crimeAdapter: CrimeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crime)

        init()
    }
    private fun init(){
        recyclerView = findViewById(R.id.crime)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        crimeList = ArrayList()
        addDataToList()

        crimeAdapter = CrimeAdapter(crimeList)
        recyclerView.adapter = crimeAdapter
    }

    private fun addDataToList(){
        crimeList.add(CrimeImage(R.drawable.a))
        crimeList.add(CrimeImage(R.drawable.b))
        crimeList.add(CrimeImage(R.drawable.c))
        crimeList.add(CrimeImage(R.drawable.d))
        crimeList.add(CrimeImage(R.drawable.e))
        crimeList.add(CrimeImage(R.drawable.f))
        crimeList.add(CrimeImage(R.drawable.ggggg))
        crimeList.add(CrimeImage(R.drawable.images))
        crimeList.add(CrimeImage(R.drawable.bbbbb))
        crimeList.add(CrimeImage(R.drawable.filmteaser))
        crimeList.add(CrimeImage(R.drawable.rrrrr))
        crimeList.add(CrimeImage(R.drawable.jjjjj))
    }
}