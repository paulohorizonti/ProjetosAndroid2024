package com.paulo.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.loginapp.databinding.ActivityLoginCertoBinding
import com.paulo.loginapp.databinding.ActivityLoginErradoBinding
import com.paulo.loginapp.databinding.ActivityMainBinding

class LoginErradoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginErradoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErradoBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnLogout.setOnClickListener {

            finish();


        }


    }
}