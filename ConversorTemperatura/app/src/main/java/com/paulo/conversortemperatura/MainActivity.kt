package com.paulo.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}