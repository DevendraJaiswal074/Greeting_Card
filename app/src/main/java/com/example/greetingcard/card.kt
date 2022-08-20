package com.example.greetingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        val name2 = intent.getStringExtra("name")
        val text2 = findViewById<TextView>(R.id.three)
        text2.text = "\n $name2!"


    }
}