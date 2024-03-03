package com.paulo.toastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.paulo.toastapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClicar.setOnClickListener{
            val nome = binding.edtNome.text.toString().trim()
            val sobrenome = binding.edtSobrenome.text.toString().trim()

            if(nome.isEmpty() || sobrenome.isEmpty()){
                binding.txtNomeSobrenome.text = "NOME NAO INSERIDO"
                Toast.makeText(applicationContext,"NOME NAO INFORMADO", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"Olá $nome $sobrenome", Toast.LENGTH_LONG).show()
                binding.txtNomeSobrenome.text = "Ola $nome $sobrenome"
            }
        }







    }
}