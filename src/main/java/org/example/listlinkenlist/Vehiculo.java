package org.example.listlinkenlist;

import java.util.LinkedList;

public class Vehiculo {


    private String nombre;

    private String modelo;

    private int cilindraje;

    public Vehiculo() {
    }


    public Vehiculo(String nombre, String modelo, int cilindraje) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }



}




