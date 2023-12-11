package com.example.playmaps


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val navegacion = Intent(this@MainActivity, Login1::class.java)
            startActivity(navegacion)
            finish()
        }, 4000)
    }


    }
