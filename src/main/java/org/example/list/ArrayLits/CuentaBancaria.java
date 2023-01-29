package org.example.list.ArrayLits;

public class CuentaBancaria implements IbancoProducto{
    static int idCuenta = 0;

    private int saldo = 0;
    public CuentaBancaria(Cliente cliente) {
        idCuenta++;
    }

    @Override
    public void agregarDinero(int saldoInicial) {
        saldo += saldoInicial;
        System.out.println("Acabas de consignar en tu cuenta: " + saldoInicial);
        System.out.println("Tu saldo es: " + saldo);
    }

    @Override
    public void retirarDinero(int saldoRetirar) {
        saldo -= saldoRetirar;
        System.out.println("Acabas de retirar en tu cuenta: " + saldoRetirar);
        System.out.println("Tu saldo es: " + saldo);

    }
    public int getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
