package com.example.demo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.PopupWindow
import android.widget.TextView
import android.widget.Toast

open class MainActivity : AppCompatActivity() {
    open var users: ArrayList<User> = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()

        val button: Button = findViewById(R.id.loginbtn)

        var userName: EditText = findViewById(R.id.first)
        var passWord: EditText = findViewById(R.id.password)

        users.add(User("lucas", "fowler"))
        var flag : Boolean? = null


        val window = PopupWindow(this)
        val view = layoutInflater.inflate(R.layout.layout_popup, null)
        window.contentView = view


        val goback: Button = view.findViewById(R.id.button8)
        val newAccount: Button = view.findViewById(R.id.button9)


        button.setOnClickListener {
            Log.d("# of Users", users.size.toString())
            for (x in users) {
                Log.d(x.username, x.password)
                if (x.username == userName.text.toString() && x.password == passWord.text.toString()) {
                    flag = true
                }
            }
            if (userName.text.toString() == "" && passWord.text.toString() == "") {
                flag = null
            } else {
                flag = false
            }
            if (flag == true) {
                intent = Intent(this, Home::class.java)
                startActivity(intent)
            } else if (flag == false) {
                window.showAtLocation(view, Gravity.CENTER, 0, 0)
                newAccount.setOnClickListener {
                    intent = Intent(this, Sign_Up::class.java)
                    startActivity(intent)
                }
                goback.setOnClickListener {
                    window.dismiss()
                }
            } else {
                Toast.makeText(this, "Please type in your username and password!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    class User {
        var username: String = ""
        var password: String = ""

        constructor(name: String, word: String) {
            username = name
            password = word
        }

    }

}