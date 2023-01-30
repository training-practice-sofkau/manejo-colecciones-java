package org.example.colecciones.clases;

import java.util.Objects;

public class Carro {
    private String placa;
    private Persona conductor;

    public Carro(String placa, Persona conductor){
        this.placa = placa;
        this.conductor = conductor;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public String toString() {
        return this.placa + " - " + this.conductor.toString();
    }
}
