package com.example.demo1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RatingBar
import android.widget.Toast

class Feedback : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        getSupportActionBar()?.hide()

        val rBar = findViewById<RatingBar>(R.id.ratingBar)
        if (rBar != null) {
            val button = findViewById<Button>(R.id.button7)
            button?.setOnClickListener {
                val msg = rBar.rating.toString()
                Toast.makeText(this@Feedback,
                    "Rating is: "+msg, Toast.LENGTH_SHORT).show()
            }
        }
    }
}