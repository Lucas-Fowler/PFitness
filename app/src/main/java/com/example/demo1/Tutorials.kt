package com.example.demo1

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView


class Tutorials : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    lateinit var webView: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorials)
        getSupportActionBar()?.hide()

        webView = findViewById<WebView>(R.id.web) as WebView

        webView.loadUrl("https://www.planetfitness.com/")

        webView.settings.javaScriptEnabled = true

        webView.webViewClient = WebViewClient()

        webView.settings.setSupportZoom(true)

        val videoView = findViewById<VideoView>(R.id.video)
        val packageName = "android.resource://" + getPackageName() + "/" + R.raw.tour
        val uri = Uri.parse(packageName)
        videoView.setVideoURI(uri)
        videoView.start()
//        val mediaController = MediaController(this)
//        videoView.setMediaController(mediaController)


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
        val logout = findViewById<ImageButton>(R.id.logoutbox2)
        logout.setOnClickListener {
            intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            finish()
        }
    }
}