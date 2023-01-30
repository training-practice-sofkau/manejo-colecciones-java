package org.example.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Obtener elemento");
            System.out.println("4. Mostrar todos los elementos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addElement();
                    break;
                case 2:
                    removeElement();
                    break;
                case 3:
                    getElement();
                    break;
                case 4:
                    showAllElements();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public static void addElement() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una clave: ");
        int key = input.nextInt();
        System.out.print("Ingrese un valor: ");
        String value = input.next();
        map.put(key, value);
        System.out.println("Elemento agregado");
    }

    public static void removeElement() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la clave del elemento a eliminar: ");
        int key = input.nextInt();
        if (map.remove(key) != null) {
            System.out.println("Elemento eliminado");
        } else {
            System.out.println("Clave no encontrada");
        }
    }

    public static void getElement() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la clave del elemento a obtener: ");
        int key = input.nextInt();
        if (map.containsKey(key)) {
            System.out.println("Valor: " + map.get(key));
        } else {
            System.out.println("Clave no encontrada");
        }
    }

    public static void showAllElements() {
        if (map.isEmpty()) {
            System.out.println("No hay elementos en el mapa");
        } else {
            for (Integer key : map.keySet()) {
                System.out.println("Clave: " + key + ", Valor: " + map.get(key));
            }
        }
    }
}
