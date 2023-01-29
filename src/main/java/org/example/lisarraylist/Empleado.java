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

        ArrayList<Empleado> empleados = new ArrayList<>();

    }


}
