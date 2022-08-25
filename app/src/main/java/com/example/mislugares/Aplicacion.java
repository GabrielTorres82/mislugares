package com.example.mislugares;

import android.app.Application;

public class Aplicacion extends Application {
    public RepositorioLugares lugares = new LugaresLista();

    @Override
    public void onCreate()
    {
        super.onCreate();
        //prueba gitt
        // modificacion para prueba de clonado creo

    }

}
