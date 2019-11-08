package com.example.practica3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class Gamas extends DialogFragment {
private Context entorno;
Responder eleccion;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        entorno = context;
        eleccion = (Responder) context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final String[] colores = getResources().getStringArray(R.array.gamas);
        AlertDialog.Builder elCuadro = new AlertDialog.Builder(entorno);
        elCuadro.setTitle(getResources().getString(R.string.dfGama));
        elCuadro.setSingleChoiceItems(colores, -1,
                new DialogInterface.OnClickListener()
                {
            @Override
            public void onClick(DialogInterface dialog, int opc) {
                eleccion.onRespuesta(opc);
                dialog.dismiss();
            }
        });
        return elCuadro.create();
    }


    public interface Responder {
        public void onRespuesta(int opcion);
    }

}
