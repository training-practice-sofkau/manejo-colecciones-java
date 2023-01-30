package org.example.set;


import java.util.HashSet;

public class HashSetPractice {

    public void ejecutar() {
        HashSet<Pais> paises = new HashSet<>();


        Pais Colombia = new Pais("Colombia", 10000, "castellano");
        Pais EEUU = new Pais("EEUU", 50000, "Ingles");
        Pais Mexico = new Pais("Mexico", 30000, "castellano");
        Pais Argentina = new Pais("Argentina", 20000, "castellano");
        Pais Venezuela = new Pais("Venezuela", 90000, "venezolano");

        paises.add(Colombia);
        paises.add(EEUU);
        paises.add(Mexico);
        paises.add(Venezuela);

        // Verificar si existe un país en el conjunto
        System.out.println(paises.contains(new Pais("Mexico", 2000, "castellano"))); // Output: true

        // Remover un país del conjunto
        paises.remove(Colombia);

        // Verificar el tamaño del conjunto
        System.out.println(paises.size()); // Output: 2

        // Limpiar el conjunto
        paises.clear();

        // Verificar si el conjunto está vacío
        System.out.println(paises.isEmpty()); // Output: true

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