package org.example.map.builderpatron;
import java.util.HashMap;
import java.util.Scanner;
/*
El patrón Builder es un patrón de diseño de creación que
permite construir objetos complejos paso a paso mediante una interfaz.
 En este ejemplo, se podría utilizar para agregar las opciones al menú de forma ordenada y estructurada,
 en lugar de agregarlas directamente en el método main.
*/
public class Menu {
    private HashMap<Integer, MenuOption> menuOptions;

    public HashMap<String, Integer> hashMap = new HashMap<>();
    private static MenuOptionFactory optionFactory;

    public Menu() {
        menuOptions = new HashMap<>();
        optionFactory = new MenuOptionFactory();
    }

    public void addOption(int key, String optionType) {
        menuOptions.put(key, optionFactory.createOption(optionType));
    }

    public void showMenu() {
        System.out.println("Seleccione una opción:");
        for (Integer key : menuOptions.keySet()) {
            System.out.println(key + ". " + menuOptions.get(key).getOptionName());
        }
    }

    public void selectOption() {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        MenuOption selectedOption = menuOptions.get(choice);
        if (selectedOption != null) {
            selectedOption.execute();
        } else {
            System.out.println("Opción inválida");
        }
    }
}

abstract class MenuOption {
    public abstract void execute();
    public abstract String getOptionName();
}

class AddOption extends MenuOption {
    public HashMap<String, Integer> hashMap = new HashMap<>();
    public void execute() {
        System.out.println("Ingrese la clave:");
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        System.out.println("Ingrese el valor:");
        int value = input.nextInt();
        hashMap.put(key, value);
    }
    public String getOptionName() {
        return "Agregar elemento";
    }
}

class RemoveOption extends MenuOption {
    public HashMap<String, Integer> hashMap = new HashMap<>();
    public void execute() {
        System.out.println("Ingrese la clave del elemento a remover:");
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        hashMap.remove(key);
    }
    public String getOptionName() {
        return "Remover elemento";
    }
}

class GetOption extends MenuOption {
    public HashMap<String, Integer> hashMap = new HashMap<>();
    public void execute() {
        System.out.println("Ingrese la clave del elemento a obtener:");
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        System.out.println("Valor: " + hashMap.get(key));
    }
    public String getOptionName() {
        return "Obtener elemento";
    }
}

class ShowOption extends MenuOption {
    public HashMap<String, Integer> hashMap = new HashMap<>();
    public void execute() {
        for (String key : hashMap.keySet()) {
            System.out.println("Clave: " + key + ", valor: " + hashMap.get(key));
        }
    }
    public String getOptionName() {
        return "Mostrar elementos";
    }
}
class ExitOption extends MenuOption {
    public void execute() {
        System.exit(0);
    }
    public String getOptionName() {
        return "Salir";
    }
}

class MenuOptionFactory {
    public MenuOption createOption(String optionType) {
        switch (optionType) {
            case "add":
                return new AddOption();
            case "remove":
                return new RemoveOption();
            case "get":
                return new GetOption();
            case "show":
                return new ShowOption();
            case "exit":
                return new ExitOption();
            default:
                return null;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
//Aquí se agregarían las opciones al menú utilizando el patrón Builder
//Por ejemplo:
          menu.addOption(1, "add");
          menu.addOption(2, "remove");
          menu.addOption(3, "get");
          menu.addOption(4, "show");
          menu.addOption(5, "exit");
          menu.showMenu();menu.selectOption();
    }
}



