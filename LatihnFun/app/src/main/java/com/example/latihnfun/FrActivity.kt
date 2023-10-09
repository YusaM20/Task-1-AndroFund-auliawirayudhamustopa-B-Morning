package com.example.latihnfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fr)

        val fragmenManager = supportFragmentManager
        val fragmentb = FragmentB()
        val fragment = fragmenManager.findFragmentByTag(FragmentB::class.java.simpleName)

        if(fragment !is FragmentB){
            fragmenManager
                .beginTransaction()
                .add(R.id.container, fragmentb,FragmentB::class.java.simpleName)
                .commit()
        }
    }
}