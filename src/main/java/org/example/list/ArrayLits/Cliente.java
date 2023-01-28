package org.example.list.ArrayLits;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    List<IbancoProducto> productos;
     private static int idCliente = 0;

    public Cliente(String nombre) {
        super(nombre);
        productos = new ArrayList<>();
        idCliente++;
    }

    @Override
    public void mostrarPersona() {
        System.out.println(toString());
    }

    public void agregarCuentaBancaria(CuentaBancaria cuentaBancaria) {
        productos.add(cuentaBancaria);
    }

    public void agregarCdt(Cdt cdt) {
        productos.add(cdt);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "productos=" + productos +
                "} " + super.toString();
    }

    public static void main(String[] args) {

    }
}
