package org.example.list;

public class Contacto {
    /**
     * Atributos
     */
    private String nombre;
    private String apellido;
    private long telefono;

    /**
     * Constructor
     * @param nombre
     * @param apellido
     * @param telefono
     */
    public Contacto(String nombre, String apellido, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    /**
     * Metodos getters y setters
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public long getTelefono() {
        return telefono;
    }

    /**
     * Metodo para ver la información del conctato
     * @return
     */
    @Override
    public String toString() {
        return "Contacto:" +  "\nNombre: " + nombre +  "\nApellido: " + apellido + "\nTelefono: " + telefono;
    }
}
