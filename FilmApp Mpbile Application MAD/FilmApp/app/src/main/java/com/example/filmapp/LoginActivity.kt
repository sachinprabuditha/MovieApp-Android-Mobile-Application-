package com.example.filmapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameInput = findViewById(R.id.editTextText)
        passwordInput = findViewById(R.id.editTextPassword)
        loginBtn = findViewById(R.id.loginBtn)

        loginBtn.setOnClickListener {

                if (usernameInput.text.toString() == "user" && passwordInput.text.toString() == "1234"){
                    Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
                    val loginBtn = findViewById<Button>(R.id.loginBtn)

                        val Intent = Intent(this,MainActivity::class.java)
                        startActivity(Intent)
                } else {
                    Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
                }
        }
    }
}
