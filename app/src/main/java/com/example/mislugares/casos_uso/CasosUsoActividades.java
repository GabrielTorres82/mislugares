package com.example.mislugares.casos_uso;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.example.mislugares.presentacion.AcercaDeActivity;

public class CasosUsoActividades {

    private AcercaDeActivity acerca;
    private Activity actividad;
    //// FUNCIONES //////7
    //// LANZAR ACERCA DE ////////////

    public void lanzarAcercaDe ()
    {
        Intent i = new Intent (actividad, AcercaDeActivity.class);
        actividad.startActivity(i);
    }
}
