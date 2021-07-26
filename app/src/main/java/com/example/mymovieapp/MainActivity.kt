package com.example.mymovieapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var buttonJava: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Можно так с кнопками работать
        buttonJava = findViewById(R.id.button_java)
        buttonJava?.setOnClickListener {
            Toast.makeText(this, buttonJava?.text, Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, JavaActivity::class.java))
        }

        // А Можно так
        findViewById<View>(R.id.button_kotlin).setOnClickListener{
            startActivity(Intent(this, KotlinActivity::class.java))
        }

    }
}