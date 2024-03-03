package com.paulo.conversorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.paulo.conversorjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding buiding;
    TextView txtUm;
    Button btnUm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buiding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        txtUm = findViewById(R.id.textUm);
        btnUm = findViewById(R.id.btnUm);

        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUm.setText("EXEMPLO COM JAVA");
            }
        });

        /*
        buiding.btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buiding.textUm.setText("TESTE COM JAVA");
            }
        });

*/

    }
}