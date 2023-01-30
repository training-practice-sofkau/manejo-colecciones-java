package org.example.set;


import java.util.HashSet;

public class HashSetPractice {

    public void ejecutar() {
        HashSet<VideoJuego> videoJuegos = new HashSet<>();


        VideoJuego juego1 = new VideoJuego("valoran", "1 a 1 ", "castellano");
        VideoJuego juego2 = new VideoJuego("fornite", "1 a 1", "Ingles");
        VideoJuego juego3 = new VideoJuego("halo", "1 a 1", "castellano");


        videoJuegos.add(juego1);
        videoJuegos.add(juego2);
        videoJuegos.add(juego3);

        // Verificar si existe un país en el conjunto
        System.out.println(videoJuegos.contains(new VideoJuego("Mexico", "1 a 1 ", "castellano"))); // Output: true

        // Remover un país del conjunto
        videoJuegos.remove(juego2);

        // Verificar el tamaño del conjunto
        System.out.println(videoJuegos.size()); // Output: 2

        // Limpiar el conjunto
        videoJuegos.clear();

        // Verificar si el conjunto está vacío
        System.out.println(videoJuegos.isEmpty()); // Output: true

    }
}

/**
 * Para tener en cuenta
 * add(E e): agrega un elemento al HashSet.
 * clear(): elimina todos los elementos del HashSet.
 * contains(Object o): devuelve verdadero si el objeto dado se encuentra en el HashSet.
 * isEmpty(): devuelve verdadero si el HashSet está vacío.
 * iterator(): devuelve un iterador sobre los elementos del HashSet.
 * remove(Object o): elimina el objeto dado del HashSet.
 * size(): devuelve el número de elementos en el HashSet.
 */