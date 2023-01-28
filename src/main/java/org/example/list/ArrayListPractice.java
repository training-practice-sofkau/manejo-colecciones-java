package org.example.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     */
    Scanner entrada = new Scanner(System.in);
    Perros perros = new Perros();
    Gatos gatos = new Gatos();
    Identificacion identificacion = new Identificacion();

    public void ejecutar() {
        int opc;

        do {
            System.out.println("_________________EJERCICIOS ARRAYLIST_________________");
            System.out.println("1. Ejercicio 1\n" +
                    "2. Ejercicio 2\n" +
                    "3. Ejercicio 3\n" +
                    "4. <--- Atras");
            System.out.print("Digite una opcion: ");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("----------------------------------------------------------------------");
                    gatos.ejecutar();
                    break;
                case 2:
                    System.out.println("----------------------------------------------------------------------");
                    perros.ejecutar();
                    break;
                case 3:
                    System.out.println("----------------------------------------------------------------------");
                    identificacion.ejecutar();
                    break;
                case 4:
                    System.out.println("Saliendo.....");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opc < 4);
        System.out.println("_______________________________________________________________-");

    }

}
