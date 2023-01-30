package org.example.set;

import java.util.Objects;

/**
 * Clase persona representa una persona con nombre y edad
 */
public class Persona {
    /**
     * Atributos
     */
    private String nombre;
    private int edad;

    /**
     * Constructor
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método equals que compara si dos objetos de la clase Persona son iguales
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        // Comprueba si el objeto es igual al objeto actual
        if (this == o) return true;
        // Comprueba si el objeto es nulo o no es de la misma clase
        if (o == null || getClass() != o.getClass()) return false;
        // Convierte el objeto a Persona y compara los atributos
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }
    // Método hashCode que genera un código hash para el objeto de la clase Persona
    @Override
    public int hashCode() {
        int resultado = nombre.hashCode();
        resultado = 31 * resultado +edad;
        return resultado;
    }
}
