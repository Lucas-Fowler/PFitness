package com.example.demo1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
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

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "DO NOT JOIN!!!", Toast.LENGTH_SHORT).show()
        }

        val button2 : Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            Toast.makeText(this, "IT'S NOT FREE!!!", Toast.LENGTH_SHORT).show()
        }

        val button4 : Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            intent = Intent( this, Feedback::class.java)
            startActivity(intent)
        }


    }
}