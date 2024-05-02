package com.example.demo1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.RatingBar
import android.widget.Toast


class Feedback : AppCompatActivity() {
    private val handler = Handler()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        getSupportActionBar()?.hide()

        val rBar = findViewById<RatingBar>(R.id.ratingBar)

        val progressBar = findViewById(R.id.progress_Bar) as ProgressBar

        val text1 = findViewById<EditText>(R.id.first)

        val text2 = findViewById<EditText>(R.id.second)

        var i = 0

        i = progressBar.progress

        var flag1 = true
        var flag2 = true
        var flag3 = true

        text1.setOnClickListener {
            if (flag1) {
                i += 33
                println("first")
                handler.post(Runnable {
                    progressBar.progress = i
                })
            }
            flag1 = false
        }

        text2.setOnClickListener {
            if (flag2) {
                i += 33
                println("second")
                handler.post(Runnable {
                    progressBar.progress = i
                })
            }
            flag2 = false
        }



        val button = findViewById<Button>(R.id.button7)

        button.setOnClickListener {
            if (i == 99) {
                val msg = rBar.rating.toString()
                Toast.makeText(this@Feedback,
                    "Rating is: "+msg, Toast.LENGTH_SHORT).show()
                text1.setText("")
                text2.setText("")
                rBar.rating = 0.0F
                i = 0
                flag1 = true
                flag2 = true
                flag3 = true
            }
        }

    }

}

