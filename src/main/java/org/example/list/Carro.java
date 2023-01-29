package org.example.list;

public class Carro {
    String Placa;
    String Color;

    public Carro(String placa, String color) {
        Placa = placa;
        Color = color;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
