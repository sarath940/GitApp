package com.example.gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Sarath","Master change 1")
        Log.d("Sarath","Master change 2")
        Log.d("Sarath","Master change 3")
    }
}