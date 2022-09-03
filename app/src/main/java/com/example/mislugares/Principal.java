package com.example.mislugares;

class Principal {
    public static void main (String [] main){
        com.example.mislugares.modelo.Lugar lugar = new com.example.mislugares.modelo.Lugar("Escuela Politecnica Superior de Gandia","C/ Paraninf, 1 46730 Gandia (SPAIN)",
                        -0.166093, 38.995656, com.example.mislugares.modelo.TipoLugar.EDUCION, 962849300, "http://www.epsg.upv.es",
                        "uno de los mejore lugares para formarse",3);
        System.out.println("Lugar: "+lugar.toString());
    }
}
