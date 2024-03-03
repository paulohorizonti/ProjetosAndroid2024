package com.example.ferramentalayou;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.ViewCompat;

public class MainActivity extends AppCompatActivity {
    //declarar as referencias do componente
    TextView txtTitulo; //obejto de texto disponivel
    EditText edtNomecompleto;

    SwitchCompat swMostrar;

    ToggleButton tbLigado;
    //Evento do botao
    Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //busca pelo id passando o id como parametro R de recuso, id é o que eu quero e o ultimo é o nome do id em si
        txtTitulo = findViewById(R.id.txtTitulo);
        txtTitulo.setText("Retrato");
        edtNomecompleto = findViewById(R.id.edtNomeCompleto);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        swMostrar = findViewById(R.id.swMostrar);
        tbLigado = findViewById(R.id.tbLigado);

        //Evento para desabilitar botao
        tbLigado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbLigado.isChecked())
                {
                    edtNomecompleto.setText("");
                    edtNomecompleto.setEnabled(false);
                }else{
                    edtNomecompleto.setEnabled(true);
                }
            }
        });

        //Evento para mudar algo com o switch
        swMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swMostrar.isChecked())
                {
                    txtTitulo.setVisibility(View.GONE);
                }else{

                    txtTitulo.setVisibility(View.VISIBLE);
                    String titulo = txtTitulo.getText().toString().toUpperCase();
                    txtTitulo.setText(titulo);

                }
            }
        });


        //mensagem
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(TextUtils.isEmpty(edtNomecompleto.getText().toString())){
                    edtNomecompleto.setError("Você PRECISA DIGITAR ALGO");

                }else{
                    Toast.makeText(getBaseContext(), "Você digitou: "+edtNomecompleto.getText(), Toast.LENGTH_LONG).show();
                }




            }
        });


    }
}