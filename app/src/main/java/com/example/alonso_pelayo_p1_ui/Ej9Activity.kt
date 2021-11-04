package com.example.alonso_pelayo_p1_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Ej9Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej9)

        val aceptar = findViewById<Button>(R.id.buttonGuardar)
        val cancelar = findViewById<Button>(R.id.buttonCancelar)
        val texto = findViewById<EditText>(R.id.editText)

        cancelar.setOnClickListener {
            texto.text.clear()
        }

        aceptar.setOnClickListener {
            Toast.makeText(this, "El texto se ha guardado", Toast.LENGTH_SHORT).show()

        }



    }
}