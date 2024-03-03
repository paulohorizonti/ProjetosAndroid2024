package com.paulo.appitentextra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.paulo.appitentextra.databinding.ActivityMain2Binding
import com.paulo.appitentextra.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")

        if(nome.equals("") || nome == null){
            Toast.makeText(applicationContext,"NOME NAO INSERIDO",  Toast.LENGTH_LONG).show();
        }else{
            binding.txtNomeView.setText("Olá ${nome}")
        }

    }
}