package org.example.map;

public abstract class Persona {
    private String nombre;
    private String ciudad;

    private int puestoOlimpiadas;

    public Persona(String nombre, String ciudad, int puestoOlimpiadas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puestoOlimpiadas = puestoOlimpiadas;
    }

    public int getPuestoOlimpiadas() {
        return puestoOlimpiadas;
    }

    public void setPuestoOlimpiadas(int puestoOlimpiadas) {
        this.puestoOlimpiadas = puestoOlimpiadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", puestoOlimpiadas=" + puestoOlimpiadas +
                '}';
    }
}
