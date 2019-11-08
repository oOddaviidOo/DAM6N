package com.example.practica1r;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

//implementamos OnClickListener y sus metodos para
public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener{
private TextView tvCuenta;
int cuenta=0;
private final static String CUENTA = "cuenta actual";
private final static int vMin = 0;
private final static int vMax = 50;
private Button btnMas;
private Button btnMenos;
private Button btnReset;
private CheckBox cbValMin;
private boolean Min=false;
private CheckBox cbValMax;
private boolean Max=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asociamos las variables con el elemento del layout
        //Y conectamos el listener de los botones y de los

        tvCuenta=findViewById(R.id.tvCuenta);
        tvCuenta.setText(""+cuenta);

        btnMas=findViewById(R.id.btnMas);
        btnMas.setOnClickListener(this);

        btnMenos=findViewById(R.id.btnMenos);
        btnMenos.setOnClickListener(this);

        btnReset=findViewById(R.id.btnReset);
        btnReset.setOnClickListener(this);

        cbValMin=findViewById(R.id.cbValMin);
        cbValMin.setOnCheckedChangeListener(this);

        cbValMax=findViewById(R.id.cbValMax);
        cbValMax.setOnCheckedChangeListener(this);


    }


    @Override
    public void onClick(View v) {
        //obtiene el id del elemento del layout
        switch (v.getId()){
            case R.id.btnMas:cuenta++;
                if (Max && (cuenta>vMax)){
                    cuenta=vMax;
                }
                break;
            case R.id.btnMenos:cuenta--;
                if (Min && (cuenta<vMin)) {
                    cuenta=vMin;
                }
                break;
            case R.id.btnReset:
                cuenta=0;
                break;
            case R.id.cbValMin:

                break;
            case R.id.cbValMax:break;
            default:break;
        }
        tvCuenta.setText(""+cuenta);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        //obtiene el id del elemento del layout
        switch (buttonView.getId()){
            case R.id.cbValMin:
                Min=isChecked;
                if (Min && (cuenta<vMin)) cuenta=vMin;
                break;
            case R.id.cbValMax:
                Max=isChecked;
                if (Max && (cuenta>vMax)) cuenta=vMax;
                break;
            default:break;
        }
        tvCuenta.setText(""+cuenta);
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);

    savedInstanceState.putInt(CUENTA, cuenta);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
    super.onRestoreInstanceState(savedInstanceState);

    if (savedInstanceState != null){
        cuenta=savedInstanceState.getInt(CUENTA, 0);
    }
    else cuenta=0;
    tvCuenta.setText(""+cuenta);
    }
}
