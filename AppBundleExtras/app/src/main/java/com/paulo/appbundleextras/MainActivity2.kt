package com.paulo.appbundleextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.appbundleextras.databinding.ActivityMain2Binding
import com.paulo.appbundleextras.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater);
        setContentView(binding.root)

        val i = intent;

        val bundle = i.extras;

        binding.btnOk.setOnClickListener {
            val numero = binding.edtNumero.text.toString().trim().toInt();

            val i = Intent(this, MainActivity3::class.java);

            if(bundle !=null){
                i.putExtras(bundle);
            }
            i.putExtra("numero2", numero);//anexa ao intent
            startActivity(i); //manda pra activity passando o intent anexado

        }



    }
}