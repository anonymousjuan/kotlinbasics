package com.example.kotlinbasics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var inputBox: TextView
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.inputBox1)
        val myButton = findViewById<Button>(R.id.btnSend)
        val show = findViewById<TextView>(R.id.inputBox)

        myButton.setOnClickListener{
            val retrievedInput = myTextView.text.toString()
            show.text = retrievedInput

        }


    }
}