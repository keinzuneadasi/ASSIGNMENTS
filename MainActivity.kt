package com.example.firstappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ima = findViewById<ImageView>(R.id.imagery)
        val butt = findViewById<Button>(R.id.buttona)
        val text = findViewById<TextView>(R.id.texta)
        val text2 = findViewById<TextView>(R.id.texta2)
        val ima2 = findViewById<ImageView>(R.id.imagery2)
        val ima3 = findViewById<ImageView>(R.id.imagery3)

       butt.setOnClickListener {
           ima.visibility = View.VISIBLE
           ima2.visibility = View.VISIBLE
           text2.visibility = View.VISIBLE
           ima3.visibility = View.GONE
           butt.visibility = View.GONE
       }


    }
}