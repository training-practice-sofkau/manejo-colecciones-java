package org.example.lisarraylist;

import java.util.ArrayList;

public class Empleado extends Persona {

    private double sueldo;

    double horasExtas;

    public Empleado(String nombre, String apellido, String documento, String correo,
                    double sueldo) {
        super(nombre, apellido, documento, correo);
        this.sueldo = sueldo;

    }

    public Empleado() {
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double calcularSueldo(double sueldo, double horasExtras) {
        double comision = 0;
        double totalSueldo = sueldo;

        if (horasExtras >= 1 && horasExtras <= 3) {
            comision = 0.15 * sueldo;
        } else if (horasExtras >= 4 && horasExtras <= 7) {
            comision = 0.25 * sueldo;
        } else if (horasExtras >= 7) {
            comision = 0.50 * sueldo;
        }
        totalSueldo += comision;

        return totalSueldo;
    }


    public void ejecutar() {


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



