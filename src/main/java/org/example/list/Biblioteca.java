package org.example.list;

public class Biblioteca {

    private String nombre;
    private String autor;


    public Biblioteca(String nombre,String autor){
        this.nombre=nombre;
        this.autor=autor;

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }


}

