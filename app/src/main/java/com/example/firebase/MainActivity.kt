package com.example.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    var botonAutenticar: Button?=null;
    //var editUsuario:EditText?=null;
    //var editPassword:EditText?=null;
    private var mAuth: FirebaseAuth? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth = FirebaseAuth.getInstance();
        botonAutenticar=findViewById(R.id.botonAutenticarse)
        var editUsuario:EditText =findViewById(R.id.escribirCorreo)
        var editPassword:EditText=findViewById(R.id.escribirCont)

        botonAutenticar?.setOnClickListener {
            mAuth!!.signInWithEmailAndPassword(editUsuario.text.toString(),editPassword.text.toString()).addOnCompleteListener(
                this
            ){task->
                if (task.isSuccessful){
                    val user=mAuth!!.currentUser
                    Toast.makeText(this,"Usuario autenticado con exito",Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, PantallaAutenticacion::class.java).putExtra("uid",user?.uid ) )
                }else{
                    Log.e("Autenticacion","Fallo en autenticacion")
                    Toast.makeText(this,"Conexion fallidas",Toast.LENGTH_SHORT)
                }
            }
        }
    }
}