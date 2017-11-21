package com.example.luciano.pokedex;

/**
 * Created by Luciano on 15/11/2017.
 */

public class Especie {
    private String nId;
    private String nEspecie;
    private String nTipo;
    private String nVelocidad;
    private String nAtaque;
    private String nDefensa;
    private int nFoto;

    public Especie(String nId, String nEspecie, String nTipo, String nVelocidad, String nAtaque, String nDefensa, int nfoto) {
        this.nId = nId;
        this.nEspecie = nEspecie;
        this.nTipo = nTipo;
        this.nVelocidad = nVelocidad;
        this.nAtaque = nAtaque;
        this.nDefensa = nDefensa;
        this.nFoto = nfoto;

    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getnAtaque() {

        return nAtaque;
    }

    public void setnAtaque(String nAtaque) {
        this.nAtaque = nAtaque;
    }

    public String getnDefensa() {
        return nDefensa;
    }

    public void setnDefensa(String nDefensa) {
        this.nDefensa = nDefensa;
    }

    public String getnVelocidad() {

        return nVelocidad;
    }

    public void setnVelocidad(String nVelocidad) {
        this.nVelocidad = nVelocidad;
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

    public int getnFoto() {
        return nFoto;
    }

    public void setnFoto(int nFoto) {
        this.nFoto = nFoto;
    }
}
