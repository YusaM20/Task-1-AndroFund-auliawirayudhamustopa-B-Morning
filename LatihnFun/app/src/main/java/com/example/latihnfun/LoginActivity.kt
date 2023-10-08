package com.example.latihnfun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edUser:EditText
    private lateinit var edPass:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edUser = findViewById(R.id.edt_User)
        edPass = findViewById(R.id.edt_Pass)

        val bundle = intent.extras
        if (bundle !=null) {
            edUser.setText(bundle.getString("username"))
            edPass.setText(bundle.getString("password"))
        }
        val btnlog : Button = findViewById(R.id.btnLogin)
        btnlog.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnLogin ->{
                val intent = Intent(this@LoginActivity,MainActivity::class.java)
                intent.putExtra("User",User(edUser.text.toString(),edPass.text.toString()))
                startActivity(intent)
            }
        }
    }
}