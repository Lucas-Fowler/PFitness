package com.example.demo1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Tutorials : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorials)
        getSupportActionBar()?.hide()

        val homebutton : ImageButton = findViewById(R.id.homebtn)
        val tutorialsbutton : ImageButton = findViewById(R.id.tutorialbtn)
        val securebutton : ImageButton = findViewById(R.id.lockedbtn)

        homebutton.setOnClickListener {
            intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        tutorialsbutton.setOnClickListener {
            intent = Intent(this, Tutorials::class.java)
            startActivity(intent)
        }
        securebutton.setOnClickListener {
            intent = Intent(this, MembersOnly::class.java)
            startActivity(intent)
        }
    }
}