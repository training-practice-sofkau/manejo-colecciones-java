package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEjemplo1 {

    /**
     * En este ejemplo, creamos un objeto HashSet de tipo String para almacenar
     * un conjunto de colores. Luego, añadimos varios elementos al conjunto.
     * La salida mostrará que el HashSet sólo contiene elementos únicos,
     * incluso si se intenta añadir un elemento duplicado.
     *
     *
     * @param args
     */
    public void main() {
        // Crea un nuevo objeto HashSet
        Set<String> colores = new HashSet<>();

        // Añade elementos al HashSet
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Negro");

        // Imprime el HashSet
        System.out.println("Colores: " + colores);

        // Intenta añadir un elemento duplicado
        colores.add("Rojo");
        System.out.println("Colores: " + colores);
    }
}
