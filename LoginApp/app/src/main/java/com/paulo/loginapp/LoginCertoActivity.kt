package com.paulo.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.paulo.loginapp.databinding.ActivityLoginCertoBinding

class LoginCertoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginCertoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginCertoBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnLogsair.setOnClickListener {
        /*
            var i = Intent(this, MainActivity::class.java)
            startActivity(i);
            Toast.makeText(applicationContext, "VOLTE SEMPRE", Toast.LENGTH_LONG).show();
*/
            finish();


        }
    }
}