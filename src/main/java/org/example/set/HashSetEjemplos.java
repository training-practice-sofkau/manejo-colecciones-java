package org.example.set;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetEjemplos {

    public void HashSet1() {
        System.out.println("Ejemplo de HashSet de Motos");
        HashSet<String> motos = new HashSet<String>();
        motos.add("YZ 2022");
        motos.add("Biwis 2");
        motos.add("Kawasaki Z1000");
        System.out.println(motos);

        System.out.println("Usando contains para verificar si existe una moto YZ 2022");
        verify(motos, "YZ 2022");
        System.out.println(getSize(motos));
    }

    public void HashSet2() {
        System.out.println("Ejemplo de HashSet de Peliculas");
        HashSet<String> peliculas = new HashSet<String>();
        peliculas.add("Avatar");
        peliculas.add("Terminator");
        peliculas.add("Interestelar");
        peliculas.add("Frozen");
        System.out.println(getSize(peliculas));
        System.out.println(peliculas);
        System.out.println("Usando contains para verificar si existe la pelicula Frozen y removerla");
        delete(peliculas, "Frozen");
        System.out.println(getSize(peliculas));
    }


    public void verify(HashSet set, String moto) {
        if (set.contains(moto) == true){
            System.out.println("La moto "+moto +" SI existe en el HashSet");
        }else {
            System.out.println("La moto "+moto +" NO existe en el HashSet");
        }
    }

    public void delete(HashSet set, String pelicula){
        if (set.contains(pelicula) == true){
            System.out.println("La pelicula "+pelicula +" SI existe en el HashSet");
            set.remove(pelicula);
            System.out.println("La pelicula "+pelicula+ " se elimino del set");
        }else {
            System.out.println("La pelicula "+pelicula +" NO existe en el HashSet");
        }
    }

    public String getSize(HashSet set) {
        int size = set.size();
        return " El tamaño actual de la coleccion HashSet es " + size;
    }
}
