package com.example.mislugares.casos_uso;

import android.app.Activity;
import android.content.Intent;

import com.example.mislugares.datos.RepositorioLugares;

public class CasosUsoLugar {
    private Activity actividad;
    private RepositorioLugares lugares;

    //////// CONSTUCTOR  //////////////
    public CasosUsoLugar(Activity actividad, RepositorioLugares lugares) {
        this.actividad= actividad;
        this.lugares = lugares;

    }

    /////// OPERACIONES BÁSICAS ////////////////////
    public void mostrar (int pos )
    {
        Intent i = new Intent(actividad, VistaLugarActivity.class);
        i.putExtra("pos", pos);
        actividad.startActivity(i);
    }
}
