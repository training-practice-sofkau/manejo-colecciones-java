package org.example.list.arrayListPractice;

public class Persona {
    private String nombre;
    private int edad;
    //private String carrera;

    public String nombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int edad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
