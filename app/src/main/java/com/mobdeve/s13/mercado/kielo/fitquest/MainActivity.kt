package com.mobdeve.s13.mercado.kielo.fitquest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGetStarted = findViewById<Button>(R.id.btn_getStarted)
        btnGetStarted.setOnClickListener {
            openDashboard()
        }
    }

    private fun openDashboard() {
        val intent = Intent(this, Dashboard::class.java)
        startActivity(intent)
    }
}