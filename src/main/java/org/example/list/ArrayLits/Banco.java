package org.example.list.ArrayLits;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Cliente> clientes;
    List<Empleado> empleados;

    public Banco() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public void agregarClientes(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void elminarCliente(Cliente cliente) {
        if (clientes.contains(cliente)){
            clientes.remove(cliente);
        }
    }

    public void elminarEmpleado(Empleado empleado) {
        if (empleados.contains(empleado)){
            empleados.remove(empleado);
        }
    }

    public void mostrarPersonal(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Banco{" +
                "clientes=" + clientes +
                ", empleados=" + empleados +
                '}';
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("EFRain");
        Cliente cliente1 = new Cliente("Andres");
        CuentaBancaria cuentaBancaria = new CuentaBancaria(cliente);
        Cdt cdt = new Cdt();
        cliente.agregarCuentaBancaria(cuentaBancaria);
        cliente.agregarCdt(cdt);
        cuentaBancaria.agregarDinero(40000);
        cuentaBancaria.retirarDinero(20000);
        cdt.agregarDinero(20000);
        cdt.retirarDinero(20000);
        cliente.mostrarPersona();

        banco.agregarClientes(cliente);
        banco.agregarClientes(cliente1);
        banco.mostrarPersonal();
        banco.elminarCliente(cliente);
        banco.mostrarPersonal();


    }
}
