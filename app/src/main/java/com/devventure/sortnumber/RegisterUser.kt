package com.devventure.sortnumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        var playerName = findViewById<EditText>(R.id.playerName)
        var registerPlayer = findViewById<Button>(R.id.registerPlayer)
        var welcomeText = findViewById<TextView>(R.id.welcomeText)

        registerPlayer.setOnClickListener{
            var player = playerName.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("playerName", player)
            startActivity(intent)
        }

    }
}