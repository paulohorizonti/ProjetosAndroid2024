package com.paulo.appmenurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paulo.appmenurestaurante.databinding.ActivityDadosDoPedidoBinding

class DadosDoPedidoActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDadosDoPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosDoPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent //recebe o que vem da outra
        val qtdCAfe = i.getStringExtra("qtd_cafe").toString().toInt()
        val qtdPao = i.getStringExtra("qtd_pao").toString().toInt()
        val qtdChocolate = i.getStringExtra("qtd_chocolate").toString().toInt()

        val precoCafe = i.getDoubleExtra("preco_cafe", 0.0)
        val precoPao = i.getDoubleExtra("preco_pao", 0.0)
        val precoChocolate = i.getDoubleExtra("preco_chocolate", 0.0)

        val texto = "Resumo do pedido :" +
                "Café: $qtdCAfe Preço: ${qtdCAfe * precoCafe}R$\n"+
                "Pão $qtdPao Preço: ${qtdPao * precoPao}R$\n"+
                "Chocolate $qtdChocolate Preço: ${qtdChocolate* precoChocolate}R$";

        binding.txtResumo.setText(texto).toString();


    }
}