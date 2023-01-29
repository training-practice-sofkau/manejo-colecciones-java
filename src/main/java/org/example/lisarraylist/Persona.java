package org.example.lisarraylist;

import java.util.Date;

public class Persona {

    private String nombre;
    private String apellido;
    private String documento;
    private String correo;

    public Persona(String nombre, String apellido, String documento, String correo) {


        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.correo = correo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento='" + documento + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
