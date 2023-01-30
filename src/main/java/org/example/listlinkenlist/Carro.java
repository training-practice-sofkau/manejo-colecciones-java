package org.example.listlinkenlist;

public class Carro extends Vehiculo {

    private int numPuertas;

    public Carro(String nombre, String modelo, int cilindraje, int numPuertas) {
        super(nombre, modelo, cilindraje);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
