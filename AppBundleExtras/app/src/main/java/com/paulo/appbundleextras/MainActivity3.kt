package com.paulo.appbundleextras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.appbundleextras.databinding.ActivityMain2Binding
import com.paulo.appbundleextras.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater);
        setContentView(binding.root)

       val i = intent
        val numero1 = i.extras?.getInt("numero1");
        val numero2 = i.extras?.getInt("numero2");

        if(numero1!=null && numero2!=null){
            val soma = numero1!! + numero2!!
            binding.txtResultado.setText("Soma :$soma");
        }else{
            binding.txtResultado.setText("VIERAM VAZIOS")
        }



    }
}