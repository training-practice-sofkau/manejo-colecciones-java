package org.example.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice_ejemplo1 {
    public  void main (){
        //creo mi coleccion
        LinkedList<String> paises= new LinkedList<String>();

        //añado objetos a mi coleccion
        paises.add("España");
        paises.add("Estados Unidos");
        paises.add("Australia");
        paises.add("Colombia");
        paises.add("Portugal");

        //creo mi segunda coleccion
        LinkedList<String> capitales= new LinkedList<String>();

        //añado objetos a mi nueva coleccion
        capitales.add("Madrid");
        capitales.add("Washington DC");
        capitales.add("Camberra");
        capitales.add("Bogota");
        capitales.add("Lisboa");

        System.out.println(paises);
        System.out.println(capitales);

        //voy a meter la lista de capitales dentro de la lista de los paises,
        //y hago uso de dos iteradores para recorrer las listas en las direcciones que necesite.

        ListIterator<String> iterP = paises.listIterator();
        ListIterator<String> iterC = capitales.listIterator();

        while (iterC.hasNext()){
            if (iterP.hasNext()){
                iterP.next();
            }
            iterP.add(iterC.next());
        }
        System.out.println(paises);
    }

}

