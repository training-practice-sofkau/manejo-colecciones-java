package org.example.list.arrayListPractice;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mes)) return false;
        Mes mes1 = (Mes) o;
        return mes.equals(mes1.mes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mes);
    }

    @Override
    public String toString() {
        return "Mes{" +
                "El nombre del mes es: '" + mes + '\'' +
                '}';
    }
}
