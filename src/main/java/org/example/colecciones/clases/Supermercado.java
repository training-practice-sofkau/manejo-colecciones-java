package org.example.colecciones.clases;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Supermercado {
    private HashSet<Cliente> clientes;
    private LinkedList<Cliente> cajaRegistradora;

    public Supermercado(){
        this.clientes = new HashSet<>();
        this.cajaRegistradora = new LinkedList<>();
        this.llenarMercado();
    }

    public void llenarMercado (){
        Cliente cliente = new Cliente("Gretty", "Mosquera", "1152697987");
        Cliente cliente1 = new Cliente("Alejandro", "Quiroz", "1153695987");
        Cliente cliente2 = new Cliente("Jairo", "Mosquera", "1154879698");

        cliente.agregarACarrito(new Producto("Leche", 5000, 1));
        cliente.agregarACarrito(new Producto("Quesito", 3000, 2));

        cliente1.agregarACarrito(new Producto("Avena", 6000, 1));
        cliente1.agregarACarrito(new Producto("Jamón", 15000, 2));

        cliente2.agregarACarrito(new Producto("Acondicionador", 5000, 1));
        cliente2.agregarACarrito(new Producto("Jabón", 3000, 3));

        this.clientes.add(cliente);
        this.clientes.add(cliente1);
        this.clientes.add(cliente2);
    }

    public void ingresarCliente(){
        Scanner entrada = new Scanner(System.in);
        System.out.println(">> Registrar cliente: ");

        System.out.print("Ingresar nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingresar apellido: ");
        String apellido = entrada.nextLine();

        System.out.println("Ingresar cédula: ");
        String cedula = entrada.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, cedula);
        this.clientes.add(cliente);
    }

    public void consultarCliente(){
        System.out.println("Clientes en el supermercado: ");
        for (Cliente cliente: this.clientes) {
            System.out.println(cliente.toString());
        }
        System.out.println("\n\n");
    }

    public void agregarProducto(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cédula del cliente");
        String cedula = entrada.nextLine();
        boolean encontrado = false;
        for (Cliente cliente: this.clientes) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)){
                System.out.println("Ingresa el nombre del producto: ");
                String nombre = entrada.nextLine();

                System.out.println("Ingrese el valor: ");
                double valor = entrada.nextDouble();

                System.out.println("Ingrese la cantidad: ");
                int cantidad = entrada.nextInt();

                Producto producto = new Producto(nombre, valor, cantidad);
                cliente.agregarACarrito(producto);
                encontrado = true;
                System.out.println("Producto añadido");
            }
        }
        if (!encontrado){
            System.out.println("El cliente no existe");
        }
    }

    public void llevarClienteACaja(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cédula del cliente");
        String cedula = entrada.nextLine();

        boolean encontrado = false;
        boolean yaExiste = false;

        for (Cliente cliente: this.cajaRegistradora){
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                yaExiste = true;
            }
        }

        for(Cliente cliente: this.clientes){
            if (cliente.getCedula().equalsIgnoreCase(cedula) && !yaExiste){
                this.cajaRegistradora.add(cliente);
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("El cliente no existe");
        }
    }

    public void consultarClientesCaja(){
        System.out.println("Cliente en caja: ");
        for (Cliente cliente: this.cajaRegistradora){
            System.out.println(cliente);
        }
        System.out.println("\n\n");
    }

    public void cancelarProductos(){
        if(this.cajaRegistradora.size() > 0){
            Cliente primerCliente = this.cajaRegistradora.getFirst();
            double total = primerCliente.calcularValorPagar();
            System.out.println("Total a pagar: " + total);
            System.out.println("Hasta pronto: " + primerCliente.getNombre());

            this.clientes.remove(primerCliente);
            this.cajaRegistradora.removeFirst();
            System.out.println("\n\n");
            this.consultarClientesCaja();
        } else {
            System.out.println("No hay clientes en la fila de la caja registradora");
        }
    }

    public void abrirSuperMercado(){
        System.out.println("El supermercado está abierto al público");
        System.out.println("----------------------------------------");

        boolean superMercadoAbierto = true;
        Scanner entrada = new Scanner(System.in);
        while (superMercadoAbierto){
            System.out.println("1. Ingresar cliente");
            System.out.println("2. Consultar clientes");
            System.out.println("3. Añadir productos a cliente");
            System.out.println("4. Llevar cliente a caja registradora");
            System.out.println("5. Consultar clientes en caja registradora");
            System.out.println("6. Cancelar productos");
            System.out.println("7. Cerrar supermercado");
            int opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    this.ingresarCliente();
                    break;
                case 2:
                    this.consultarCliente();
                    break;
                case 3:
                    this.agregarProducto();
                    break;
                case 4:
                    this.llevarClienteACaja();
                    break;
                case 5:
                    this.consultarClientesCaja();
                    break;
                case 6:
                    this.cancelarProductos();
                    break;
                case 7:
                    System.out.println("Cerrando supermercado...");
                    superMercadoAbierto = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
