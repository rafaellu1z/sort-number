package com.devventure.sortnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("CYCLE OF LIFE", "ON CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CYCLE OF LIFE", "ON START")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CYCLE OF LIFE", "ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CYCLE OF LIFE", "ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CYCLE OF LIFE", "ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CYCLE OF LIFE", "ON DESTROY")
    }
}