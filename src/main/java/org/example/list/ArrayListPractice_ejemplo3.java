package org.example.list;

import java.util.ArrayList;

public class ArrayListPractice_ejemplo3 {

    public  void main() {
        // Creo una lista de objetos Ghost (fantasma)
        ArrayList<Ghost> fantasmas = new ArrayList<>();

        // Agrego elementos a mi lista
        fantasmas.add(new Ghost("Spooky", "Casa embrujada", 10));
        fantasmas.add(new Ghost("Boo", "Cementerio", 8));
        fantasmas.add(new Ghost("Ghoulie", "Laberinto", 7));

        // Imprimo todos los elementos de mi lista de fantasmas
        System.out.println("Mi lista de fantasmas es: ");
        //recorro mi lista
        for (Ghost fantasma : fantasmas) {
            System.out.println(fantasma.getNombre() + " - " + fantasma.getLugar() + " - Nivel de miedo: " + fantasma.getNivelDeMiedo());
        }

        // Busco un fantasma en mi lista
        Ghost objetivo = null;
        //recorro la lista
        for (Ghost fantasma : fantasmas) {
            if (fantasma.getNombre().equals("Boo")) {
                objetivo = fantasma;
                break;
            }
        }
        //imprimo
        System.out.println("\nEl fantasma buscado es " + objetivo.getNombre() + " y su nivel de miedo es " + objetivo.getNivelDeMiedo());

        // Elimino un fantasma de mi lista
        fantasmas.remove(objetivo);
        System.out.println("\nLista de fantasmas después de eliminar a 'Boo': ");
        //recorro mi lista
        for (Ghost fantasma : fantasmas) {
            System.out.println(fantasma.getNombre() + " - " + fantasma.getLugar() + " - Nivel de miedo: " + fantasma.getNivelDeMiedo());
        }
    }
}

// Clase Ghost para crear mis objetos(fantasmas)
class Ghost {
    private String nombre;
    private String lugar;
    private int nivelDeMiedo;

    public Ghost(String nombre, String lugar, int nivelDeMiedo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.nivelDeMiedo = nivelDeMiedo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public int getNivelDeMiedo() {
        return nivelDeMiedo;
    }
}
