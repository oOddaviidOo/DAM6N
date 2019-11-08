package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Gamas.Responder{
    private int gama = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ABconIconoTitulo();

    }

    public void Pulsaciones(View boton){
    if (boton.getId()==R.id.btnElegir){
Gamas pregunta = new Gamas();
pregunta.show(getSupportFragmentManager(), "dialogo");
    }
    else {
    if (boton.getId()==R.id.btnExit) {
        TextView chao= findViewById(R.id.tvInfo);
        chao.setTextColor(getColor(R.color.despedida));
        chao.setText(R.string.despedida);
        chao.setVisibility(View.VISIBLE);finish();
        Handler control = new Handler();
        Runnable va=new Runnable() {
            @Override
            public void run() {
                finish();
            }
        };
        control.postDelayed(va, 1000);
         }
        }
    }


    @Override
    public void onRespuesta(int opcion) {
        gama = opcion;
        switch (gama)
        {
            case 0:this.setTheme(R.style.miGreen);
            case 1:this.setTheme(R.style.miPink);
            case 2:this.setTheme(R.style.miBlue);
            case 3:this.setTheme(R.style.miOrange);
                default:this.setTheme(R.style.AppTheme);
        }
        this.setContentView(R.layout.activity_main);
    }
}
