package org.example.lisarraylist;

import java.util.ArrayList;

public class ArrayListPractice {


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


    public void ejecutar1() {


        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Perez", "1233445", "juand@gmail.com"));
        personas.add(new Persona("Pedro", "Perez", "1233445", "juand@gmail.com"));
        personas.add(new Empleado("yeison", "Osorio", "1233445", "yeisond@gmail.com", 50000));
        personas.add(new Empleado("Fernado", "Rodriguez", "1233445", "Fernado@gmail.com", 80000));


        System.out.println("Personas y empleados registrados:");
        for (Persona persona : personas) {
            System.out.print(persona.getNombre() + " " + persona.getApellido() + " " + persona.getDocumento() + " " + persona.getCorreo());
            ;
            if (persona instanceof Empleado) {
                System.out.println(":" + "el sueldo es: " + " ($" + ((Empleado) persona).getSueldo() + ")");
            } else {
                System.out.println();
            }
        }
    }

}
