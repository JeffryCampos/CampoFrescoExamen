package com.example.playmaps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        val ButtonInicioAPP = findViewById<Button>(R.id.buttonRegistrar)
        ButtonInicioAPP.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }



    }
}