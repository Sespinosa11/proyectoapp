package com.example.firebase


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class VentanaDos : AppCompatActivity() {
    var buttonH2: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_dos)
        val textH = findViewById<View>(R.id.TextH) as TextView;
        val nombre = intent.extras?.get("textU")
        val valor = intent.extras?.get("valor")
        buttonH2 = findViewById(R.id.buttonH2)


        Log.i("correcto", valor.toString())
        textH.setText("Bienvenido " + nombre + " a DistriCorabastos")

        buttonH2?.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }

    }
}