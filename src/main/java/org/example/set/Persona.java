package org.example.set;

public abstract class Persona {
    private int cc;
    private String nombre;
    private int voto;

    public Persona(int cc, String nombre, int voto) {
        this.cc = cc;
        this.nombre = nombre;
        this.voto = voto;

    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cc=" + cc +
                ", nombre='" + nombre + '\'' +
                ", voto=" + voto +
                '}';
    }
}
