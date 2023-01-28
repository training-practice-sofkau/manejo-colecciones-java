package org.example.list.arrayListPractice;

public class Mes {
    private String mes;

    public Mes(String mes) {
        this.mes = mes;
    }

    public String mes() {
        return mes;
    }

    public Mes setMes(String mes) {
        this.mes = mes;
        return this;
    }

    @Override
    public String toString() {
        return "Mes{" +
                "El nombre del mes es: '" + mes + '\'' +
                '}';
    }
}
