package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListPractice_ejemplo2 {


        public  void main() {
            // Creo una lista de nombres de comidas
            ArrayList<String> comidas = new ArrayList<>();

            // Agrego objetos a mi lista
            comidas.add("Pizza");
            comidas.add("Hamburguesa");
            comidas.add("Tacos");
            comidas.add("Salchipapas");

            // Mezclo la lista de mis comidas
            Collections.shuffle(comidas);

            // Elijo una comida al azar
            Random rand = new Random();
            int índice = rand.nextInt(comidas.size());
            String comidaElegida = comidas.get(índice);

            // Imprimo la comida elegida al azar
            System.out.println("La comida elegida al azar fue : " + comidaElegida);
        }
}

