package com.example.demo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Sign_Up : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        getSupportActionBar()?.hide()

        val signup : Button = findViewById(R.id.loginbtn2)

        var newusername : EditText = findViewById(R.id.first2)
        var newpassword : EditText = findViewById(R.id.password2)
        var confirmpassword : EditText = findViewById(R.id.password3)

        var iscomplete : Boolean = false
        var samepassword : Boolean = false



        signup.setOnClickListener {
            if (newusername.text.toString() != "" && newpassword.text.toString() != "" && confirmpassword.text.toString() != "") {
                iscomplete = true
                if (newpassword.text.toString() == confirmpassword.text.toString()) {
                    samepassword = true
                } else {
                    Toast.makeText(this, "Please check your password", Toast.LENGTH_SHORT).show()
                }
            } else if (confirmpassword.text.toString() == "") {
                Toast.makeText(this, "Please confirm your password", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please type in your new login information.", Toast.LENGTH_SHORT).show()
            }
            if (iscomplete == true && samepassword == true) {
                users.add(User(newusername.text.toString(), newpassword.text.toString()))
                Log.d(users[1].username, users[1].password)
                Toast.makeText(this, "Account has been created.", Toast.LENGTH_SHORT).show()
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

    }
}