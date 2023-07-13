package com.kotlin_example.kotlinpractice.imcCalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.kotlin_example.kotlinpractice.R
import com.kotlin_example.kotlinpractice.imcCalculator.IMCActivity.Companion.IMC_KEY

class ResultImcActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)
        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener {
            onBackPressed()
        }
    }

    private fun initUI(result: Double) {
        tvIMC.text = result.toString()
        when (result) {
            // low weight
            in 0.00..18.50 -> {
                tvResult.text = getString(R.string.title_low_weight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.low_weight))
                tvDescription.text = getString(R.string.description_low_weight)
            }
            // normal weight
            in 18.51..24.99 -> {

                tvResult.text = getString(R.string.title_normal_weight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.normal_weight))
                tvDescription.text = getString(R.string.description_normal_weight)
            }
            // over weight
            in 25.00..29.99 -> {

                tvResult.text = getString(R.string.title_over_weight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.over_weight))
                tvDescription.text = getString(R.string.description_over_weight)
            }
            // obseity xd
            in 30.00..99.00 -> {
                tvResult.text = getString(R.string.title_obesity_weight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesity))
                tvDescription.text = getString(R.string.description_obesity_weight)
            }

            else -> {
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesity))
                tvResult.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }

    private fun initComponents() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnReCalculate)
    }
}