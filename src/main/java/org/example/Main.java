package org.example;
import org.example.colecciones.escenario1.CorrerEscenario1;
import org.example.colecciones.escenario2.CorrerEscenario2;
import org.example.colecciones.escenario3.CorrerEscenario3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean ejecutarMenu = true;

        while (ejecutarMenu) {
            System.out.println("Bienvenido(a)");
            System.out.println("Selecciona una opción");
            System.out.println("1. Para correr escenario 1 (Supermercado)");
            System.out.println("2. Para correr escenario 2 (Parqueadero)");
            System.out.println("3. Para correr escenario 3 (Aeropuerto)");
            System.out.println("4. Para salir");
            int opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    CorrerEscenario1 escenario1 = new CorrerEscenario1();
                    escenario1.correrEscenario();
                    break;

                case 2:
                    CorrerEscenario2 escenario2 = new CorrerEscenario2();
                    escenario2.correrEscenario();
                    break;

                case 3:
                    CorrerEscenario3 escenario3 = new CorrerEscenario3();
                    escenario3.correrEscenario();
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    ejecutarMenu = false;
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        }
    }
}