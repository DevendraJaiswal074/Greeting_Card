package com.example.greetingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class new1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new1)


        val button = findViewById<Button>(R.id.ii)

        button.setOnClickListener()
        {
            val one = findViewById<EditText>(R.id.two)

            val user = one.editableText.toString()

            val intent = Intent(this, ani2::class.java);
            intent.putExtra("mm", user)
            startActivity(intent)


        }
    }
}