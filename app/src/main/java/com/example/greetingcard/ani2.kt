package com.example.greetingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ani2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ani2)

        val name =intent.getStringExtra("mm")
        val name2 =findViewById<TextView>(R.id.oo)
        name2.text ="\n $name!"
    }
}