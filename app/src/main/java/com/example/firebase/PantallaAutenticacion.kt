package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.content_pantalla_autenticacion.*

class PantallaAutenticacion : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_autenticacion)
        setSupportActionBar(toolbar)

        var textoUno: TextView = findViewById(R.id.saludo)
        val instanciaFirestore = FirebaseFirestore.getInstance()

        instanciaFirestore.collection("prueba")
            .add(mapOf("cedula" to 1003522752, "nombre" to "sergio"))
            .addOnSuccessListener {
                instanciaFirestore.collection("prueba").document(it.id)
                    .update(mapOf("idDoc" to it.id))
            }.addOnFailureListener {
                Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
            }

        instanciaFirestore.collection("prueba").whereEqualTo("nombre", "FFF").get()
            .addOnSuccessListener {
                it.documents.forEach {
                    Log.i("items", it.data.toString())
                    Log.i("dato_ejemplo", it?.data?.get("cedula").toString())
                    textoUno.text = it?.data?.get("cedula").toString()

                }
            }

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navigationView: NavigationView = findViewById(R.id.navigation_menu)
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.abrir, R.string.cerrar)
        toggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.nav_home -> Toast.makeText(
                    applicationContext,
                    "Cliqueado Inicio",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_lacteos -> Toast.makeText(
                    applicationContext,
                    "Cliqueado Lacteos",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_frutas -> Toast.makeText(
                    applicationContext,
                    "Cliqueado Frutas",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_vegetales -> Toast.makeText(
                    applicationContext,
                    "Cliqueado Vegetales",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_carnes -> Toast.makeText(
                    applicationContext,
                    "Cliqueado Carnes",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nav_settings -> Toast.makeText(
                    applicationContext,
                    "Cliqueado Configuración",
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}