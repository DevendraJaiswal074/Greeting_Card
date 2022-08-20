package com.example.greetingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class anivarsarcard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anivarsarcard2)

        val name = intent.getStringExtra("one")
        val name2 = findViewById<TextView>(R.id.op)
        name2.text = "\n $name!"
    }
}