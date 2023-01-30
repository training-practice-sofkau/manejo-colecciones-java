package org.example.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice_ejemplo1 {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */

    public  void main() {
        // Creo una lista de nombres de animales
        ArrayList<String> animales = new ArrayList<>();

        // Agrego elementos a mi lista
        animales.add("Gorila");
        animales.add("Elefante");
        animales.add("León");
        animales.add("Perro");

        // Imprimo todos los elementos de mi lista
        System.out.println("La lista de mis animales es: ");
        //creo un for que me recorra mi lista
        for (String animal : animales) {
            System.out.println(animal);
        }

        // Mezclo la lista de animales y la imprimo
        Collections.shuffle(animales);
        System.out.println("\n La lista de animales mezclada es: ");
        //recorro la lista
        for (String animal : animales) {
            System.out.println(animal);
        }

        // obtengo  el tamaño de mi listay la imprimo
        int tamaño = animales.size();
        System.out.println("\nTamaño de la lista: " + tamaño);

        // Busco un animal en mi lista
        boolean existe = animales.contains("León");
        System.out.println("\n¿Existe 'León' en la lista? " + existe);

        // Eliminar un animal de mi lista
        animales.remove("Elefante");
        System.out.println("\nLista de animales después de eliminar 'Elefante': ");
        for (String animal : animales) {
            System.out.println(animal);
        }
    }

}
