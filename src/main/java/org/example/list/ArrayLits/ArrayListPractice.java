package org.example.list.ArrayLits;

public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
    public void ejecutar(){
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
