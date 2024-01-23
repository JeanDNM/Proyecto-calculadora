package com.example.myapplicationsumar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1:EditText = findViewById(R.id.editTextText)
            val num2:EditText= findViewById(R.id.editTextText2)
        val btnSumar:Button= findViewById(R.id.button4)
        val btnRestar:Button = findViewById(R.id.button)
        val txtRest:TextView= findViewById(R.id.textView)

        btnSumar.setOnClickListener{

            val nummero1 = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()
            val suma = nummero1 + numero2
            txtRest.text = suma.toString()


        }

        btnRestar.setOnClickListener{

            val nummero1 = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()
            val resta = nummero1 - numero2
            txtRest.text = resta.toString()

    }
}}