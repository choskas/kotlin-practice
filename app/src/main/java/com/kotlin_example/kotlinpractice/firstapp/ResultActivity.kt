package com.kotlin_example.kotlinpractice.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.kotlin_example.kotlinpractice.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultText = findViewById<TextView>(R.id.resultText)
        val name: String = intent.extras?.getString("Extra_Name").orEmpty()
        resultText.text = "Hola $name"
    }
}