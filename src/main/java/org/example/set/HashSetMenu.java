package org.example.set;

import java.util.HashSet;
import java.util.Scanner;
/*
En este ejemplo se crearon clases para cada una de las operaciones en el HashSet
(AddCommand, RemoveCommand, ContainsCommand, SizeCommand y PrintCommand)
 que implementan la interfaz Command. Cada clase tiene un método execute() que
 realiza la operación correspondiente. En el método main(), se crea un objeto de cada clase
 y se almacena en una variable de tipo Command. En el switch statement se selecciona la operación
 a realizar y se llama al método execute() del objeto correspondiente.
*/
public class HashSetMenu {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("--- Menú de operaciones en HashSet ---");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Comprobar si contiene un elemento");
            System.out.println("4. Mostrar tamaño del conjunto");
            System.out.println("5. Mostrar elementos del conjunto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el elemento a añadir: ");
                    String elemento = sc.nextLine();
                    set.add(elemento);
                    System.out.println("Elemento añadido.");
                    break;
                case 2:
                    System.out.print("Introduce el elemento a eliminar: ");
                    elemento = sc.nextLine();
                    set.remove(elemento);
                    System.out.println("Elemento eliminado.");
                    break;
                case 3:
                    System.out.print("Introduce el elemento a buscar: ");
                    elemento = sc.nextLine();
                    if (set.contains(elemento)) {
                        System.out.println("El conjunto contiene el elemento.");
                    } else {
                        System.out.println("El conjunto no contiene el elemento.");
                    }
                    break;
                case 4:
                    System.out.println("Tamaño del conjunto: " + set.size());
                    break;
                case 5:
                    System.out.println("Elementos del conjunto: " + set);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 6);
        sc.close();
    }
}
