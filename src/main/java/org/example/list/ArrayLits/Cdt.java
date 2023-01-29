package org.example.list.ArrayLits;

public class Cdt implements IbancoProducto{

     static int idCdt = 0;
     private int saldo = 0;
    public Cdt() {
        idCdt++;
    }

    @Override
    public void agregarDinero(int saldoInicial) {
        saldo += saldoInicial;
        System.out.println("Acabas de consignar en tu cdt: " + saldoInicial);
        System.out.println("Tu saldo es: " + saldo);

    }

    @Override
    public void retirarDinero(int saldoRetirar) {
        saldo -= saldoRetirar;
        System.out.println("Acabas de retirar en tu cdt: " + saldoRetirar);
        System.out.println("Tu salo es: " + saldo);
    }

    public static void main(String[] args) {
        Cdt cdt = new Cdt();
        cdt.agregarDinero(1000);
        cdt.retirarDinero(300);
    }

    @Override
    public String toString() {
        return "Cdt{" +
                "saldo=" + saldo +
                '}';
    }
}
