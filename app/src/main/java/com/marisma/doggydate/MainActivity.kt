package com.marisma.doggydate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAnswer = findViewById<Button>(R.id.button3)
        btnAnswer.setOnClickListener {
            goToElection()
        }
    }

    fun goToElection() {
        //crear el intent
        val intent = Intent(this, CreditActivity::class.java)
        //tomar el valor del cuadro de texto.
        val etNombre = this.findViewById<EditText>(R.id.editText)
        //añadimos la información necesaria al intent
        intent.putExtra("nombre", etNombre.text.toString())
        //iniciar la nueva actividad
        startActivity(intent)
    }
}