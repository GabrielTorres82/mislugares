package com.example.mislugares.datos;

import com.example.mislugares.modelo.Lugar;

public interface RepositorioLugares {
    Lugar elemento (int id); //Devuelve el elemento dado su id
    void aniade (Lugar lugar); // Añade el elemento indicado
    int nuevo(); // Añade un elemento en blancco y devuelde su id
    void borrar(int id); // Elimina el elemento con el id indicado
    int tamanio(); // Devuelve el numero de elemntos
    void actualiza (int id, Lugar lugar); // Remplaza un elemento
}
