package com.example.playmaps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView




class Menu : AppCompatActivity() {


    private lateinit var carritoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)



        carritoTextView = findViewById(R.id.textView6)

        val ButtonInicioMapa = findViewById<Button>(R.id.InicioMapa)
        ButtonInicioMapa.setOnClickListener {
            val intent = Intent(this, Mapa::class.java)
            startActivity(intent)
        }
    }

    private fun concatenaTexto(texto: String) {

        val textoActual = carritoTextView.text.toString()
        val nuevoTexto = "$textoActual-$texto\n"
        carritoTextView.text = nuevoTexto

    }



    //Ofertas
    fun oferta1(view: View) {



        fun oferta2(view: View) {
            concatenaTexto("Durazno oferta")
        }


    }



    fun oferta2(view: View) {
        concatenaTexto("Tomate oferta")
    }

    fun oferta3(view: View) {
        concatenaTexto("Brocoli oferta")
    }

    fun oferta4(view: View) {
        concatenaTexto("Zanahoria oferta")
    }

    fun oferta5(view: View) {
        concatenaTexto("Sandia oferta")
    }
//Frutas
    fun Manzana (view: View) {
        concatenaTexto("Manzana")
    }

    fun platano (view: View) {
        concatenaTexto("platano")
    }

    fun naranja (view: View) {
        concatenaTexto("naranja")
    }

    fun durazno (view: View) {
        concatenaTexto("durazno")
    }

    fun sandia (view: View) {
        concatenaTexto("sandia")
    }
    //Verduras
    fun zanahoria (view: View) {
        concatenaTexto("zanahoria")
    }

    fun tomate (view: View) {
        concatenaTexto("tomate")
    }

    fun cebolla (view: View) {
        concatenaTexto("cebolla")
    }

    fun brocoli (view: View) {
        concatenaTexto("brocoli")
    }

    fun palta (view: View) {
        concatenaTexto("palta")
    }



}
