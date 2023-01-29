package org.example.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */

    public void ejemploUnoArrayList() {
        ArrayList<Contacto> list = new ArrayList<>();
        /**
         * Crear una nueva instancia de ArrayList
         */
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
                     * Añadir elementos al ArrayList
                     */
                    list.add(new Contacto(nombre,apellido,telefono));
                    break;
                case 2:
                    System.out.println("Digite el numero de telefono del contacto que desea eliminar");
                    long telefono1 = in.nextLong();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getTelefono() == telefono1) {
                            /**
                             * Eliminar elementos del ArrayList
                             */
                            list.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Contacto contacto : list) {
                        /**
                         * Recorrer el ArrayList
                         */
                        System.out.println(contacto.toString());
                    }
                    break;
                case 4: System.exit(0);
                    break;
                default:
                    System.out.println("Opción Incorrecta");
            }

        }while (opc != 4);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ejemploDosArrayList() {
        /**
         * Crear una nueva instancia de ArrayList
         */
        ArrayList<Carro> carros = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Inventario de Autos");
            System.out.println("1. Agregar Auto");
            System.out.println("2. Eliminar Auto");
            System.out.println("3. Ver todos los autos");
            System.out.println("4. Eliminar todos los autos.");
            System.out.println("5. Cuantos Autos hay agregados?");
            System.out.println("6. Salir");
            opc = in.nextInt();

            in.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Marca del auto");
                    String marca = in.nextLine();
                    System.out.println("Modelo del auto");
                    String modelo = in.nextLine();
                    System.out.println("Numero de placa");
                    String placa = in.nextLine();
                    /**
                     * Añadir elementos al ArrayList
                     */
                    carros.add(new Carro(marca,modelo,placa));
                    break;
                case 2:
                    System.out.println("Digite la placa del auto que desea eliminar");
                    String placa1 = in.nextLine();

                    for (int i = 0; i < carros.size(); i++) {
                        if (carros.get(i).getPlaca().equals(placa1)) {
                            /**
                             * Eliminar elementos del ArrayList
                             */
                            carros.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    /**
                     * Recorrer el ArrayList
                     */
                    for (Carro carro : carros) {
                        System.out.println("Marca: " + carro.getMarca() + "\nModelo: " + carro.getModelo() + "\nPlaca: " + carro.getPlaca());
                    }
                    break;
                case 4:
                    /**
                     * Limpiar el ArrayList
                     */
                    carros.clear();
                    break;
                case 5:
                    /**
                     * Ver el tamaño del ArrayList
                     */
                    System.out.println(carros.size() + " autos");
                    break;
                case 6: System.exit(0);
                    break;
                default:
                    System.out.println("Opción Incorrecta");

            }
        }while (opc != 6);


    }
    /////////////////////////////////////////////////////////////////////////////
    public void ejemploTresArrayList() {
        /**
         * Crear una nueva instancia de ArrayList
         */
        ArrayList<Persona> personas = new ArrayList<Persona>();
        /**
         * Añadir elementos al ArrayList
         */
        Persona persona1 = new Persona("Jairo", "Peñaloza", 21);
        Persona persona2 = new Persona("Martha", "Gomez", 38);
        Persona persona3 = new Persona("Paula", "Sanabria", 40);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        /**
         * Acceder a los elementos del ArrayList
         */
        Persona primerPersona = personas.get(0);
        Persona segundaPersona = personas.get(1);

        /**
         * Eliminar elementos del ArrayList
         */
        personas.remove(1); // Elimina a Martha Gomez
        personas.remove(persona3); // Elimina a Paula Sanabria
        /**
         *        Tamaño del ArrayList
         */
        System.out.println("N° de Personas: " + personas.size());

        /**
         * Recorrer el ArrayList
         */
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " (" + persona.getEdad() + " años)");
        }
    }

}



