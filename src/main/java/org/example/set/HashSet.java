package org.example.set;

import java.util.Set;

public class HashSet {
    private String nombre;
    private int edad;
    Marca marca = new Marca();
    Aplicacion aplicacion = new Aplicacion();
    Caballo caballo = new Caballo(nombre,edad);

    public void ejecutar(){
        System.out.println("______________________________________________________________________________EJERCICIOS HASHSET_________________________________________________________");
        marca.ejecutar();
        System.out.println("_______________________________________________________________");
        aplicacion.ejecutar();
        System.out.println("_______________________________________________________________");
        caballo.ejecutar();
        System.out.println("_______________________________________________________________");

    }

}

interface Operation{
    void crear();
    void agregarCopia();
    void imprimir();
    void imprimirCopia();
    void buscar();
}

/**
 * Ejercicio 1
 */
class Marca implements Operation {
    Set<String> marcas = new java.util.HashSet<>();

    public void ejecutar(){
        crear();;
        imprimir();;
        agregarCopia();;
        imprimirCopia();;
        buscar();
    }

    @Override
    public void crear() {
        marcas.add("Adidas");
        marcas.add("Nike");
        marcas.add("Reebook");
        marcas.add("Patprimo");
        marcas.add("Aquiles");
        marcas.add("Mario Hernandez");
        marcas.add("People");
        marcas.add("Leonisa");
        System.out.println("Registros cargados...");
    }

    @Override
    public void agregarCopia() {
        marcas.add("Aquiles");
        marcas.add("Mario Hernandez");
        marcas.add("Adidas");
        System.out.println("----> Copia de registros cargada");
    }

    @Override
    public void imprimir() {
        System.out.println("Marcas cargadas: "+marcas);

    }

    @Override
    public void imprimirCopia() {
        System.out.println("Marcas despues de cargar el duplicado: "+marcas);
    }

    @Override
    public void buscar() {
        boolean hasApple = marcas.contains("Nike");

        if (hasApple == true) {
            System.out.println("Se busco Nike: encontrado");
        } else {
            System.out.println("No se encontro ");
        }
    }
}

/**
 * Ejercicio 2
 */
class Aplicacion implements Operation {
    Set<String> app = new java.util.HashSet<>();
    private boolean hasApple;

    public void ejecutar(){
        crear();;
        imprimir();;
        agregarCopia();;
        imprimirCopia();;
        buscar();
        eliminar();
        buscar();
        imprimir();
    }

    @Override
    public void crear() {
        app.add("Facebook");
        app.add("Line");
        app.add("Whatsapp");
        app.add("Google");
        app.add("Zoom");
        app.add("Teams");
        app.add("Maps");
        app.add("Duolingo");
        System.out.println("Registros cargados...");
    }

    @Override
    public void agregarCopia() {
        app.add("Zoom");
        app.add("Teams");
        app.add("Maps");
        System.out.println("----> Copia de registros cargada");
        app.add("Meet");
    }

    @Override
    public void imprimir() {
        System.out.println("Marcas cargadas: "+app);

    }

    @Override
    public void imprimirCopia() {
        System.out.println("Marcas despues de cargar el duplicado: "+app);
    }

    @Override
    public void buscar() {
        hasApple = app.contains("Zoom");

        if (hasApple == true) {
            System.out.println("Se busco Zoom: encontrado");
        } else {
            System.out.println("Se busco Zoom: no se encontro ");
        }
    }

    public void eliminar(){
        System.out.println("Se elimino el registro: "+app.remove("Zoom"));
        hasApple = false;
    }
}

/**
 * Ejercicio 3
 */
class Caballo implements Operation {
    Set<Caballo> caballos = new java.util.HashSet<>();
    private String nombre;
    private int edad;

    public Caballo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private boolean hasApple;

    public void ejecutar() {
        crear();
        imprimir();
        agregarCopia();
        imprimirCopia();

    }

    @Override
    public void crear() {
       caballos.add(new Caballo("Milan",1));
       caballos.add(new Caballo("Faizan",3));
       caballos.add(new Caballo("Persa",2));
       caballos.add(new Caballo("Killer",6));
       caballos.add(new Caballo("Fast",8));
        System.out.println("Registros cargados...");
    }

    @Override
    public void agregarCopia() {
        caballos.add(new Caballo("Mper",3));
        caballos.add(new Caballo("Persa",2));
        caballos.add(new Caballo("Killer",6));
        System.out.println("----> Copia de registros cargada");

    }

    @Override
    public void imprimir() {
        System.out.println("Caballos cargadas: " + caballos.toString());

    }

    @Override
    public void imprimirCopia() {
        System.out.println("Caballos despues de cargar el duplicado: " + caballos.toString());
    }

    @Override
    public void buscar() {
        hasApple = caballos.contains(0);

        if (hasApple == true) {
            System.out.println("Se busco Milan: encontrado");
        } else {
            System.out.println("Se busco Milan: no se encontro ");
        }
    }

    public void eliminar() {
        System.out.println("Se elimino el registro: " + caballos.remove(0));
        hasApple = false;
    }
    public String toString(){
        return "Nombre: "+nombre+"  Edad: "+edad;
    }
}