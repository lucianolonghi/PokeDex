package com.example.luciano.pokedex;

/**
 * Created by Luciano on 15/11/2017.
 */

public class Especie {
    private String nEspecie;
    private String nTipo;

    public Especie(String nEspecie, String nTipo) {
        this.nEspecie = nEspecie;
        this.nTipo = nTipo;
    }

    public String getnEspecie() {
        return nEspecie;
    }

    public void setnEspecie(String nEspecie) {
        this.nEspecie = nEspecie;
    }

    public String getnTipo() {
        return nTipo;
    }

    public void setnTipo(String nTipo) {
        this.nTipo = nTipo;
    }
}
