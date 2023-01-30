package org.example.map;
import java.sql.SQLOutput;
import java.util.HashMap;

public class HashMapPractice {

    public void hashMap1() {
        System.out.println("Ejemplo de Hash Map 1 con Nombres y edades");
        HashMap<String, Integer> ages = new HashMap<String, Integer>();

        ages.put("Anderson",23);
        ages.put("Mariana", 21);
        ages.put("Gabriel", 32);
        System.out.println(getSize(ages));
        System.out.println(ages);
        System.out.println("Obteniendo el valor mediante la clave Anderson");
        System.out.println(ages.get("Anderson"));
        System.out.println("Removiendo el elemento Anderson de la coleccion");
        ages.remove("Anderson");
        System.out.println(getSize(ages));
        System.out.println(ages);
    }

    public void hashMap2() {
        System.out.println("\n Ejemplo de Hash Map 2 con Paises y Capitales");
        HashMap<String, String> capitales = new HashMap<String, String>();

        capitales.put("Colombia", "Bogota");
        capitales.put("Argentina", "Buenos Aires");
        capitales.put("Chile", "Santiago de Chile");
        capitales.put("Costa Rica", "San Jose");

        System.out.println(getSize(capitales));
        System.out.println(capitales);
        System.out.println("Obteniendo el valor mediante la clave Argentina");
        System.out.println(capitales.get("Argentina"));
        System.out.println("Removiendo el elemento Argentina de la coleccion");
        capitales.remove("Argentina");
        System.out.println(getSize(capitales));
        System.out.println(capitales);
    }

    public void hashMap3() {
        System.out.println("\n Ejemplo de Hash Map 3 con Palabra y Traduccion");
        HashMap<String, String> traducciones = new HashMap<String, String>();

        traducciones.put("Hola", "Hello");
        traducciones.put("Como estas?", "How are you?");
        traducciones.put("Gracias", "Thanks");
        traducciones.put("Te quiero", "I love you");

        System.out.println(getSize(traducciones));
        System.out.println(traducciones);
        System.out.println("Obteniendo el valor mediante la clave Como estas?");
        System.out.println(traducciones.get("Como estas?"));
        System.out.println("Removiendo el elemento Como estas? de la coleccion");
        traducciones.remove("Como estas?");
        System.out.println(getSize(traducciones));
        System.out.println(traducciones);
    }






    public String getSize(HashMap hash) {
        int size = hash.size();
        return " El tamaño actual de la coleccion es " + size;
    }
}
