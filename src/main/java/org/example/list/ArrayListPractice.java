package org.example.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
    ArrayList<Auto> autos = new ArrayList<>();

    public void simpleArrayList() {
        ArrayList<Integer> listanumeros = new ArrayList<>();
        Random generarAleatorios = new Random();
        //LLenando el array con 10 numeros aleatorios
        for (int i = 0; i < 10; i++) {
            int randomNumber = 1+generarAleatorios.nextInt(99);
            listanumeros.add(randomNumber);
        }
        System.out.println("\nImprimiendo la lista como se creo");
        System.out.println(listanumeros);
        //Ordenando la lista de numeros
        Collections.sort(listanumeros);
        System.out.println("\nImprimiendo la lista Ordenada");
        System.out.println(listanumeros);
        }
    public void arrayListObjects() {

        Auto a1 = new Auto("Mercedes", "Negro");
        Auto a2 = new Auto("Mazda", "Rojo");
        Auto a3 = new Auto("BMW", "Azul");
        autos.add(a1);
        autos.add(a2);
        autos.add(a3);
        mostrarAutos();
        System.out.println("Ahora eliminaremos el elemento de la posicion 1");
        autos.remove(1);
        mostrarAutos();
    }

    public void arrayFrutas() {
        ArrayList<String> ensalada = new ArrayList<>();
        ensalada.add("Manzana");
        ensalada.add("Mango");
        ensalada.add("Banano");
        ensalada.add("Pera");
        //Mostrando los elementos de la ensalada
        System.out.println(ensalada);
        System.out.println("Ahora eliminare el Mango de la ensalada");
        ensalada.remove(1);
        System.out.println(ensalada);
    }



    public void mostrarAutos() {
        for (int i = 0; i < autos.size(); i++) {
            System.out.println("El auto en la posicion " +i+ " es "+ autos.get(i));
        }
    }


}


