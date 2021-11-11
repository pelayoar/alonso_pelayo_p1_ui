package com.example.alonso_pelayo_p1_ui

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import com.google.android.material.snackbar.Snackbar

class Ej10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej10)



        val trueUser = "user"
        val truePass = "demouser"

        val login = findViewById<Button>(R.id.buttonLogin)
        val user = findViewById<EditText>(R.id.textUser)
        val password = findViewById<EditText>(R.id.textPassword)
        val recover = findViewById<TextView>(R.id.forgotPass)

        

        login.setOnClickListener {
            var usuario : String = user.text.toString()
            var pass : String = password.text.toString()

            if(password.text.toString() == "" || password.text.toString() == ""){
                Toast.makeText(this, "Los campos no pueden estar vacíos", Toast.LENGTH_LONG).show()
            }else if (password.text.length < 7) {
                Toast.makeText(this, "La contraseña debe tener al menos 8 caracteres", Toast.LENGTH_LONG).show()
            }else{
                if (usuario == trueUser && pass == truePass) {
                    Toast.makeText(this, "CONTRASEÑA CORRECTA", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "ERROR, PRUEBE OTRA VEZ", Toast.LENGTH_SHORT).show()
                }
            }
        }

        recover.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("Recuperar contraseña")
            builder.setMessage("Introduzca su e-mail")
            val input = EditText(this)
            builder.setView(input)
            builder.setNegativeButton("Cancelar", null)


            builder.setPositiveButton("Aceptar", DialogInterface.OnClickListener { dialogInterface, i -> Toast.makeText(this, "Se ha enviado un correo al correo introducido", Toast.LENGTH_SHORT).show() })



            val dialog = builder.create()
            dialog.show()



        }



    }
}