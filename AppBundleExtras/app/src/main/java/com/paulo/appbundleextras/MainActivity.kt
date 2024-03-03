package com.paulo.appbundleextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.appbundleextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)


        binding.btnOk.setOnClickListener {
            val numero = binding.edtNumero.text.toString().trim().toInt();

            val i = Intent(this, MainActivity2::class.java);
            i.putExtra("numero1", numero);//anexa ao intent
            startActivity(i); //manda pra activity passando o intent anexado

        }

    }
}