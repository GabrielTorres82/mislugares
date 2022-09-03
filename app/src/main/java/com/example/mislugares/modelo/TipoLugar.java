package com.example.mislugares.modelo;

public enum TipoLugar {
    OTROS ("Otros",0),
    RESTAURANTE ("Restaurante",0),
    BAR ("Bar",0),
    COPAS ("Copas",0),
    ESPECTACULO ("Espectaculo",0),
    HOTEL ("Hotel",0),
    COMPRAS ("Compras",0),
    EDUCION ("Educacion",0),
    DEPORTE("Deporte",0),
    NATURALEZA("Naturaleza",0),
    GASOLINERA("Gasolinera",0);

    private final String texto;
    private final int recurso;

    TipoLugar (String texto, int recurso){
        this.texto = texto;
        this.recurso = recurso;
    }
    public String getTexto() {return texto;}
    public int getRecurso() {return recurso;}
}
