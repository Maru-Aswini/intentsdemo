package com.happiestminds.intentsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class anotherActivity : AppCompatActivity() {
    lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        titleTextView = findViewById(R.id.titleT)

       val name = intent.getStringExtra("username")
        val email = intent.getStringExtra("useremail")

        titleTextView.text ="Name: $name\n Email: $email"
    }
}