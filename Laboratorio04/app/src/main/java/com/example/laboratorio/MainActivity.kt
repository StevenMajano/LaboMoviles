package com.example.laboratorio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombreEditText = findViewById<EditText>(R.id.nombre_edit_text)
        val correoEditText = findViewById<EditText>(R.id.correo_edit_text)
        val telefonoEditText = findViewById<EditText>(R.id.celular_edit_text)
        val button = findViewById<Button>(R.id.guardar_button)

        button.setOnClickListener {
            val nombreValue = nombreEditText.text.toString()
            val correoValue = correoEditText.text.toString()
            val telefonoValue = telefonoEditText.text.toString()

            val secondActivityIntent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra("key_nombre", nombreValue)
            secondActivityIntent.putExtra("key_correo", correoValue)
            secondActivityIntent.putExtra("key_telefono", telefonoValue)
            startActivity(secondActivityIntent)
        }
    }
}