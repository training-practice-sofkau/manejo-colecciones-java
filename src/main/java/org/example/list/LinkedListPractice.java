package org.example.list;

import java.util.Arrays;
import java.util.Iterator;
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

    /* En este ejemplo se utiliza una LinkedList con nombres de estudiantes que deben ser leídos, pero hay que agregar
       un estudiante nuevo, quitar uno que se va, y modificar el nombre incorrecto.
     */
    public void ejemplo2() {
        // Se usa el constructor con una colección inicial
        LinkedList<String> nombres = new LinkedList<>(Arrays.asList("Juan", "Pedro", "Ana", "Lui"));
        // Se accede a la colección por medio de sus métodos
        System.out.println(nombres.getFirst() + " es el primero en la lista y " + nombres.getLast() + " es el último");
        nombres.set(3, "Luis");      // Se modifica el nombre incorrecto
        nombres.removeFirst();       // Se quita el estudiante que se va
        nombres.addFirst("Emma"); // Se añade la estudiante nueva
        // Se vuelve a mostrar la lista de estudiantes con su tamaño
        System.out.println("Los " + nombres.size() + " estudiantes actuales son: " + nombres);
    }

    /* En este ejemplo se utiliza una LinkedList con tamaños de tornillos que deben ser mostrados, esta vez, haciendo
       uso del iterador generado con el método de la clase
     */
    public void ejemplo3() {
        // Se usa el constructor con una colección inicial
        LinkedList<String> tornillos = new LinkedList<>(Arrays.asList("1/2", "5/8", "3/4", "7/8", "1-1/8", "1-1/4", "2"));
        System.out.println("Los " + tornillos.size() + " tamaños de tornillo disponibles son:");
        for (Iterator<String> it = tornillos.iterator(); it.hasNext(); ) {
            String tamanno = it.next();
            System.out.println(tamanno + " in");
        }
    }
}