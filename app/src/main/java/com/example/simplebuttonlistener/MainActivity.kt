package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKotlin.setOnClickListener {
            Toast.makeText(applicationContext, "from Kotlin code", Toast.LENGTH_SHORT).show()
        }

    }

    fun xml(view: android.view.View) {
        Toast.makeText(applicationContext, "from xml", Toast.LENGTH_SHORT).show()
    }
}