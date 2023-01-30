package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
    public void ejecutar() {
        //ArrayList Empleados

        List<Empleado> listaDeEmpleados = new ArrayList<>();
        System.out.println("Lista de empleados: ");
        listaDeEmpleados.add(new Empleado("Carlos", "Leon", 25822, "leon123@gmail.com", 180000.00  ));
        listaDeEmpleados.add(new Empleado("Marta", "Perez", 5222, "perez123@gmail.com", 410000.00 ));
        listaDeEmpleados.add(new Empleado("Lucy", "Vivas",  369, "Vivas123@gmail.com", 280000.00 ));
        listaDeEmpleados.add(new Empleado("Juan", "Telon", 59877, "telon123@gmail.com", 190090.20 ));
        listaDeEmpleados.add(new Empleado("Camila", "Bahia", 2357, "baiha123@gmail.com", 250000.00 ));
        listaDeEmpleados.add(new Empleado("Jenny", "Lopez", 3657, "lopez123@gmail.com", 180000.00 ));


        //eliminar
        listaDeEmpleados.remove(0);
        //recorrer la lista

        for (Empleado empleado : listaDeEmpleados) {
            System.out.println(" ");
            System.out.println("Nombre del empleado: " + empleado.getName());
            System.out.println("Apellido del empleado: " + empleado.getLastName());
            System.out.println("Número de empleado: " + empleado.getNumber());
            System.out.println(" Correo del empleado: " + empleado.getEmail());
            System.out.println("Salario del empleado: " + empleado.getSalary());

        }

        //Invertir los elementos
        Collections.reverse(listaDeEmpleados);
        for (Empleado lista : listaDeEmpleados) {
            System.out.println(lista);
        }

   //isEmpaty false que no esta vacia true si esta vacia
        System.out.println("La lista esta vacia: " + listaDeEmpleados.isEmpty());

    }

    }


 class Empleado{
    private String name;
    private String lastName;

    private int number;
    private String email;
    private double salary;

     public Empleado(String name, String lastName, int number, String email, Double salary) {
         this.name = name;
         this.lastName = lastName;
         this.number = number;
         this.email = email;
         this.salary = salary;
     }



     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }

     public Double getSalary() {
         return salary;
     }

     public void setSalary(Double salary) {
         this.salary = salary;
     }

 }

