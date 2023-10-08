package com.example.latihnfun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edUser:EditText
    private lateinit var edpass:EditText
    private lateinit var conPass:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edUser = findViewById(R.id.edt_User)
        edpass = findViewById(R.id.edt_Pass)
        conPass = findViewById(R.id.edt_conPass)

        val btnreg : Button = findViewById(R.id.btnRegister)
        btnreg.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnRegister ->{

                val bundle = Bundle()
                bundle.putString("username",edUser.text.toString())
                bundle.putString("password",edpass.text.toString())


                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}