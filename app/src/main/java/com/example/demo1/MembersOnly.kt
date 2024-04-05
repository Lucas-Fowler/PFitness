package com.example.demo1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MembersOnly : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_members_only)
        getSupportActionBar()?.hide()

        val homebutton : ImageButton = findViewById(R.id.homebtn)
        val tutorialsbutton : ImageButton = findViewById(R.id.tutorialbtn)
        val securebutton : ImageButton = findViewById(R.id.lockedbtn)

        val home : Button = findViewById(R.id.button3)

        home.setOnClickListener {
            intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}