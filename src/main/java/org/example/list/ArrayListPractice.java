package org.example.list;
import java.util.ArrayList;


public class ArrayListPractice {

    public void run (){
        ArrayList<Integer> list = new ArrayListBuilder<Integer>()
                .add(10)
                .add(60)
                .add(89)
                .build();
        System.out.println(list.toString());
    }


    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
}
 class ArrayListBuilder<E> {
    private ArrayList<E> list;

    public ArrayListBuilder() {
        list = new ArrayList<E>();
    }

    public ArrayListBuilder<E> add(E element) {
        list.add(element);
        System.out.println(element);
        return this;
    }

    public ArrayList<E> build() {
        return list;
    }

     @Override
     public String toString() {
         return "ArrayListBuilder{" +
                 "list=" + list +
                 '}';
     }
 }
