package com.paulo.primeiraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.paulo.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNome.setOnClickListener{
            //varoaveç strommg que pega o valor do edtxt
            val nome = binding.edtTexto.text.toString()

            //binding.txtNome.text = "Óla "+nome
           // binding.txtNome.text = "Óla ${nome}"
            binding.txtNome.setText("Olá ${nome}")
        }


    }
}