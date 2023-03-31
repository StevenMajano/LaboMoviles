package com.example.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultado: TextView
    private lateinit var cincocentavos: ImageView
    private lateinit var diezcentavos: ImageView
    private lateinit var cora: ImageView
    private lateinit var dollar: ImageView

    var result = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        sum()
    }

    private fun bind() {
        resultado = findViewById(R.id.resultado)
        cincocentavos = findViewById(R.id.cincocentavos)
        diezcentavos = findViewById(R.id.diezcentavos)
        cora = findViewById(R.id.cora)
        dollar = findViewById(R.id.dollar)
    }

    private fun sum() {
        cincocentavos.setOnClickListener {
            result += 0.05
            resultado.text = result.toString()
        }

        diezcentavos.setOnClickListener {
            result += 0.10
            resultado.text = result.toString()
        }
        cora.setOnClickListener {
            result += 0.25
            resultado.text = result.toString()


        }

        dollar.setOnClickListener {
            result += 1.00
            resultado.text = result.toString()
        }
    }
}