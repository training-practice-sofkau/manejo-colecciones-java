package org.example.list.factoryandobserverpatron;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
En este ejemplo, se utiliza la clase `MenuFactory`
para crear instancias de `Menu` utilizando diferentes implementaciones
(en este caso `ArrayListMenu` y `LinkedListMenu`). Luego, se utiliza la clase
`MenuObserver` para registrar un observer en el menú y recibir notificaciones de
cambios en el mismo.  Además, se implementaron los métodos `addOption`, `removeOption` y `searchOption`
en ambas clases de menús y se notifica a los observers en cada uno de estos métodos.
*/
abstract class MenuFactory {
    public abstract Menu createMenu();
}

class ArrayListMenuFactory extends MenuFactory {
    public Menu createMenu() {
        return new ArrayListMenu();
    }
}

class LinkedListMenuFactory extends MenuFactory {
    public Menu createMenu() {
        return new LinkedListMenu();
    }
}

interface Observer {
    void update();
}

class MenuObserver implements Observer {
    private Menu menu;

    public MenuObserver(Menu menu) {
        this.menu = menu;
        menu.registerObserver(this);
    }

    public void update() {
        System.out.println("Menu updated:");
        menu.displayMenu();
    }
}

interface Menu {
    void addOption(String option);
    void removeOption(String option);
    void searchOption(String option);
    void displayMenu();
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class ArrayListMenu extends ArrayList<String> implements Menu {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addOption(String option) {
        add(option);
        notifyObservers();
    }

    public void removeOption(String option) {
        remove(option);
        notifyObservers();
    }

    public void searchOption(String option) {
        if(contains(option)){
            System.out.println("Option found: " + option);
        }else{
            System.out.println("Option not found: " + option);
        }
    }

    public void displayMenu() {
        System.out.println("Menu options:");
        for (String option : this) {
            System.out.println(option);
        }
    }
}

class LinkedListMenu extends LinkedList<String> implements Menu {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addOption(String option) {
        add(option);
        notifyObservers();
    }

    public void removeOption(String option) {
        remove(option);
        notifyObservers();
    }

    public void searchOption(String option) {
        if(contains(option)){
            System.out.println("Option found: " + option);
        }else{
            System.out.println("Option not found: " + option);
        }
    }

    public void displayMenu() {
        System.out.println("Menu options:");
        for (String option : this) {
            System.out.println(option);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MenuFactory factory = new ArrayListMenuFactory();
        Menu menu = factory.createMenu();
        MenuObserver observer = new MenuObserver(menu);


        menu.addOption("Option 1");
        menu.addOption("Option 2");
        menu.addOption("Option 3");

        menu.searchOption("Option 4");
        menu.searchOption("Option 2");
        menu.removeOption("Option 2");
    }
}