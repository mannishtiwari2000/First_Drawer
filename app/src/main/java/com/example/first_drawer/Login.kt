package com.example.first_drawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val Login_btn:TextView=findViewById(R.id.Login_Btn)
        Login_btn.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity::class.java))
        }

        val Register_page:TextView=findViewById(R.id.Register_Page)
        Register_page.setOnClickListener {
            startActivity(Intent(baseContext,register::class.java))
        }
    }
}