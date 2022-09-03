package com.example.mislugares.datos;

import com.example.mislugares.modelo.Lugar;

import java.util.ArrayList;
import java.util.List;

public class LugaresLista implements RepositorioLugares {
    protected List <Lugar> listaLugares;

    /// constructor //////////////////////
    public LugaresLista (){
        listaLugares = new ArrayList<Lugar>();
        anaideEjemplos();
    }

    ///// metodos //////////////////////
    @Override
    public Lugar elemento(int id) {
        return listaLugares.get(id);
    }

    @Override
    public void aniade(Lugar lugar) {
        listaLugares.add(lugar);

    }

    @Override
    public int nuevo() {
        Lugar lugar = new Lugar();
        listaLugares.add(lugar);
        return listaLugares.size()-1;
    }

    @Override
    public void borrar(int id) {
        listaLugares.remove(id);

    }

    @Override
    public int tamanio() {
        return listaLugares.size();
    }

    @Override
    public void actualiza(int id, Lugar lugar) {
        listaLugares.set(id, lugar);
    }

    public void anaideEjemplos ()
    {
        aniade(new Lugar("Escuela Politecnica Superior de Gandia","C/ Paraninf, 1 46730 Gandia (SPAIN)",
                -0.166093, 38.995656, com.example.mislugares.modelo.TipoLugar.EDUCION, 962849300, "http://www.epsg.upv.es",
                "uno de los mejore lugares para formarse",3));

        aniade(new Lugar("Al de siempre","P.Industrial Junto Molí Nou - 46722, Benifla (Valencia)",
                -0.190642, 38.925857, com.example.mislugares.modelo.TipoLugar.BAR, 636472405, "",
                "no te pierdas el arroz con calabaza",3));

        aniade(new Lugar("androidcurso.com","Ciberespacio",
                -0.0, 0.0, com.example.mislugares.modelo.TipoLugar.EDUCION, 962849300, "http://androidcurso.com",
                "amplia tus conocimientos sobre android",5));

        aniade(new Lugar("Escuela Politecnica Superior de Gandia","C/ Paraninf, 1 46730 Gandia (SPAIN)",
                -0.166093, 38.995656, com.example.mislugares.modelo.TipoLugar.EDUCION, 962849300, "http://www.epsg.upv.es",
                "uno de los mejore lugares para formarse",3));
    }
}
