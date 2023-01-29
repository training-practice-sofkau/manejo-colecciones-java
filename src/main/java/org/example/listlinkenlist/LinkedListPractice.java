package org.example.listlinkenlist;

import java.util.LinkedList;

public class LinkedListPractice {


    public void ejecutar() {

        LinkedList<Vehiculo> listaVehiculos = new LinkedList<Vehiculo>();

        Moto moto1 = new Moto("Yamaha", "R1", 600, 2);
        Carro carro1 = new Carro("Toyota", "Corolla", 2500, 4);

        listaVehiculos.add(moto1);
        listaVehiculos.add(carro1);

        for (Vehiculo v : listaVehiculos) {
            if (v instanceof Moto) {
                Moto m = (Moto) v;
                System.out.println("Moto:");
                System.out.println("Marca: " + m.getNombre());
                System.out.println("Modelo: " + m.getModelo());
                System.out.println("Cilindraje: " + m.getCilindraje());

                System.out.println("Num. Ruedas: " + m.getNumRuedas());
            } else if (v instanceof Carro) {
                Carro c = (Carro) v;
                System.out.println("Carro:");
                System.out.println("Marca: " + c.getNombre());
                System.out.println("Modelo: " + c.getModelo());
                System.out.println("Cilindraje: " + c.getCilindraje());
                System.out.println("Num. Puertas: " + c.getNumPuertas());
            }
            System.out.println();

            listaVehiculos.remove(carro1);
        }


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("primer elemento: " + linkedList.getFirst());
        System.out.println("ultimo elemento: " + linkedList.getLast());
        System.out.println("tamaño de la lista: " + linkedList.size());
        System.out.println("la lista esta vacia: " + linkedList.isEmpty());
    }


    /***
     *
     * addFirst(E e): agrega un elemento al principio de la lista.
     * addLast(E e): agrega un elemento al final de la lista.
     * removeFirst(): elimina el primer elemento de la lista.
     * removeLast(): elimina el último elemento de la lista.
     * getFirst(): obtiene el primer elemento de la lista.
     * getLast(): obtiene el último elemento de la lista.
     * descendingIterator(): devuelve un iterador que recorre la lista en orden inverso.
     * size(): devuelve el tamaño de la lista.
     * isEmpty(): devuelve un valor booleano que indica si la lista está vacía.
     *
     *
     */
}
