package com.example.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val enteredPassword = passwordInput.text.toString()

            if (enteredPassword == "abc123") {
                // Si la clave es correcta, iniciar el segundo Activity
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else {
                // Si la clave es incorrecta, mostrar un Toast
                Toast.makeText(this, "Clave incorrecta", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
