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

            System.out.println("_______________________________________________________________-EJERCICIOS ARRAYLIST___________________________________________________");
                    System.out.println("----------------------------------------------------------------------");
                    gatos.ejecutar();
                    System.out.println("----------------------------------------------------------------------");
                    perros.ejecutar();
                    System.out.println("----------------------------------------------------------------------");
                    identificacion.ejecutar();
                    System.out.println("______________________________________________________________________");


    }

}
