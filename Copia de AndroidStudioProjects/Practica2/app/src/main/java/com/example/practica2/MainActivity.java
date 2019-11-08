package com.example.practica2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity  implements RadioGroup.OnCheckedChangeListener {

    private Boolean imagen = false;
    private RadioGroup rg;
    private Switch sw;
    private int opcion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.swImagen);
        rg = findViewById(R.id.rgOpciones);
        rg.setOnCheckedChangeListener(this);

    }



        public void Pulsaciones(View boton){

            switch(boton.getId())
            {
                case R.id.btnExit: TextView chao= findViewById(R.id.tvChao);
                chao.setText("Vuelve pronto");chao.setVisibility(View.VISIBLE);finish();
                    Handler control = new Handler();
                    control.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                        }
                    }, 600);
                break;
                case R.id.ibNext:
                    Intent next = new Intent (this, FinalActivity.class);
                    next.putExtra("opcion", opcion);
                    next.putExtra("imagen", imagen);
                    startActivity(next);
                    break;
                case R.id.swImagen:
                    if (sw.isChecked()) imagen=true;
                    else imagen=false;
                    break;

        }
    }

    @Override
    public void onCheckedChanged(RadioGroup rg, int opc) {
        switch (rg.getCheckedRadioButtonId()){
            case R.id.rgOp1: opcion = 1; break;
            case R.id.rgOp2: opcion = 2; break;
            case R.id.rgOp3: opcion = 3; break;
            default: opcion=4;

        }
    }
}
