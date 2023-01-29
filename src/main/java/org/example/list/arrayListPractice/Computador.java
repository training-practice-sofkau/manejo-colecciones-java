package org.example.list.arrayListPractice;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computador)) return false;
        Computador that = (Computador) o;
        return Double.compare(that.pulga, pulga) == 0 && Objects.equals(tipo, that.tipo) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, marca, pulga);
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
