package com.example.AndroidDev

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demo2024.R
import com.example.demo2024.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        binding.btnLight.setOnClickListener {
//            binding.ll.setBackgroundResource(R.color.yellow)
//        }
//        binding.btnDark.setOnClickListener {
//            binding.ll.setBackgroundResource(R.color.black)
//        }
    }
}
