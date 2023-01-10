package com.example.essential

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnclickme = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesclicked = 0
        btnclickme.setOnClickListener {
            timesclicked = timesclicked +1

            tvMyTextView.text = timesclicked.toString()
            Toast.makeText(this, "Oh it's  increasing :0 ! ", Toast.LENGTH_SHORT).show()

        }

    }


    }
