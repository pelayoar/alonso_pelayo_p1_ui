package com.example.alonso_pelayo_p1_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.alonso_pelayo_p1_ui.databinding.ActivityPantallaLibroBinding

class PantallaLibro : AppCompatActivity() {

    private lateinit var binding : ActivityPantallaLibroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityPantallaLibroBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonAceptar.setOnClickListener {

            val autor = binding.textAutor.text
            val titulo = binding.textTitulo.text

            binding.radioGroupTema.



        }


    }
}