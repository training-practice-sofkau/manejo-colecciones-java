package org.example.set;
import java.util.HashSet;
import java.util.Scanner;
/*
En este ejemplo se crearon clases para cada una de las operaciones en el HashSet
(AddCommand, RemoveCommand, ContainsCommand, SizeCommand y PrintCommand)
 que implementan la interfaz Command. Cada clase tiene un método execute() que
 realiza la operación correspondiente. En el método main(), se crea un objeto de cada clase
 y se almacena en una variable de tipo Command. En el switch statement se selecciona la operación
 a realizar y se llama al método execute() del objeto correspondiente.
*/
public class Menu {

    interface Command {
        void execute();
    }

    class AddCommand implements Command {
        private HashSet<String> set;
        private Scanner sc;

        public AddCommand(HashSet<String> set, Scanner sc) {
            this.set = set;
            this.sc = sc;
        }

        @Override
        public void execute() {
            System.out.print("Introduce el elemento a añadir: ");
            String elemento = sc.nextLine();
            set.add(elemento);
            System.out.println("Elemento añadido.");
        }
    }

    class RemoveCommand implements Command {
        private HashSet<String> set;
        private Scanner sc;

        public RemoveCommand(HashSet<String> set, Scanner sc) {
            this.set = set;
            this.sc = sc;
        }

        @Override
        public void execute() {
            System.out.print("Introduce el elemento a eliminar: ");
            String elemento = sc.nextLine();
            set.remove(elemento);
            System.out.println("Elemento eliminado.");
        }
    }

    class ContainsCommand implements Command {
        private HashSet<String> set;
        private Scanner sc;

        public ContainsCommand(HashSet<String> set, Scanner sc) {
            this.set = set;
            this.sc = sc;
        }

        @Override
        public void execute() {
            System.out.print("Introduce el elemento a buscar: ");
            String elemento = sc.nextLine();
            if (set.contains(elemento)) {
                System.out.println("El conjunto contiene el elemento.");
            } else {
                System.out.println("El conjunto no contiene el elemento.");
            }
        }
    }

    class SizeCommand implements Command {
        private HashSet<String> set;

        public SizeCommand(HashSet<String> set) {
            this.set = set;
        }

        @Override
        public void execute() {
            System.out.println("Tamaño del conjunto: " + set.size());
        }
    }

    class PrintCommand implements Command {
        private HashSet<String> set;

        public PrintCommand(HashSet<String> set) {
            this.set = set;
        }

        @Override
        public void execute() {
            System.out.println("Elementos del conjunto: " + set);
        }
    }

    public class HashSetMenu {
        public void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            Scanner sc = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("--- Menú de operaciones en HashSet ---");
                System.out.println("1. Añadir elemento");
                System.out.println("2. Eliminar elemento");
                System.out.println("3. Comprobar si contiene un elemento");
                System.out.println("4. Ver tamaño del conjunto");
                System.out.println("5. Imprimir elementos del conjunto");
                System.out.println("6. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();
                Command command = null;
                switch (opcion) {
                    case 1:
                        command = new AddCommand(set, sc);
                        break;
                    case 2:
                        command = new RemoveCommand(set, sc);
                        break;
                    case 3:
                        command = new ContainsCommand(set, sc);
                        break;
                    case 4:
                        command = new SizeCommand(set);
                        break;
                    case 5:
                        command = new PrintCommand(set);
                        break;
                }
                if (command != null) {
                    command.execute();
                }
            } while (opcion != 6);
        }
    }
}