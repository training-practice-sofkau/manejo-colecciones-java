package org.example.list;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     */
    class Empleado {
        private String nombre;
        private double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }
    }

    public void salarioPromedioEmpleados() {
            ArrayList<Empleado> empleados = new ArrayList<Empleado>();
            empleados.add(new Empleado("Juan", 1000.0));
            empleados.add(new Empleado("Maria", 1500.0));
            empleados.add(new Empleado("Pedro", 2000.0));
            empleados.add(new Empleado("Ana", 2500.0));
            empleados.add(new Empleado("Luis", 3000.0));

            double suma = 0.0;
            for (Empleado empleado : empleados) {
                suma += empleado.getSalario();
            }
            double promedio = suma / empleados.size();

        System.out.println("El salario promedio es: $" + promedio);
        System.out.print("Empleados con salario superior al promedio: ");
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() > promedio) {
                System.out.print(empleado.getNombre() + " | ");
            }
        }
        System.out.println();
    }

    public void promedioPrecios() {
        ArrayList<Double> precios = new ArrayList<Double>();
        precios.add(12.5);
        precios.add(15.0);
        precios.add(20.5);
        precios.add(18.0);
        precios.add(25.5);

        double suma = 0.0;
        for (Double precio : precios) {
            suma += precio;
        }
        double promedio = suma / precios.size();

        System.out.println("Precio total: $" + suma);
        System.out.println("Precio promedio: $" + promedio);
    }


        public void nombresOrdenAlfabetico() {
            ArrayList<String> estudiantes = new ArrayList<String>();
            estudiantes.add("Juan");
            estudiantes.add("Maria");
            estudiantes.add("Pedro");
            estudiantes.add("Ana");
            estudiantes.add("Luis");

            Collections.sort(estudiantes);
            System.out.println("Lista de estudiantes en orden alfabetico: " + estudiantes);
        }












}












