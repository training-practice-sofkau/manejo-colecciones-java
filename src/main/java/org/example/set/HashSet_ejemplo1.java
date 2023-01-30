package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ejemplo1 {

    public static void main(){

    //instancio
    Clientes cliente1 =new Clientes("Camilo Pardo","3127358962",35000);
    Clientes cliente2 =new Clientes("Luisito Comunica","3137554120",1000000);
    Clientes cliente3 =new Clientes("Sara Cordoba","3114562300",2750);
    Clientes cliente4 =new Clientes("Laura Bermudez","3225449985",78500);

    //creo la coleccion donde voy a almacenar los objetos
    Set<Clientes>ClientesOperadoresTelefonicos=new HashSet<Clientes>();

    //agrego los objetos a la coleccion
        ClientesOperadoresTelefonicos.add(cliente1);
        ClientesOperadoresTelefonicos.add(cliente2);
        ClientesOperadoresTelefonicos.add(cliente3);
        ClientesOperadoresTelefonicos.add(cliente4);

    //recorro la coleccion para que me imprima la informacion en pantalla
        for (Clientes personas: ClientesOperadoresTelefonicos){

        System.out.println(personas.getNombre()+" " + personas.getNumero_telefono()+ " "+ personas.getSaldo());
    }

}}

//creo una clase que me construya mis objetos:clientes
 class Clientes {
         public String nombre;
         public String numero_telefono;
         public int saldo;

         public Clientes(String nombre, String numero_telefono, int saldo) {
             this.nombre = nombre;
             this.numero_telefono=numero_telefono;
             this.saldo=saldo;
         }

         public int getSaldo() {
             return saldo;
         }

         public void setSaldo(int saldo) {
             this.saldo = saldo;
         }

         public String getNumero_telefono() {
             return numero_telefono;
         }

         public void setNumero_telefono(String num_telefono) {
             this.numero_telefono = num_telefono;
         }

         public String getNombre() {
             return nombre;
         }

         public void setNombre(String nombre) {
             this.nombre = nombre;
         }
     }





