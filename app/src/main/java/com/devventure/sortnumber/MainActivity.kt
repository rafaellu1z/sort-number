package com.devventure.sortnumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado01 = findViewById<ImageView>(R.id.dado1)
        val dado02 = findViewById<ImageView>(R.id.dado2)
        val btn = findViewById<Button>(R.id.playGame)
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val shareButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        val player = intent.getStringExtra("playerName")

        val message = resources.getString(R.string.welcome, player)

        welcomeText.text = message

        val images = listOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)

        btn.setOnClickListener{
            dado01.setImageResource(images.random())
            dado02.setImageResource(images.random())
        }

        shareButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Você é sortudo !!!")
            intent.setPackage("com.whatsapp")
            intent.type = "text/plain"
            if (intent.resolveActivity(this.packageManager) != null){
                startActivity(intent)
            } else {
                Toast.makeText(this, "Você não tem o WhatsApp instalado", Toast.LENGTH_LONG).show()
            }
        }

        Log.i("CICLO DE VIDA", "ON CREATE")

    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLO DE VIDA", "ON START")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLO DE VIDA", "ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLO DE VIDA", "ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CICLO DE VIDA", "ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLO DE VIDA", "ON DESTROY")
    }
    /*private fun sortNumber() : Int {
        return (1..6).random()
    }*/
}