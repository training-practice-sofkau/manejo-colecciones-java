package org.example.list;

public class Persona {
    /**
     * Atributos
     */
    private String nombre;
    private String apellido;
    private int edad;

    /**
     * Método constructor
     * @param nombre
     * @param apellido
     * @param edad
     */
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    /**
     * getters
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
