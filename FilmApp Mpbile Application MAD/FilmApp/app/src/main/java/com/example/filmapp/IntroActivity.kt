package com.example.filmapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val getStartBtn = findViewById<Button>(R.id.GetInBtn)
        getStartBtn.setOnClickListener {
            val Intent = Intent(this,LoginActivity::class.java)
            startActivity(Intent)
        }
    }
}