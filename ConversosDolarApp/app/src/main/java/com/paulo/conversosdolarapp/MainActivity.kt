package com.paulo.conversosdolarapp

import android.icu.text.DecimalFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.conversosdolarapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //sempre vamos criar para acessar os componentes atraves do biding
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //criar o clique do botao
        binding.btnConverter.setOnClickListener{
            //agora epega os valores dos elementos e clcular como desejar



            if(binding.edtValor.text.isEmpty())
            {
                binding.txtValorConvertido.text = "DIGITE UM VALOR"
            }else{
                var real = binding.edtValor.text.toString().toDouble()
                var calculo = String.format("%.2f",real * 5.65)
                binding.txtValorConvertido.text = "US$ "+(calculo.toString())
            }


        }

    }
}