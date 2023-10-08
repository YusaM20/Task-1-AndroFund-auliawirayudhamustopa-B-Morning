package com.example.latihnfun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.latihnfun.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv : TextView
//    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.txtViews)

        val usernamee  = intent.getParcelableExtra<User>("user")?.username
        val passwordd = intent.getParcelableExtra<User>("password")?.password
        tv.text = "username: $usernamee dan password: $passwordd"

        val btnpin : Button = findViewById(R.id.btnPin)
        btnpin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnPin -> {
                val message = "hallo semua"
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type = "text/plain"
                startActivity(intent)

            }
        }
        when(v.id){
            R.id.btnfrag ->{
                val intent = Intent(this@MainActivity,BlankFragment::class.java)
                startActivity(intent)

            }
        }
    }

}