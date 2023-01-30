package org.example.colecciones.clases;

import java.util.Objects;

public class Pan {
    private String nombre;
    private boolean tieneQueso;
    private double precio;

    public Pan (String nombre, boolean tieneQueso, double precio){
        this.nombre = nombre;
        this.tieneQueso = tieneQueso;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneQueso() {
        return tieneQueso;
    }

    public void setTieneQueso(boolean tieneQueso) {
        this.tieneQueso = tieneQueso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString(){
        String tieneQueso = this.tieneQueso == true? "Si tiene queso" : "No tiene queso";
        return this.precio + "\t " + this.nombre + " | " + tieneQueso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pan pan = (Pan) o;
        return nombre.equals(pan.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
