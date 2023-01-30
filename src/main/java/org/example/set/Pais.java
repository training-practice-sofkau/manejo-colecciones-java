package org.example.set;

public class Pais {

    private String nombre;
    private int poblacion;
    private String lengua;


    public Pais() {
    }

    public Pais(String nombre, int poblacion, String lengua) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.lengua = lengua;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getLengua() {
        return lengua;
    }

    public void setLengua(String lengua) {
        this.lengua = lengua;
    }
}
