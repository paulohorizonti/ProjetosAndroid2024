package com.paulo.conversosmodedasv2app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.paulo.conversosmodedasv2app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDolar.setOnClickListener {
            calcular(0.8)
        }

        binding.btnEuro.setOnClickListener {
            calcular(5.9)
        }
        binding.btnPesor.setOnClickListener {
            calcular(1.2)
        }


    }

    private fun calcular(taxa: Double) {
        var reais = binding.edtEuros.text.toString().trim()
        if(!reais.isEmpty()){
            val resultado = reais.toDouble()*taxa;
            Toast.makeText(applicationContext, "${resultado}$", Toast.LENGTH_LONG).show();

        }

    }
}