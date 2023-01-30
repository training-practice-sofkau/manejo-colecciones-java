package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    public void ejecutar() {
        EjemplosAL arrayList = new EjemplosAL();
        System.out.println("\n- Ejemplo 1 -");
        arrayList.ejemplo1();
        System.out.println("\n- Ejemplo 2 -");
        arrayList.ejemplo2();
        System.out.println("\n- Ejemplo 3 -");
        arrayList.ejemplo3();
    }
}

class EjemplosAL {
    /* En este ejemplo se aplican la mayoría de métodos soportados por la colección usando una aplicación general de
       números
     */
    public void ejemplo1() {
        ArrayList<Integer> arrayList = new ArrayList<>(); // Se usa el constructor vacío
        // Se imprime el tamaño inicial de la colección
        System.out.println("Se crea una ArrayList con un tamaño de " + arrayList.size());
        arrayList.add(1);                                 // Se añaden números al final
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1, 2);                 // Se añade un número en la posición especificada
        // Se busca el número en una posición específica, además de buscar la posición del número en específico
        System.out.println("En la ArrayList " + arrayList + " el número " + arrayList.get(1) + " está en la posición " +
                            (arrayList.indexOf(2) + 1));
        arrayList.remove(1);                         // Se elimina el número en la posición específica
        System.out.println("La ArrayList" + arrayList + " ahora tiene un tamaño de " + arrayList.size());
        arrayList.set(0, 3);                               /* Se cambia el número de la posición específica por el
                                                              indicado
                                                            */
        if (arrayList.contains(5)) {                       // Se evalúa si el número está en la colección
            System.out.println("El número se encuentra en la ArrayList");
        } else {
            System.out.println("El número NO se encuentra en la ArrayList");
        }
        // Se busca la última aparición del número específico
        System.out.println("El número 3 de la ArrayList " + arrayList + " aparece por última vez en la posición " +
                            (arrayList.lastIndexOf(3) + 1));
        arrayList.clear();                                 // Se eliminan todos los números
        System.out.println("La ArrayList " + arrayList + " ahora está vacía");
    }

    /* En este ejemplo se utiliza una ArrayList que contiene años históricos, pero uno de ellos está mal. Además, se
       muestran por pantalla usando un for y for-each loop, una vez el año incorrecto es reemplazado
     */
    public void ejemplo2() {
        // Se usa el constructor con una colección inicial
        ArrayList<Integer> annos = new ArrayList<>(Arrays.asList(1963, 1969, 1976, 1978, 1983, 19895, 1990, 1991, 2001));
        System.out.println("Los años ");
        for(int anno : annos) {                  // Se muestran los años históricos
            System.out.println(anno);
        }
        System.out.println("Son años donde ocurrieron hechos históricos muy importantes\n");
        annos.set(annos.indexOf(19895), 1989);   // Se corrige el año de la caída del Muro de Berlín
        for (int i = 0; i < annos.size(); i++) { // Se muestran los años históricos con año corregido
            System.out.println("Año " + annos.get(i));
        }
    }
    /* En este ejemplo se utiliza una ArrayList que contiene posiciones de llegada, pero están desordenadas. Además, se
       muestran por pantalla usando un for-each loop, una vez se han ordenado
     */
    public void ejemplo3() {
        // Se usa el constructor con una colección inicial
        ArrayList<Integer> posiciones = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 4));
        for (int posicion : posiciones) { // Se muestran las posiciones de llegada
            System.out.println("Posición N°" + posicion);
        }
        Collections.sort(posiciones);     // Se ordenan las posiciones
        System.out.println("\nPosiciones ordenadas");
        for (int posicion : posiciones) { // Se muestran las posiciones de llegada ordenadas
            System.out.println("Posición N°" + posicion);
        }
    }
}