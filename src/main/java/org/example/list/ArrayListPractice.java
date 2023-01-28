package org.example.list;

import java.util.ArrayList;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
    public void ejemplo1(){
        ArrayList<Auto> misAutos = new ArrayList<>();
        misAutos.add(new Auto("Renault","Gris"));
        misAutos.add(new Auto("Mazda","Negro"));
        misAutos.add(new Auto("Toyota","Blanco"));

        System.out.println("El auto 2° es: " +misAutos.get(1));

        System.out.println("Lista de autos");
        for (int i =0; i < misAutos.size(); i++){
            System.out.println("El auto en la posicion "+ i+ " es "+ misAutos.get(i));
        }
    }
    public void ejemplo2(){
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Daniela",25,45000));
        listaEmpleados.add(new Empleado("Samuel",28,50000));
        listaEmpleados.add(new Empleado("Sebastian",23,48000));
        listaEmpleados.set(1, new Empleado("Patricia",30,52000));

        System.out.println("Lista de Empleados");
        for (int i =0; i < listaEmpleados.size(); i++){
            System.out.println("El empleado en la posicion "+ i+ " es "+ listaEmpleados.get(i));
        }




    }

}
