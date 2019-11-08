package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class FinalActivity extends AppCompatActivity {

    private int opcion=0;
    private boolean imagen=false;
    private String[] lista;
    private ListView lv;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        opcion = getIntent().getIntExtra("opcion", 0);
        imagen = getIntent().getBooleanExtra("imagen", false);

        lv = findViewById(R.id.lvOpcion);
        img = findViewById(R.id.ivImagen);
        mostrarLista(opcion);
        mostrarImagen(imagen, opcion);



    }
    private void mostrarLista(int opcion){
        switch (opcion){
            case 1: lista = getResources().getStringArray(R.array.libros);break;
            case 2: lista = getResources().getStringArray(R.array.musica);break;
            case 3: lista = getResources().getStringArray(R.array.peliculas);break;
            default: lista=new String[4];
                lista[0]="na de nai";
                lista[1]="nothing to see here";
                lista[2]="nein nein";
                lista[3]="niente di nulla";break;

        }
        ArrayAdapter<String> cosas = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, lista);
        lv.setAdapter(cosas);

    }

    private void mostrarImagen(boolean hay, int opcion){
        if (hay) {
            switch (opcion) {
                case 1: img.setImageResource(R.drawable.ic_libros);break;
                case 2: img.setImageResource(R.drawable.ic_musica);break;
                case 3: img.setImageResource(R.drawable.ic_pelis);break;
                default: img.setImageResource(R.drawable.ic_nada);break;


            }
            img.setVisibility(View.VISIBLE);
        }
        else img.setVisibility(View.GONE);

    }
}
