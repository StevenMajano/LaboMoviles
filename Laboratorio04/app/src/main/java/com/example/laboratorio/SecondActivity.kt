package com.example.laboratorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nombreView = findViewById<TextView>(R.id.nombre_text_view)
        val correoView = findViewById<TextView>(R.id.correo_text_view)
        val telefonoView = findViewById<TextView>(R.id.telefono_text_view)

        val compartirButton = findViewById<Button>(R.id.compartir_button)

        val nombreValue = intent.getStringExtra("key_nombre")
        val correoValue = intent.getStringExtra("key_correo")
        val telefonoValue = intent.getStringExtra("key_telefono")

        nombreView.text = nombreValue
        correoView.text = correoValue
        telefonoView.text = telefonoValue

        compartirButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Name: $nombreValue\nEmail: $correoValue\nCellPhone: $telefonoValue")
            startActivity(Intent.createChooser(shareIntent,"Share to:"))
        }
    }
}