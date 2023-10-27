package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablelayout)
        setTitle("TableLayout")


        val VisButton1: Button = findViewById(R.id.visButton1)
        val VisButton2: Button = findViewById(R.id.visButton2)
        VisButton1.setOnClickListener(){
            VisButton2.visibility = VISIBLE
            VisButton1.visibility = INVISIBLE
        }
        VisButton2.setOnClickListener(){
            VisButton1.visibility = VISIBLE
            VisButton2.visibility = INVISIBLE
        }



    }
}