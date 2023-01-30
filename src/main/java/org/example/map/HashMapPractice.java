package org.example.map;

import java.util.*;

public class HashMapPractice {

    public void ejecutarHashMap1(){
        int opcion;
        int numero;
        String nombre;
        Scanner entrada=new Scanner(System.in);
        HashMap<String, Integer> agenda=new HashMap<>();
        agenda.put("Fabio",123);
        agenda.put("Vanessa",456);
        agenda.put("Camilo",789);
        agenda.put("Pedro",147);

        System.out.println(agenda);

        do{
            System.out.println("1: Aniadir contacto");
            System.out.println("2: Listar contactos");
            System.out.println("3: Buscar contactos");
            System.out.println("4: Eliminar contacto");
            System.out.println("5: Salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre");
                    nombre=entrada.next();
                    System.out.println("Ingrese el numero");
                    numero=entrada.nextInt();

                    if(!agenda.containsKey(nombre)) {
                        agenda.put(nombre, numero);
                    }else{
                        System.out.println("El contacto ya existe");
                    }
                    break;
                case 2:
                    for(Map.Entry<String, Integer> entry: agenda.entrySet()){
                        System.out.println("Nombre: "+entry.getKey()+" | Telefono: "+entry.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre");
                    nombre=entrada.next();
                    if(agenda.containsKey(nombre)) {
                        System.out.println("El telefono del contacto es:"+ agenda.get(nombre));
                    }else{
                        System.out.println("El contacto no existe");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre");
                    nombre=entrada.next();
                    if(agenda.containsKey(nombre)) {
                        agenda.remove(nombre);
                        System.out.println("Contacto eliminado");
                    }
                    break;
                case 5:

                    break;
            }
        }while(opcion<=4);
    }

    public void ejecutarHashMap2(){
        int opcion;
        int opcionH;
        Scanner entrada=new Scanner(System.in);
        String nombre;
        String ingrediente1;
        String ingrediente2;
        int id;

        HashMap<Integer, Persona> listaClientes=new HashMap<>();
        Persona p1=new Persona("Manolo",123);
        Persona p2=new Persona("Juan",456);
        Persona p3=new Persona("Pedro",789);
        //Hamburguesa haux=new HamburguesasBuilder().carne("Res").build();
        //p1.aniadirHam(haux);
        //p2.aniadirHam(new HamburguesasBuilder().pollo("Desmechado").build());
        //p3.aniadirHam(new HamburguesasBuilder().carne("Res").pollo("Desmechado").build());

        listaClientes.put(p1.getId(), p1);
        listaClientes.put(p2.getId(), p2);
        listaClientes.put(p3.getId(), p3);

        do{
            System.out.println("1: Aniadir persona");
            System.out.println("2: Listar Personas");
            System.out.println("3: Agregar hamburguesa");
            System.out.println("4: Eliminar persona");
            System.out.println("5: Salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre");
                    nombre=entrada.next();
                    System.out.println("Ingrese el id");
                    id=entrada.nextInt();
                    Persona paux=new Persona(nombre,id);
                    if(!listaClientes.containsKey(id)) {
                        listaClientes.put(paux.getId(), paux);
                    }else{
                        System.out.println("El contacto ya existe");
                    }
                    break;
                case 2:
                    for(Map.Entry<Integer, Persona> entry: listaClientes.entrySet()){
                        System.out.println("Nombre: "+entry.getValue().getNombre()+" | Id: "+entry.getKey());
                        if(!entry.getValue().verificarListaH()) {
                            entry.getValue().verHamburguesas();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el id");
                    id=entrada.nextInt();
                    if(listaClientes.containsKey(id)) {
                        System.out.println("1: Hamburguesa con carne");
                        System.out.println("2: Hamburguesa con pollo");
                        System.out.println("3: Hamburguesa con carne y pollo");
                        opcionH=entrada.nextInt();
                        for(Map.Entry<Integer, Persona> entry: listaClientes.entrySet()){
                            if(entry.getValue().getId()==id){
                                if(opcionH==1) {
                                    entry.getValue().aniadirHam(new HamburguesasBuilder().carne("Res").build());
                                } else if (opcionH==2) {
                                    entry.getValue().aniadirHam(new HamburguesasBuilder().pollo("Desmechado").build());
                                }else{
                                    entry.getValue().aniadirHam(new HamburguesasBuilder().carne("Res").pollo("Desmechado").build());
                                }

                            }
                        }
                    }else{
                        System.out.println("El contacto no existe");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el id");
                    id=entrada.nextInt();
                    if(listaClientes.containsKey(id)) {
                        listaClientes.remove(id);
                        System.out.println("Contacto eliminado");
                    }
                    break;
            }
        }while(opcion<=4);



    }
}

class Persona{
    private LinkedList<Hamburguesa> listaH;

    private String nombre;
    private int id;

    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        listaH=new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void aniadirHam(Hamburguesa hamburguesa){
        listaH.add(hamburguesa);
    }

    public void verHamburguesas(){
        if(!listaH.isEmpty()){
            for(Hamburguesa har:listaH){
                System.out.println(har.toString());
            }
        }
    }

    public boolean verificarListaH(){

        return listaH.isEmpty();

    }
}

class Hamburguesa{
    private String carne;
    private String pollo;

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setPollo(String pollo) {
        this.pollo = pollo;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" +
                "carne='" + carne + '\'' +
                ", pollo='" + pollo + '\'' +
                '}';
    }
}

class HamburguesasBuilder{
    private Hamburguesa hamburguesa;

    public HamburguesasBuilder(){
    hamburguesa=new Hamburguesa();
    }

    public HamburguesasBuilder carne(String carne){
        hamburguesa.setCarne(carne);
        return this;
    }

    public HamburguesasBuilder pollo(String pollo){
        hamburguesa.setPollo(pollo);
        return this;
    }
    public Hamburguesa build(){
        return this.hamburguesa;
    }
}
