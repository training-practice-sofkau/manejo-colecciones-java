package org.example.map;

public class Estudiante {
    private int id;
    private String nombre;
    private  int edad;

    public Estudiante(int id,String nombre, int edad){
        this.id=id;
        this.nombre=nombre;
        this.edad= edad;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
