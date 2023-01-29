package org.example.lisarraylist;

import java.util.ArrayList;

public class Alimento {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de datos,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de datos involucrados.
     */

    private String nombre;
    private int cantidad;
    private int calorias;

    public Alimento(String nombre, int cantidad, int calorias) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.calorias = calorias;
    }

    public Alimento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", calorias=" + calorias +
                '}';
    }


    public void ejecutar() {


        ArrayList<Alimento> alimentosConsumidos = new ArrayList<Alimento>();

        Alimento panIntegral = new Alimento("Pan integral", 2, 160);
        Alimento pollo = new Alimento("Pollo a la plancha", 100, 200);


        alimentosConsumidos.add(panIntegral);
        alimentosConsumidos.add(pollo);


        System.out.println("Alimentos consumidos antes de eliminarlo de la lista:");
        for (Alimento alimento : alimentosConsumidos) {
            System.out.println("Alimento: " + alimento.getNombre());
            System.out.println("Cantidad: " + alimento.getCantidad() + " gramos");
            System.out.println("Calorías: " + alimento.getCalorias() + "\n");
        }

        alimentosConsumidos.remove(panIntegral);

        System.out.println("Alimentos consumidos después de eliminarlo dela lista:");
        for (Alimento alimento : alimentosConsumidos) {
            System.out.println("Alimento: " + alimento.getNombre());
            System.out.println("Cantidad: " + alimento.getCantidad() + " gramos");
            System.out.println("Calorías: " + alimento.getCalorias() + "\n");
        }

        int totalCalorias = 0;
        for (Alimento alimento : alimentosConsumidos) {
            totalCalorias += alimento.getCalorias();
        }

        System.out.println("Total de calorías consumidas hoy: " + totalCalorias);


    }
}







