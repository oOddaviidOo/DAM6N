package com.example.practica2r;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private int opcion=0;
    private Switch sw;
    private RadioGroup rg;
    private boolean imagen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (group.getCheckedRadioButtonId()){
            case R.id.rbOp1: opcion=1;break;
            case R.id.rbOp2: opcion=2;break;
            case R.id.rbOp3: opcion=3;break;
            default: opcion=4;
        }
    }

    public void Pulsaciones(View cosa){
        switch (cosa.getId()){

            case R.id.swImagen: if (sw.isChecked()){
                imagen=true;
            }else{
                imagen=false;
            };break;

            case R.id.ibNext:
                Intent next=new Intent(this, FinalActivity.class);
                next.putExtra("opcion", opcion);
                next.putExtra("imagen", imagen);
                startActivity(next);
                break;

                case R.id.btnExit: finish();break;
            default:break;
        }

    }

}
