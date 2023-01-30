package org.example.map;


import java.util.Date;

public class Estudiante {
    String nombre;
    int edad;
    Date fechaIngreso;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, Date fechaIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
