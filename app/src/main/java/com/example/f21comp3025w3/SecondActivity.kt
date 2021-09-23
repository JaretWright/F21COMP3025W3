package com.example.f21comp3025w3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.f21comp3025w3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("Lifecycle","SecondActivity.onCreate() method")

        //add some code such that the user can navigate back to the main screen from here.
        //1.  Setup up the binding
        //2.  Create the intent
        binding.backToMainButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }


    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle","SecondActivity.onStop() method")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle","SecondActivity.onStart() method")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle","SecondActivity.onResume() method")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle","SecondActivity.onPause() method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle","SecondActivity.onDestroy() method")
    }

}