package com.kotlin_example.kotlinpractice.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.kotlin_example.kotlinpractice.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        // ejecutar aqui cosas al arrancar pantalla
        val btn = findViewById<AppCompatButton>(R.id.buttonExample)
        val editTextInput = findViewById<AppCompatEditText>(R.id.otroButton)
        btn.setOnClickListener {
          val name = editTextInput.text.toString()

            if (name.isNotEmpty()){
                    val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("Extra_Name", name)
                startActivity(intent)

            }
        }

    }
}