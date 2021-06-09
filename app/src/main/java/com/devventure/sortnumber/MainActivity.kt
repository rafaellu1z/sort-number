package com.devventure.sortnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado01 = findViewById<TextView>(R.id.textView_dado2)
        val dado02 = findViewById<TextView>(R.id.textView2_dado01)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            dado01.text = sortNumber().toString()
            dado02.text = sortNumber().toString()
        }

        dado01.text = sortNumber().toString()
        dado02.text = sortNumber().toString()
    }
    private fun sortNumber() : Int {
        return (1..6).random()
    }
}