package org.example.list;
import java.util.LinkedList;

public class LinkedListPractice {

    public void run (){

        LinkedListSingleton list = LinkedListSingleton.getInstance();
        list.add("hello");
        list.add("world");
        System.out.println("Size: " + list.size());
        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));
        System.out.println(list.toString());
    }
}


 class LinkedListSingleton {
    private static LinkedListSingleton instance = null;
    private LinkedList<Object> list;

    private LinkedListSingleton() {
        list = new LinkedList<Object>();
    }

    public static LinkedListSingleton getInstance() {
        if (instance == null) {
            instance = new LinkedListSingleton();
            System.out.println("Creacion de instancia");
        }
        System.out.println("Instancia reutilizada ");
        return instance;
    }

    public void add(Object element) {
        list.add(element);
    }

    public Object get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

     @Override
     public String toString() {
         return "LinkedListSingleton{" +
                 "list=" + list +
                 '}';
     }
 }