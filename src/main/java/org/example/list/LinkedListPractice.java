package org.example.list;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main() {
        // Ejemplo 1
        System.out.println("Ejemplo 1: LinkedList de enteros");
        LinkedList<Integer> numeros = new LinkedList<>();

        // Agregar elementos a la LinkedList
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        // Acceder a un elemento de la LinkedList
        System.out.println("Tercer elemento: " + numeros.get(2));

        // Modificar un elemento de la LinkedList
        numeros.set(1, 4);
        System.out.println("Segundo elemento después de la modificación: " + numeros.get(1));

        // Eliminar un elemento de la LinkedList
        numeros.remove(2);

        // Tamaño de la LinkedList
        System.out.println("Tamaño de la LinkedList: " + numeros.size());

        // Ejemplo 2
        System.out.println("\nEjemplo 2: LinkedList de string");
        LinkedList<String> palabras = new LinkedList<>();

        // Agregar elementos a la LinkedList
        palabras.add("Hola");
        palabras.add("grupo");
        palabras.add("Desarrollo software!");

        // Acceder a un elemento de la LinkedList
        System.out.println("Primer elemento: " + palabras.get(0));

        // Modificar un elemento de la LinkedList
        palabras.set(1, "Arley");
        System.out.println("Segundo elemento después de la modificación: " + palabras.get(1));

        // Tamaño de la LinkedList
        System.out.println("Tamaño de la LinkedList: " + palabras.size());

        // Recorrer la LinkedList
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Ejemplo 3
        System.out.println("\nEjemplo 3: LinkedList de objetos personalizados");
        class Automovil {
            private String marca;
            private String modelo;

            public Automovil(String marca, String modelo) {
                this.marca = marca;
                this.modelo = modelo;
            }

            public String getMarca() {
                return marca;
            }

            public String getModelo() {
                return modelo;
            }
        }

        LinkedList<Automovil> autos = new LinkedList<>();

        // Agregar elementos al LinkedList
        autos.add(new Automovil("Auteco", "Pulsar"));
        autos.add(new Automovil("Yamaha", "XTZ"));
        autos.add(new Automovil("KTM", "Duke"));

        // Acceder a un elemento del LinkedList
        System.out.println("Primer elemento: " + autos.get(0).getMarca() + " " + autos.get(0).getModelo());

        // Modificar un elemento del LinkedList
        autos.set(1, new Automovil("Auteco", "Dominar"));
        System.out.println("Segundo elemento después de la modificación: " + autos.get(1).getMarca() + " " + autos.get(1).getModelo());

        // Tamaño del LinkedList
        System.out.println("Tamaño del LinkedList: " + autos.size());

        // Recorrer el LinkedList
        for (Automovil auto : autos) {
            System.out.println(auto.getMarca() + " " + auto.getModelo());
        }

    }
}
