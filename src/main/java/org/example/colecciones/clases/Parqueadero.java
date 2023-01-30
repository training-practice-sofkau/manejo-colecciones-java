package org.example.colecciones.clases;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Parqueadero {
    ArrayList<PuestoParqueo> puestoParqueos;
    LinkedList<Persona> conductores;
    HashSet<Carro> carros;

    public Parqueadero(){
        this.puestoParqueos = new ArrayList<>();
        this.conductores = new LinkedList<>();
        this.carros = new HashSet<>();
        this.llenarParqueadero();
    }

    private void llenarParqueadero(){
        this.puestoParqueos.add(new PuestoParqueo("#3F"));
        this.puestoParqueos.add(new PuestoParqueo("#5Q"));
        this.puestoParqueos.add(new PuestoParqueo("#9L"));
        this.puestoParqueos.add(new PuestoParqueo("#8G"));
    }

    private boolean yaExistePuesto (String nombre){
        boolean yaExiste = false;
        for (PuestoParqueo puestoParqueo: this.puestoParqueos){
            if (puestoParqueo.getId().equalsIgnoreCase(nombre)){
                yaExiste = true;
            }
        }
        return yaExiste;
    }

    public void registrarPuesto(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Asigna un código: ");
        String codigoPuesto = entrada.nextLine();
        if(!this.yaExistePuesto(codigoPuesto)){
            this.puestoParqueos.add(new PuestoParqueo(codigoPuesto));
        } else {
            System.out.println("Ya existe un puesto con este código");
        }
    }

    private int getPuestosDisponibles(){
        int disponibles = 0;
        for (PuestoParqueo puestoParqueo : this.puestoParqueos){
            if (puestoParqueo.isDisponible()){
                disponibles ++;
            }
        }
        return disponibles;
    }

    public void consultarPuestoDisponible(){
        int puestosDisponibles = this.getPuestosDisponibles();
        if (puestosDisponibles > 0){
            System.out.println("Hay " + puestosDisponibles + " puestos disponibles");
        } else {
            System.out.println("En este momento no hay espacios disponibles");
        }
        System.out.println("\n\n");
    }

    public void ingresarVehiculo(){
        Scanner entrada = new Scanner(System.in);
        int puestosDisponibles = this.getPuestosDisponibles();

        if(puestosDisponibles > 0){
            System.out.println("Ingrese el nombre del conductor: ");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese el apellido del conductor: ");
            String apellido = entrada.nextLine();

            System.out.println("Ingrese la cédula del consuctor: ");
            String cedula = entrada.nextLine();

            Persona conductor = new Persona(nombre, apellido, cedula);

            System.out.println("Ingrese la placa del vehículo");
            String placa = entrada.nextLine();

            Carro vehiculo = new Carro(placa, conductor);
            this.carros.add(vehiculo);
            this.conductores.add(conductor);

            Iterator<PuestoParqueo> iterator = this.puestoParqueos.iterator();
            while (iterator.hasNext()){
                PuestoParqueo puesto = iterator.next();
                if (puesto.isDisponible()){
                    puesto.setVehiculo(vehiculo);
                    puesto.setDisponible(false);

                    System.out.println(conductor.getNombre());
                    System.out.println("Tu vehículo (" + vehiculo.getPlaca() + ") se estacionó en el puesto: " + puesto.getId());
                    break;
                }
            }

        } else {
            System.out.println("En este momento no hay espacios disponibles");
        }
        System.out.println("\n");
    }

    public void consultarVehiculos(){
        System.out.println("Vehículos ingresados hoy: ");
        for(Carro carro : this.carros){
            System.out.println(carro);
        }
        System.out.println("\n");
    }

    public void consultarConductores(){
        System.out.println("Visitas hoy: ");
        for(Persona conductor : this.conductores){
            System.out.println(conductor);
        }
        System.out.println("\n");
    }

    public void abrirParqueadero(){
        Scanner entrada = new Scanner(System.in);
        boolean abierto = true;

        while (abierto){
            System.out.println("Parqueadero abierto");
            System.out.println("1. Registrar puesto de parqueo");
            System.out.println("2. Consultar parqueaderos disponibles");
            System.out.println("3. Ingresar vehículo");
            System.out.println("4. Consultar vehículos");
            System.out.println("5. Consultar conductores");
            System.out.println("6. Salir");

            int opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    this.registrarPuesto();
                    break;
                case 2:
                    this.consultarPuestoDisponible();
                    break;
                case 3:
                    this.ingresarVehiculo();
                    break;
                case 4:
                    this.consultarVehiculos();
                    break;
                case 5:
                    this.consultarConductores();
                    break;
                case 6:
                    System.out.println("Parqueadero cerrado");
                    abierto = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
