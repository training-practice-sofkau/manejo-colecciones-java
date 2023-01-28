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

}
