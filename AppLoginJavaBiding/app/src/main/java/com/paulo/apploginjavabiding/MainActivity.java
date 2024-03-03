package com.paulo.apploginjavabiding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.paulo.apploginjavabiding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = binding.edtLogin.getText().toString();
                String senha = binding.edtSenha.getText().toString();


                if(login.equals("PAULO") && senha.equals("1234")){
                    Toast.makeText(getApplicationContext(), "Senha Correta", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Senha Incorreta", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
}