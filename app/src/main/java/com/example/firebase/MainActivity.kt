package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    var botonAutenticar: Button?=null;
    private var mAuth: FirebaseAuth? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth = FirebaseAuth.getInstance();
        botonAutenticar=findViewById(R.id.buttonA)
        botonAutenticar?.setOnClickListener {
            mAuth!!.signInWithEmailAndPassword("sergioa.espinosac@utadeo.edu.co","12345678").addOnCompleteListener(
                this
            ){task->
                if (task.isSuccessful){
                    val user=mAuth!!.currentUser
                    Toast.makeText(this,"Usuario autenticado con exito",Toast.LENGTH_SHORT).show()
                }else{
                    Log.e("Autenticacion","Fallo en autenticacion")
                    Toast.makeText(this,"Conexion fallidas",Toast.LENGTH_SHORT)
                }
            }
        }
    }
}