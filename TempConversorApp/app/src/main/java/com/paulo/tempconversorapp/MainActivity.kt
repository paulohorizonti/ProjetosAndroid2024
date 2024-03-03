package com.paulo.tempconversorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.tempconversorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConverter.setOnClickListener{
            //pega a temperatura digitada

            if(!binding.edtTemp.text.toString().isEmpty())
            {
                val celcius = binding.edtTemp.text.toString().toDouble();
                if(binding.rdbFar.isChecked)
                {
                    val tempFa = String.format("%.2f",celcius * 1.8 + 32)
                    binding.txtResultado.text = tempFa.toString()+" ºF"


                }
                if(binding.rdbKelvin.isChecked)
                {
                    val tempKel = String.format("%.2f",celcius + 273)
                    binding.txtResultado.text = tempKel.toString()+" ºK"

                }
            }else
            {
                binding.txtResultado.text = "DIDITE UM VALOR"
            }



        }
    }
}