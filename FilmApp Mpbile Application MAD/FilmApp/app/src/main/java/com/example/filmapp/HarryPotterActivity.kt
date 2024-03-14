package com.example.filmapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HarryPotterActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harry_potter)

        val harryBtn = findViewById<Button>(R.id.harryWatch)
        harryBtn.setOnClickListener {
            val Intent = Intent(this,PlayStreamActivity::class.java)
            startActivity(Intent)
        }
    }
}