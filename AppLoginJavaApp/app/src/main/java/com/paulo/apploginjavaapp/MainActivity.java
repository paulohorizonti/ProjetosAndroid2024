package com.paulo.apploginjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnEntrar;
EditText edtUsuario;
EditText edtSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntrar = findViewById(R.id.btnEntrar);
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = edtUsuario.getText().toString();
                String senha = edtSenha.getText().toString();
                if(usuario.equals("user") && senha.equals("123")){
                    Toast.makeText(getApplicationContext(),"Senha aceita", Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getApplicationContext(),"Senha ERRADA", Toast.LENGTH_LONG).show();
                }
                edtUsuario.setText("");
                edtSenha.setText("");
            }
        });

    }
}