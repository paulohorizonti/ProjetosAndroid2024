package com.paulo.appmenurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.paulo.appmenurestaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    private val precoPao = 0.5
    private val precoCafe = 1.0
    private val precoChocolate = 2.5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        //ver o listener de todos
        binding.btnPedido.setOnClickListener {
            val i = Intent(this, SplahScreenActivity::class.java);
            i.putExtra("qtd_cafe", binding.edtQtdCafe.text.toString());
            i.putExtra("qtd_chocolate", binding.edtQtdChocolate.text.toString());
            i.putExtra("qtd_pao", binding.edtQtdPao.text.toString());
            i.putExtra("preco_cafe", precoCafe)
            i.putExtra("preco_pao", precoPao)
            i.putExtra("preco_chocolate", precoChocolate)

            startActivity(i)




        }
        binding.checkCafe.setOnClickListener {
            if(binding.checkCafe.isChecked()){
                binding.edtQtdCafe.setText("1")
                binding.txtPrecoCafe.visibility = View.VISIBLE;

            }else{
                binding.edtQtdChocolate.setText("0")
                binding.txtPrecoChocolate.visibility = View.GONE;
            }
        }
        binding.checkChocolate.setOnClickListener {
            if(binding.checkChocolate.isChecked()){
                binding.edtQtdChocolate.setText("1")
                binding.txtPrecoChocolate.visibility = View.VISIBLE;

            }else{
                binding.edtQtdChocolate.setText("0")
                binding.txtPrecoChocolate.visibility = View.GONE;
            }
        }
        binding.checkPao.setOnClickListener {
            if(binding.checkPao.isChecked()){
                binding.edtQtdPao.setText("1")
                binding.txtPrecoPao.visibility = View.VISIBLE;

            }else{
                binding.edtQtdPao.setText("0")
                binding.txtPrecoPao.visibility = View.GONE;
            }



        }



    }
}