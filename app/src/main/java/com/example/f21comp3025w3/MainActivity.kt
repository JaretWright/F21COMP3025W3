package com.example.f21comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Lifecycle","MainActivity.onCreate() method")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle","MainActivity.onStop() method")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle","MainActivity.onStart() method")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle","MainActivity.onResume() method")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle","MainActivity.onPause() method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle","MainActivity.onDestroy() method")
    }

}