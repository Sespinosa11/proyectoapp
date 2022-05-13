package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore

class PantallaAutenticacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_autenticacion)
        var textoUno: TextView =findViewById(R.id.textView2)
        val instanciaFirestore = FirebaseFirestore.getInstance();
        instanciaFirestore.collection("prueba").add(mapOf("cedula" to 1003522752, "nombre" to "sergio"))
            .addOnSuccessListener {
                instanciaFirestore.collection("prueba").document(it.id).update(mapOf("idDoc" to it.id))
            }.addOnFailureListener {
                Toast.makeText(this,it.message, Toast.LENGTH_SHORT).show()
            }

        instanciaFirestore.collection("prueba").whereEqualTo("nombre", "FFF").get().addOnSuccessListener {
            it.documents.forEach{
                Log.i("items",it.data.toString())
                Log.i("dato_ejemplo",it?.data?.get("cedula").toString())
                textoUno.text=it?.data?.get("cedula").toString()

            }
        }
    }
}
