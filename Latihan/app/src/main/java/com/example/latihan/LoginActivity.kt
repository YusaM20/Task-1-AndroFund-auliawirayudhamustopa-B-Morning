package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailEditText = findViewById(R.id.editTextEmail)
        passwordEditText = findViewById(R.id.editTextPassword)
        loginButton = findViewById(R.id.btnLogin)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Perform authentication here (e.g., check against a backend server or local database)
            // If authentication is successful, navigate to the main activity
            if (authenticateUser(email, password)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Display an error message to the user
                // You can use Toast or a TextView to display the message
            }
        }
    }

    private fun authenticateUser(email: String, password: String): Boolean {
        // Implement your authentication logic here
        // Return true if authentication is successful, otherwise false
        // You can replace this with your actual authentication logic
        return (email == "example@email.com" && password == "password")
    }
}
