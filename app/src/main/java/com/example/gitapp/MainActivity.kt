package com.example.gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("sarath","master commit 1")
        Log.d("sarath","master commit 2")
        Log.d("sarath","master commit 3")
        Log.d("sarath","Feature commit 1")
        Log.d("sarath","Feature commit 2")
        Log.d("sarath","master commit 4")
    }
}