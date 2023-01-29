package org.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListPractice {
    public void ejemploUnoLInkedList() {
        LinkedList<Contacto> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("***AGENDA DE CONTACTOS***");
            System.out.println("\nElige una opción");
            System.out.println("1. Agregar Contacto.");
            System.out.println("2. Eliminar Conctacto.");
            System.out.println("3. Ver Lista de Contactos.");
            System.out.println("4. Salir.");
            opc = in.nextInt();

            in.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Agrega Contacto");
                    System.out.println("Nombre:");
                    String nombre = in.nextLine();
                    System.out.println("Apellido:");
                    String apellido = in.nextLine();
                    System.out.println("Numero de Telefono:");
                    long telefono = in.nextLong();
                    in.nextLine();
                    /**
                     * Añadir elementos a la LinkedList
                     */
                    list.add(new Contacto(nombre, apellido, telefono));
                    break;
                case 2:
                    System.out.println("Digite el numero de telefono del contacto que desea eliminar");
                    long telefono1 = in.nextLong();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getTelefono() == telefono1) {
                            /**
                             * Eliminar elementos de la LinkedList
                             */
                            list.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println(list);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción Incorrecta");
            }

        } while (opc != 4);

    }

    public void ejemploDosLinkedList() {
        LinkedList<Carro> carros = new LinkedList<>();
        /**
         * Agregar carros a la lista
         */
        carros.add(new Carro("Mazda","Allegro","A2G-123"));
        carros.add(new Carro("Toyota","Corolla","XLT-438"));
        carros.add(new Carro("Kia","Rio","GTY-663"));

        /**
         * Imprimir carros de la lista
         */
        System.out.println("autos " +  carros.toString());

        /**
         *Agregar un carro al inicio de la lista
         */
        carros.addFirst(new Carro("Renault","Sandero","QWE-659"));
        System.out.println("autos " +  carros.toString());
        /**
         * Agregar auto al final de la lista
         */
        carros.addLast(new Carro("Lamborghini","Huracan","GHT-653"));

        /**
         * Elimiar el primer carro de la lista
         */
        carros.removeFirst();
        System.out.println("autos " +  carros.toString());
        /**
         * Elimiar el ultimo carro de la lista
         */
        carros.removeLast();
        System.out.println("autos " +  carros.toString());

    }

    public void ejemploTresLinkedList() {
        /**
         * Crear una nueva instancia de LinkedList
         */
        LinkedList<Persona> personas = new LinkedList<>();
        /**
         * Añadir elementos al LinkedList
         */
        Persona persona1 = new Persona("Jairo", "Peñaloza", 21);
        Persona persona2 = new Persona("Martha", "Gomez", 38);
        Persona persona3 = new Persona("Paula", "Sanabria", 40);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        System.out.println("N° de Personas: " + personas.size());
        /**
         * Acceder a los elementos de la LinkedList
         */
        Persona primerPersona = personas.getFirst();
        Persona segundaPersona = personas.getLast();

        /**
         * Eliminar elementos de la LinkedList
         */
        personas.removeFirst(); // Elimina a Jairo Peñaloza
        personas.removeLast(); // Elimina a Paula Sanabria
        /**
         * Tamaño del LinkedList
         */
        System.out.println("N° de Personas: " + personas.size());

        /**
         * Recorrer la LinkedList
         */
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " (" + persona.getEdad() + " años)");
        }

    }

}

