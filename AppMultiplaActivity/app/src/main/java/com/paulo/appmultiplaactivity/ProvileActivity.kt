package com.paulo.appmultiplaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.appmultiplaactivity.databinding.ActivityProvileBinding

class ProvileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProvileBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProvileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            /*startActivity(Intent(this, MainActivity::class.java));*/
            finish()
        }




    }



}