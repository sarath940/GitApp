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
        Log.d("sarath","Feature Commit 1")
        Log.d("sarath","Feature Commit 2")
        Log.d("sarath","Feature Commit 3")
        Log.d("Sarath","Master change 3")
    }
}