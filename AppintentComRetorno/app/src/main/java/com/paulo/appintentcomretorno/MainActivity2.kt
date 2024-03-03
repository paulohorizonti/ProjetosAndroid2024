package com.paulo.appintentcomretorno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.appintentcomretorno.databinding.ActivityMain2Binding
import com.paulo.appintentcomretorno.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //pegar o valor
        val i = intent
        val nome = i.extras?.getString("nome")

        binding.edtNome.setText(nome)

        binding.btnOk.setOnClickListener {
            i.putExtra("nome", binding.edtNome.text.toString())
            setResult(1,i)
            finish()
        }

        binding.btnCancelar.setOnClickListener {
            setResult(2,i)
            finish()
        }



    }
}