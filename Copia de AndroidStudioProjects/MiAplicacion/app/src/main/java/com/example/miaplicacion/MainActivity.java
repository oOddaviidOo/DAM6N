package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private TextView saludo;
    private Button accion, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=findViewById(R.id.etInfo);
        saludo=findViewById(R.id.tvInfo);
        accion=findViewById(R.id.btnAccion);
        salir=findViewById(R.id.btnFin);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usu=usuario.getText().toString();
                if(usu!=null)
                {
                    String msg = "Bienvenido ";
                    msg+=usu+""+" a nuestra \n SuperApp";
                    saludo.setText(msg);
                }
                else Toast.makeText(MainActivity.this, "Sin Usuario", Toast.LENGTH_LONG).show();
            }
        });
    }
}
