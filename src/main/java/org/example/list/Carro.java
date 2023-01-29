package org.example.list;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    /**
     * Método constructor
     * @param marca
     * @param modelo
     * @param placa
     */
    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    /**
     * Métodos getters
     * @return
     */
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "\nmarca:" + marca + '\'' +
                ", modelo: " + modelo + '\'' +
                ", placa:" + placa + '\'';
    }
}
