package com.paulo.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.paulo.listas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //declara variavel lateinit binding do tipo activitymainbinding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //instancia variavel
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //DEclarar uma lista de inteiros : val é imutável, como uma constante
        val inteiros = ArrayList<Int>();

        inteiros.add(1);
        inteiros.add(10);
        inteiros.add(5);
        inteiros.add(4);
        inteiros.add(8);

        //lista d enumeros
        //pega o valor pelo indice
        //val primeiro = inteiros.get(0);

        //Remove pelo indice
       //inteiros.removeAt(0);

        //remove pelo eelementos
        //inteiros.remove(5);

        //tamanho da lista
        //val tamanho = inteiros.size;

        //Apagar a lista
        //inteiros.clear();

        val adpater = ArrayAdapter(this, android.R.layout.simple_list_item_1, inteiros);

        binding.listView.adapter = adpater;

        binding.listView.setOnItemClickListener{parent, view, position, id ->
        Toast.makeText(this, "Clicando em ${inteiros.get(position)}", Toast.LENGTH_LONG).show()}



    }
}