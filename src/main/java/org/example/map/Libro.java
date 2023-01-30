package org.example.map;

public class Libro {
    private String titulo;
    private String escritor;
    private int precio;

    public Libro(String titulo, String escritor, int precio) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEscritor() {
        return escritor;
    }

    public int getPrecio() {
        return precio;
    }
}
