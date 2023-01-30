package org.example.set;

public class Empleado {
    private String nombre;
    private int cc;

    public Empleado(String nombre, int cc) {
        this.nombre = nombre;
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCc() {
        return cc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return cc == empleado.cc;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(cc);
    }
}
