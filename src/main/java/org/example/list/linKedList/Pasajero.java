package org.example.list.linKedList;

public class Pasajero {

    public static int idPasajero = 0;
    private String nombre;

    public Pasajero(String nombre) {
        this.nombre = nombre;
        idPasajero++;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void mostrarIdPasajero() {
        System.out.println(nombre);
    }


}
