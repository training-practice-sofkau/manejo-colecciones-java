package org.example.list;

import java.util.LinkedList;

public class LinkedListPractice_ejemplo3 {
    public  void main() {
        //creo mi coleccion, en este caso uso LinkedList
        LinkedList<String> tasks = new LinkedList<>();
        //añado nuevos objetos a la coleccion de lista
        tasks.add("Barrer toda la casa");
        tasks.add("Limpiar las ventanas");
        tasks.add("Pasar la aspiradora");
        tasks.add("Limpiar el inodoro");
        tasks.add("Tender la cama");
        tasks.add("Lavar los platos");

        //imprimo en consola mi lista

        System.out.println("Esta es la lista de tareas iniciales del Robot : " + tasks);

        //realizo nuevas tareas como agregar y/o eliminar e imprimo en la consola

        tasks.addFirst("Limpiar el jardin");
        System.out.println("Agregué una -nueva tarea- al principio de la lista: " + tasks);

        tasks.removeLast();
        System.out.println("Eliminé la tarea de -lavar los platos- al final de la lista: " + tasks);

        tasks.addLast("Lavar los platos");
        System.out.println("Agregué -lavado de tenis- al final de la lista: " + tasks);

        tasks.remove(2);
        System.out.println("Eliminé la tarea de -limpiar las ventanas- en la posición 2: " + tasks);
    }
}

