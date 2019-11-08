package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class contador extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {


    private int cuenta=0;
    private final int MAXIMO=50;
    private Button mas, menos, reset;
    private CheckBox min, max;
    private TextView tvCuenta;
    private boolean valMin, valMax;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contador_lay);
        valMin=false;
        valMin=false;

        mas=findViewById(R.id.btnMas);
        mas.setOnClickListener(this);

        menos=findViewById(R.id.btnMenos);
        menos.setOnClickListener(this);

        reset=findViewById(R.id.btnReset);
        reset.setOnClickListener(this);

        min=findViewById(R.id.cbValMin);
        min.setOnCheckedChangeListener(this);

        max=findViewById(R.id.cbValMax);
        max.setOnCheckedChangeListener(this);

        tvCuenta=findViewById(R.id.tvCuenta);


    }

    @Override
    public void onClick(View boton) {
        switch (boton.getId()){
            case R.id.btnMas:cuenta++;
            if (valMax && (cuenta>MAXIMO)){cuenta=50;}
            break;
            case R.id.btnMenos:cuenta--;
            if (valMin && (cuenta<0)){cuenta=0;}
            break;
            case R.id.btnReset:cuenta=0;
            break;
            default: break;
        }
        tvCuenta.setText(""+cuenta);
    }


    @Override
    public void onCheckedChanged(CompoundButton casilla, boolean isChecked) {
        switch(casilla.getId()){
            case R.id.cbValMax:
                valMax=isChecked;
            if (valMax && (cuenta>MAXIMO)) cuenta=MAXIMO;
                tvCuenta.setText(""+cuenta);
            break;
            case R.id.cbValMin:
                valMin=isChecked;
            if (valMin && (cuenta<0)) cuenta=0;
                tvCuenta.setText(""+cuenta);
                break;
            default:break;

        }

    }
}
