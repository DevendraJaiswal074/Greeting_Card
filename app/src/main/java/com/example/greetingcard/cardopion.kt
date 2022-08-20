package com.example.greetingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class cardopion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardopion)

       val buttan= findViewById<Button>(R.id.text2)

       val buttan1= findViewById<Button>(R.id.text3)

       val buttan2= findViewById<Button>(R.id.text4)

       //val buttan3= findViewById<Button>(R.id.pp)


           buttan.setOnClickListener()
           {
               val intent=Intent(this, MainActivity::class.java)
               startActivity(intent)
           }


            buttan1.setOnClickListener()
            {
                val intent = Intent(this, newyear::class.java)  //anvisar
                startActivity(intent)
            }

        buttan2.setOnClickListener()
        {
            val intent = Intent(this, new1::class.java)
            startActivity(intent)
        }

    }



}



