package org.example.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetPractice {
    /**
     * Un HashSet es una colección de elementos donde cada elemento es único
     * Patron de Diseño Factory
     */
    public void ejecutar() {


        List<Barrio> fabricaDeBarriosArmenia = new ArrayList<>();
        HashSet<String> fabricaUnica = new HashSet<String>();

        fabricaUnica.add("manantiales");
        fabricaUnica.add("Alfonso Lopez");
        fabricaUnica.add("manantiales");
        fabricaUnica.add("La Patria");

        /**
         * Esta linea solo comprueba el funcionamiento del HashSet
         */
        System.out.println(fabricaUnica);

        for (String barrioNuevo : fabricaUnica) {
            fabricaDeBarriosArmenia.add(new BarrioFactoryArmenia().construirNuevoBarrio(barrioNuevo));
        }

        for (Barrio barrios : fabricaDeBarriosArmenia) {
            barrios.construirBarrio();
        }

    }

}

