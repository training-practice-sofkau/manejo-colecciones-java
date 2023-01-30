package org.example.set;

public class VideoJuego {

    private String nombre;
    private String reglas;
    private String lenguaje;

    public VideoJuego() {
    }

    public VideoJuego(String nombre, String reglas, String lenguaje) {
        this.nombre = nombre;
        this.reglas = reglas;
        this.lenguaje = lenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReglas() {
        return reglas;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "nombre='" + nombre + '\'' +
                ", reglas='" + reglas + '\'' +
                ", lenguaje='" + lenguaje + '\'' +
                '}';
    }
}
