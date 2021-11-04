package com.example.alonso_pelayo_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)



        button1.setOnClickListener {
            val intent = Intent(this, Ej1Activity::class.java)
            startActivity(intent)

        }

        button2.setOnClickListener {
            val intent = Intent(this, Ej2Activity::class.java)
            startActivity(intent)

        }

        button9.setOnClickListener {
            val intent = Intent(this, Ej9Activity::class.java)
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent= Intent(this, Ej10Activity::class.java)
            startActivity(intent)
        }

    }
}