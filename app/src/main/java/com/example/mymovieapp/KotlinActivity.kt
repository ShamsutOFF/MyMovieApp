package com.example.mymovieapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {
    private lateinit var secondButton: Button
    private lateinit var stringEditText: EditText

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        stringEditText = findViewById(R.id.string_edit_text)
        secondButton = findViewById(R.id.button)
        secondButton.setOnClickListener { showAlertDialog(stringEditText.text.toString(), null) }
    }

    private fun showAlertDialog(message: String?, title: String?): Boolean {
        AlertDialog.Builder(this).apply {
            setPositiveButton("OK") { _, _ ->
                Toast.makeText(this@KotlinActivity, "TEXT", Toast.LENGTH_SHORT).show()
            }
            message?.let { setMessage(message) }
            title?.let { setTitle(title) }
            show()
            return true
//        val builder = AlertDialog.Builder(this)
//                .setPositiveButton("OK") { _, _ ->
//                    Toast.makeText(this, "TEXT", Toast.LENGTH_SHORT).show()
//                }

            //Ниже одинаковые по функционалу конструкции:

//        if (message != null) {
//            builder.setMessage(message)
//        }
//        message?.let { builder.setMessage(message) }
        }
    }
}