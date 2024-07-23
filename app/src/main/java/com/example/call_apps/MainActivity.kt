package com.example.call_apps

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSendToCalculator = findViewById<Button>(R.id.btnSendToCalculator)
        val btnSendToSpinner = findViewById<Button>(R.id.btnSendToSpinner)

        btnSendToCalculator.setOnClickListener {
            // Create an Intent to open Calculator app
            val intent = Intent().apply {
                setClassName("com.example.calculator", "com.example.calculator.MainActivity")
                putExtra("data", "Hello from DataSenderApp")
            }
            startActivity(intent)
        }

        btnSendToSpinner.setOnClickListener {
            // Create an Intent to open Button Spinner app
            val intent = Intent().apply {
                setClassName("com.example.button_spinner", "com.example.button_spinner.MainActivity")
                putExtra("data", "Hello from DataSenderApp")
            }
            startActivity(intent)
        }
    }
}
