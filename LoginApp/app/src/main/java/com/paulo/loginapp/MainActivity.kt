package com.paulo.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.paulo.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            val username = binding.edtUser.text.toString().trim();
            val pasword = binding.edtSenha.text.toString().trim();

            if(username.equals("user") && pasword.equals("123456"))
            {
                Toast.makeText(applicationContext, "Login Ok", Toast.LENGTH_LONG).show();

                var i = Intent(this, LoginCertoActivity::class.java)
                startActivity(i);



            }else{
                var i = Intent(this, LoginErradoActivity::class.java)
                startActivity(i);
                Toast.makeText(applicationContext, "Login ou senha Inválido", Toast.LENGTH_LONG).show();

            }

            binding.edtUser.setText("");
            binding.edtSenha.setText("");
        }

        binding.btnFechar.setOnClickListener {

            Toast.makeText(applicationContext,"VOLTE SEMPRE", Toast.LENGTH_LONG)
            finish();

        }

    }
}