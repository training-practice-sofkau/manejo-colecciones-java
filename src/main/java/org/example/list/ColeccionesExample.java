package org.example.list;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ColeccionesExample {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
        public  void main() {
            // Crear una lista de frutas
            List<String> frutas = new ArrayList<>();
            frutas.add("manzana");
            frutas.add("banana");
            frutas.add("pera");
            frutas.add("kiwi");

            // Crear un mapa que asocia cada fruta con su precio
            Map<String, Double> precios = new HashMap<>();
            precios.put("manzana", 1.5);
            precios.put("banana", 0.8);
            precios.put("pera", 2.0);
            precios.put("kiwi", 1.2);

            // Crear un conjunto con los nombres de las frutas disponibles
            Set<String> disponibles = new HashSet<>(frutas);

            // Imprimir el precio de una fruta específica
            System.out.println("El precio de una manzana es: $" + precios.get("manzana"));

            // Imprimir las frutas disponibles
            System.out.println("Frutas disponibles: " + disponibles);
        }

}
