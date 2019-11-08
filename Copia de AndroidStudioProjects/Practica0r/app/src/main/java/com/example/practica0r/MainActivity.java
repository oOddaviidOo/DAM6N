package com.example.practica0r;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Se crean las variables con las que el usuario interactua
    private TextView msg;
    private EditText usu;
    private Button next, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se inicializan las variables conectandolas con el layout
    msg=findViewById(R.id.tvInfo);
    usu=findViewById(R.id.etNombre);
    next=findViewById(R.id.btnAccion);
    //Asociar los botones con el listener
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            msg.setText("Bienvenid@ a nuestra APP \n"+ usu.getText().toString());
            }
        });
    exit=findViewById(R.id.btnSalir);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    finish();
            }
        });
    }



}
