package com.example.exemplointernacionalizacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNome = findViewById<EditText>(R.id.editTextTextPersonName)
        val btnMsg = findViewById<Button>(R.id.button)

        btnMsg.setOnClickListener{
            val msg = "Olá, ${getString(R.string.str_msg)}, ${txtNome.text}"
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }
}