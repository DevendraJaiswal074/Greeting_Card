package com.example.greetingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class newyear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newyear)



        val button=findViewById<Button>(R.id.next_activity)

        button.setOnClickListener()
        {
            val one = findViewById<EditText>(R.id.nine)

            val user = one.editableText.toString()

            val intent = Intent(this, anivarsarcard2::class.java);
            intent.putExtra("one", user)
            startActivity(intent)
        }
    }
}