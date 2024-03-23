package com.example.filmapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

//private lateinit var binding : ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding = ActivityMainBinding.inflate(layoutInflater)

        /*setContentView(binding.root)
        replaceFragment(HomeFragment())*/
        setContentView(R.layout.activity_main)

        /*val homeFragment = HomeFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.mainLayout, homeFragment).commit()*/

        /*binding.bottomnav.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.bottom_home -> replaceFragment(HomeFragment())
                R.id.bottom_fav -> replaceFragment(FavoriteFragment())

                else -> {

                }
            }

            true
        }*/

        val deadpool = findViewById<ImageView>(R.id.deadpool)
        deadpool.setOnClickListener {
            val Intent = Intent(this,DeadPoolActivity::class.java)
            startActivity(Intent)
        }

       val harrypotter = findViewById<ImageView>(R.id.harry)
        harrypotter.setOnClickListener {
            val Intent = Intent(this,HarryPotterActivity::class.java)
            startActivity(Intent)
        }

        val profile = findViewById<ImageView>(R.id.openpr)
        profile.setOnClickListener {
            val Intent = Intent(this,ProfileActivity::class.java)
            startActivity(Intent)
        }

        val CrimeBtn = findViewById<Button>(R.id.editTextText3)
        CrimeBtn.setOnClickListener {
            val Intent = Intent(this,CrimeActivity::class.java)
            startActivity(Intent)
        }

        val DramaBtn = findViewById<Button>(R.id.editTextText4)
        DramaBtn.setOnClickListener {
            val Intent = Intent(this,DramaActivity::class.java)
            startActivity(Intent)
        }

        val DramaBtn2 = findViewById<Button>(R.id.editTextText5)
        DramaBtn2.setOnClickListener {
            val Intent = Intent(this,FavoriteActivity::class.java)
            startActivity(Intent)
        }

    }

    /*private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout,fragment)
        fragmentTransaction.commit()
    }*/
}
