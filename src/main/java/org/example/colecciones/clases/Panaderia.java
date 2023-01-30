package org.example.colecciones.clases;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
public class Panaderia {
    private LinkedList<ClientePanaderia> clientes;
    private HashSet<Pan> panesDisponibles;

    public Panaderia (){
        this.clientes = new LinkedList<>();
        this.panesDisponibles = new HashSet<>();
        this.llenarPanaderia();
    }

    public void llenarPanaderia(){
        ClientePanaderia cliente = new ClientePanaderia("Gretty ", "Mosquera", "13698759");

        Pan pan = new Pan("Pan agridulce ", true, 2000);
        Pan pan1 = new Pan("Croissant ", true, 1500);

        this.clientes.add(cliente);
        this.panesDisponibles.add(pan);
        this.panesDisponibles.add(pan1);
    }

    public void hornearPan (){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del pan: ");
        String nombre = entrada.nextLine();

        System.out.print("¿Tiene queso? (s/n): ");
        char respuesta = entrada.nextLine().charAt(0);

        System.out.println("Precio: ");
        double precio = entrada.nextDouble();

        boolean tieneQueso = respuesta == 's';
        Pan pan = new Pan(nombre, tieneQueso, precio);

        this.panesDisponibles.add(pan);

        this.verPanes();
    }

    public void verPanes (){
        System.out.println("Listado de panes: ");
        System.out.println("-------------------");
        for (Pan pan : this.panesDisponibles){
            System.out.println("- " + pan);
        }
        System.out.println("------------------");
    }

    public void recibirCliente(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar cliente ");

        System.out.print("Nombre del cliente: ");
        String nombre = entrada.nextLine();

        System.out.println("Apellido del cliente: ");
        String apellido = entrada.nextLine();

        System.out.println("Cédula del cliente: ");
        String cedula = entrada.nextLine();

        ClientePanaderia cliente = new ClientePanaderia(nombre, apellido, cedula);
        this.clientes.add(cliente);
    }

    private Pan obtenerPan(String nombrePan){
        Pan panEncontrado = null;
        for (Pan pan : this.panesDisponibles){
            if (pan.getNombre().equalsIgnoreCase(nombrePan)){
                panEncontrado = pan;
            }
        }
        return panEncontrado;
    }

    public void atenderCliente(){
        ClientePanaderia cliente = this.clientes.getFirst();
        System.out.println("Señor(a) " + cliente.getNombre() + "¿Qué producto necesita?");
        this.verPanes();
        Scanner entrada = new Scanner(System.in);

        Pan panEncontrado = null;
        while (panEncontrado == null){
            System.out.println("Ingrese nombre del pan que desea: ");
            String nombrePan = entrada.nextLine();
            panEncontrado = this.obtenerPan(nombrePan);
            if(panEncontrado == null){
                System.out.println("No tenemos ese pan, intenta nuevamente");
            } else {
                cliente.recibirPan(panEncontrado);
                this.panesDisponibles.remove(panEncontrado);
            }
        }
    }

    public void despacharcliente(){
        ClientePanaderia cliente = this.clientes.getFirst();
        double total = cliente.calcularCuenta();
        System.out.println("Señor(a) " + cliente.getNombre() + "total a pagar: " + total);
        System.out.println("El cliente pagó");
        this.clientes.removeFirst();
        System.out.println("Clientes en fila: " + this.clientes.size());
        System.out.println("\n");
    }

    public void abrirPanaderia(){
        Scanner entrada = new Scanner(System.in);
        boolean panaderiaAbierta = true;

        while (panaderiaAbierta){
            System.out.println("La panadería abrió");

            System.out.println("1. Hornear pan");
            System.out.println("2. Ver panes");
            System.out.println("3. Recibir cliente");
            System.out.println("4. Atender cliente");
            System.out.println("5. Cancelar productos");
            System.out.println("6. Cerrar panadería");

            int opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    this.hornearPan();
                    break;
                case 2:
                    this.verPanes();
                    break;
                case 3:
                    this.recibirCliente();
                    break;
                case 4:
                    this.atenderCliente();
                    break;
                case 5:
                    this.despacharcliente();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("");
            }
        }
    }
}
