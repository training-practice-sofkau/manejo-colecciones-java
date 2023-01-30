package org.example.list;

import java.util.ArrayList;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     */
    public static void main() {
        // Ejemplo 1
        System.out.println("Ejemplo 1: ArrayList de enteros");
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar elementos al ArrayList
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Acceder a un elemento del ArrayList
        System.out.println("Tercer elemento: " + numeros.get(2));

        // Modificar un elemento del ArrayList
        numeros.set(1, 4);
        System.out.println("Segundo elemento después de la modificación: " + numeros.get(1));

        // Eliminar un elemento del ArrayList
        numeros.remove(2);

        // Tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + numeros.size());

        // Ejemplo 2
        System.out.println("\nEjemplo 2: ArrayList de string");
        ArrayList<String> palabras = new ArrayList<>();

        // Agregar elementos al ArrayList
        palabras.add("Hola");
        palabras.add("grupo");
        palabras.add("QA/Automation!");

        // Acceder a un elemento del ArrayList
        System.out.println("Primer elemento: " + palabras.get(0));

        // Modificar un elemento del ArrayList
        palabras.set(1, "James");
        System.out.println("Segundo elemento después de la modificación: " + palabras.get(1));

        // Eliminar un elemento del ArrayList
        palabras.remove(2);

        // Recorrer el ArrayList
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Ejemplo 3
        System.out.println("\nEjemplo 3: ArrayList de objetos personalizados");
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

        ArrayList<Automovil> autos = new ArrayList<>();

        // Agregar elementos al ArrayList
        autos.add(new Automovil("Auteco", "Pulsar"));
        autos.add(new Automovil("Yamaha", "XTZ"));
        autos.add(new Automovil("KTM", "Duke"));

        // Acceder a un elemento del ArrayList
        System.out.println("Primer elemento: " + autos.get(0).getMarca() + " " + autos.get(0).getModelo());

        // Modificar un elemento del ArrayList
        autos.set(1, new Automovil("Auteco", "Dominar"));
        System.out.println("Segundo elemento después de la modificación: " + autos.get(1).getMarca() + " " + autos.get(1).getModelo());

        // Tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + autos.size());

        // Recorrer el ArrayList
        for (Automovil auto : autos) {
            System.out.println(auto.getMarca() + " " + auto.getModelo());
        }

    }
}

