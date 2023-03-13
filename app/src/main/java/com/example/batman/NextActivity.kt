package com.example.batman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.batman.databinding.ActivityMainBinding

class NextActivity : AppCompatActivity() {
    ActivityMainBinding:binding
    override fun onCreate(savedInstanceState: Bundle?) {
        //New Update
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
    }
}