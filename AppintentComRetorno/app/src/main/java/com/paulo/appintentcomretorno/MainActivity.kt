package com.paulo.appintentcomretorno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.paulo.appintentcomretorno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding;

    //cria uma variavel para mandar para a outra activity
    private var nome = ""

    //necessario para pegar o resultado da segunda activity
    private lateinit var result:ActivityResultLauncher<Intent>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnMudarNome.setOnClickListener {
            var i = Intent(this, MainActivity2::class.java)
            //nesse ponto envia a variavel com sua chafe
            i.putExtra("nome",nome)
          //startActivity(i)
            result.launch(i)

        }
            result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.data !=null && it.resultCode == 1){
                nome = it.data?.getStringExtra("nome").toString();
                binding.txtNome.setText("Olá $nome")
            }else if(it.data != null && it.resultCode == 2){
                Toast.makeText(applicationContext,"OPERAÇÃO CANCELADA", Toast.LENGTH_LONG).show();
            }else
            {
                Toast.makeText(applicationContext,"DEU ERRO", Toast.LENGTH_LONG).show();

            }
            Toast.makeText(applicationContext,"VAI DIGITAR O NOME", Toast.LENGTH_LONG).show();
        }


    }
}