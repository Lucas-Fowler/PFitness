package com.example.demo1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.RatingBar
import android.widget.Toast


class Feedback : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        getSupportActionBar()?.hide()

        val rBar = findViewById<RatingBar>(R.id.ratingBar)

        val button = findViewById<Button>(R.id.button7)

        var flag : Boolean = false

        button.setOnClickListener {
            val msg = rBar.rating.toString()
            Toast.makeText(this@Feedback,"Rating is: " + msg, Toast.LENGTH_SHORT).show()
        }

        val back = findViewById<ImageButton>(R.id.imageButton11)

        back.setOnClickListener {
            intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}

