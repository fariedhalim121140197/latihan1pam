package com.example.latihan1pam121140197

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnPlus : Button
    private lateinit var btnMin : Button
    private lateinit var angka : Button
    private lateinit var kata : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnPlus = findViewById(R.id.plus)
        btnMin = findViewById(R.id.min)
        angka = findViewById(R.id.inp)
        kata = findViewById(R.id.textView2)

        btnPlus.setOnClickListener {
            var angka2 = angka.toString().toDouble()
            angka2++
            angka.text = angka2.toString()
        }

        btnMin.setOnClickListener {
            var angka2 = angka.toString().toDouble()
            angka2--
            angka.text = angka2.toString()
        }
    }

}