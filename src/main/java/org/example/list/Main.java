package org.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

interface Menu {
    void addItem(String item);
    void removeItem(String item);
    boolean searchItem(String item);
    void displayMenu();
}

class ArrayListMenu implements Menu {
    private List<String> menuItems;

    public ArrayListMenu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(String item) {
        menuItems.add(item);
    }

    public void removeItem(String item) {
        menuItems.remove(item);
    }

    public boolean searchItem(String item) {
        return menuItems.contains(item);
    }

    public void displayMenu() {
        System.out.println("ArrayList Menu");
        for (String item : menuItems) {
            System.out.println(item);
        }
    }
}

class LinkedListMenu implements Menu {
    private List<String> menuItems;

    public LinkedListMenu() {
        menuItems = new LinkedList<>();
    }

    public void addItem(String item) {
        menuItems.add(item);
    }

    public void removeItem(String item) {
        menuItems.remove(item);
    }

    public boolean searchItem(String item) {
        return menuItems.contains(item);
    }

    public void displayMenu() {
        System.out.println("LinkedList Menu");
        for (String item : menuItems) {
            System.out.println(item);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;
        boolean found;

        ArrayListMenu arrayListMenu = new ArrayListMenu();
        arrayListMenu.addItem("1");
        arrayListMenu.addItem("2");
        arrayListMenu.addItem("3");
        arrayListMenu.displayMenu();

        System.out.print("Enter item to search: ");
        item = scanner.nextLine();
        found = arrayListMenu.searchItem(item);
        if (found) {
            System.out.println("Item found in ArrayList menu");
        } else {
            System.out.println("Item not found in ArrayList menu");
        }

        System.out.print("Enter item to remove: ");
        item = scanner.nextLine();
        arrayListMenu.removeItem(item);
        arrayListMenu.displayMenu();

        LinkedListMenu linkedListMenu = new LinkedListMenu();
        linkedListMenu.addItem("A");
        linkedListMenu.addItem("B");
        linkedListMenu.addItem("C");
        linkedListMenu.displayMenu();

        System.out.print("Enter item to search: ");
        item = scanner.nextLine();
        found = linkedListMenu.searchItem(item);
        if (found) {
            System.out.println("Item found in LinkedList menu");
        } else {

            System.out.println("Item not found in LinkedList menu");
        }
        System.out.print("Enter item to remove: ");
        item = scanner.nextLine();
        linkedListMenu.removeItem(item);
        linkedListMenu.displayMenu();

        scanner.close();
    }
}