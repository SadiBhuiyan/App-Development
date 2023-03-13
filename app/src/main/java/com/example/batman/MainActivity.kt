package com.example.batman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.batman.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.btn.setOnClickListener {

            Toast.makeText(applicationContext, "clickable", Toast.LENGTH_SHORT).show()

            var intent = Intent(applicationContext,NextActivity::class.java)
            startActivity(intent)
            


        }
    }
}