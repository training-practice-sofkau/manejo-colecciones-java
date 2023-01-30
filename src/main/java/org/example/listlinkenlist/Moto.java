package org.example.listlinkenlist;

import java.util.LinkedList;

public class Moto extends Vehiculo{

    private int numRuedas;

    public Moto(String nombre, String modelo, int cilindraje, int numRuedas) {
        super(nombre, modelo, cilindraje);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
}
