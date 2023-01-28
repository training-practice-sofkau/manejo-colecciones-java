package org.example.list.arrayListPractice;

public class Computador {
    private String tipo;
    private String marca;
    private double pulga;

    public Computador() {
    }

    public Computador(String tipo, String marca, double pulga) {
        this.tipo = tipo;
        this.marca = marca;
        this.pulga = pulga;
    }

    public String tipo() {
        return tipo;
    }

    public Computador setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String marca() {
        return marca;
    }

    public Computador setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public double pulga() {
        return pulga;
    }

    public Computador setPulga(double pulga) {
        this.pulga = pulga;
        return this;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", pulga=" + pulga +
                '}';
    }
}
