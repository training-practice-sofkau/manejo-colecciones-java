package org.example.list;

import java.util.LinkedList;

public class LinkedListPractice {
    public void ejecutar() {
        EjemplosLL linkedList = new EjemplosLL();
        System.out.println("\n- Ejemplo 1 -");
        linkedList.ejemplo1();
        System.out.println("\n- Ejemplo 2 -");
        linkedList.ejemplo2();
        System.out.println("\n- Ejemplo 3 -");
        linkedList.ejemplo3();
    }
}

class EjemplosLL {
    /* En este ejemplo se aplican la mayoría de métodos soportados por la colección usando una aplicación general de
       números
     */
    public void ejemplo1() {
        LinkedList<Integer> linkedList = new LinkedList<>(); // Se usa el constructor vacío
        // Se imprime el tamaño inicial de la colección
        System.out.println("Se crea una LinkedList con un tamaño de " + linkedList.size());
        linkedList.add(2);                                   // Se añaden números al final
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(4);
        System.out.println("La LinkedList " + linkedList + " se verá modificada");
        linkedList.add(1, 3);                   // Se añade un número en la posición especificada
        linkedList.addFirst(1);                           // Se añade un número al inicio de la colección
        linkedList.addLast(5);                            // Se añade un número al final de la colección
        System.out.println("Ahora la LinkedList " + linkedList + " tiene más números");
        // Se busca el número en una posición específica, además de buscar la posición del número en específico
        System.out.println("En la LinkedList " + linkedList + " el número " + linkedList.get(1) + " está en la posición " +
                            (linkedList.indexOf(2) + 1));
        linkedList.removeFirst();                            // Se eliminan el primer y último número
        linkedList.removeLast();
        System.out.println("Se han eliminado el primer y último número de la LinkedList " + linkedList);
        // Se buscan el primer y último número de la colección
        System.out.println("Ahora el primer número es " + linkedList.getFirst() + " y el último es " + linkedList.getLast());
        linkedList.remove(2);                          // Se elimina el número en la posición específica
        linkedList.set(3, 6);                                /* Se cambia el número anterior de la posición específica
                                                               por el indicado
                                                              */
        if (linkedList.contains(6)) {                        // Se evalúa si el número está en la colección
            System.out.println("El número se encuentra en el ArrayList");
        } else {
            System.out.println("El número NO se encuentra en el ArrayList");
        }
        // Se busca la última aparición del número específico
        System.out.println("El número 2 de la LinkedList " + linkedList + " aparece por última vez en la posición " +
                            (linkedList.lastIndexOf(2) + 1));
        linkedList.clear();                                 // Se eliminan todos los números
        System.out.println("La LinkedList " + linkedList + " ahora está vacía");
    }

    public void ejemplo2() {
        //...Nombres de estudiantes acceder y agregar
    }

    public void ejemplo3() {
        //...listIterator con los tamaños de tornillos
    }
}