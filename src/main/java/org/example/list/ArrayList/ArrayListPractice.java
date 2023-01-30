package org.example.list.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {


    public void ejecutarArrayList(){

        List <Cancion> canciones = new ArrayList<>();

        canciones.add(new Cancion("Hey Jude", "Paul"));
        canciones.add(new Cancion("Hurt", "Christina"));
        canciones.add(new Cancion("Te mando flores", "Fonseca"));
        canciones.add(new Cancion("Byob", "System of the down"));

        for(int i = 0; i< canciones.size(); i++)
            System.out.println("La lista de canciones es " + canciones.get(i).getName()
            + " y el autor es " + canciones.get(i).getCantante());
    }

    public void ejecutarArrayList2(){

        List <Menu> menus = new ArrayList<>();

        menus.add(new Menu("Arroz", "Leche"));
        menus.add(new Menu("Arroz", "Pollo"));

        for(int i = 0; i< menus.size(); i++)
            System.out.println("Para hacer un " + menus.get(i).getIngrediente1() +
                    " con " + menus.get(i).getIngrediente2() + " se nececita " + menus.get(i).getIngrediente1() + " y también " +
                    menus.get(i).getIngrediente2()
            );
    }

    public void ejecutarArrayList3(){

        List <TiendaMascotas> tienda = new ArrayList<>();
        tienda.add(new TiendaMascotas("Tati", "Perro"));
        tienda.add(new TiendaMascotas("Freya", "Perro"));
        tienda.add(new TiendaMascotas("Sr.Gato", "Gato"));

        for (int i =0; i< tienda.size(); i++){
            System.out.println("Se venden en la tienda Sofka los siguientes animales "
            + tienda.get(i).getNombre() + " y es un " + tienda.get(i).getTipo()
            );
        }

    }



}




class Cancion{
    private String name;
    public String cantante;


    public Cancion(String name, String cantante) {
        this.name = name;
        this.cantante = cantante;
    }

    public String getName() {
        return name;
    }

    public String getCantante() {
        return cantante;
    }
}

class Menu{
    private String ingrediente1;
    private String ingrediente2;

    public Menu(String ingrediente1, String ingrediente2) {
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }
}

class TiendaMascotas{
    private String nombre;
    public String tipo;

    public TiendaMascotas(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}



















