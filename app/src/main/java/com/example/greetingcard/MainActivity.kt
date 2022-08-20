package com.example.greetingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button=findViewById<Button>(R.id.buttom)

        button.setOnClickListener()
        {
            val name=findViewById<EditText>(R.id.input)

            val user=name.editableText.toString()

            val intent= Intent(this,card::class.java);
            intent.putExtra("name",user)
            startActivity(intent)

        }
    }
}