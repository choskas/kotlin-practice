package com.kotlin_example.kotlinpractice.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kotlin_example.kotlinpractice.R
import com.kotlin_example.kotlinpractice.imcCalculator.IMCActivity

class MenuActivity : AppCompatActivity() {
    fun navigateToStart() {
        val intent = Intent(this, FirstAppActivity::class.java )
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val button = findViewById<Button>(R.id.btnToSalute)
        val buttonToImc = findViewById<Button>(R.id.btnToIMC)
        buttonToImc.setOnClickListener() {navigateToImc()}
        button.setOnClickListener() {
            navigateToStart()
        }


    }

    private fun navigateToImc() {
        val intent = Intent(this, IMCActivity::class.java)
        startActivity(intent)
    }
}