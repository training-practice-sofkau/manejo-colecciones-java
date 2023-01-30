package org.example.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayListPractice {
    /**
     * Crear ejemplos en donde se tenga que implementar estos tipos de dato,
     * minimo 3 escenarios por cada uno, si genera un escenario integrando el conocimiento
     * previo y que involucre varios tipos de dato, vale por uno de cada uno de los tipos
     * de dato involucrados.
     * */
    public void ejercutarArray1(){
        ArrayList<Integer> listan = new ArrayList<>();
        int n=1;
        int r;
        int opcion=0;
        int suma=0;
        Scanner entrada=new Scanner(System.in);

        while(n!=0){
            System.out.println("Ingrese numeros a la lista o 0 si no desea ingresar mas numeros");
            n=entrada.nextInt();
            if(n!=0){
                listan.add(n);
            }
        }

        do{
            System.out.println("1: Ver lista");
            System.out.println("2: Agregar un numero");
            System.out.println("3: Eliminar un numero");
            System.out.println("4: Reemplazar un numero");
            System.out.println("5: Sumar la lista");
            System.out.println("6: Salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    Iterator<Integer> i=listan.iterator();

                    while(i.hasNext()){
                        System.out.print(i.next()+",");
                    }
                    break;
                case 2:
                    n=entrada.nextInt();
                    listan.add(n);
                    break;
                case 3:
                    System.out.println("Ingrese el indice del numero que desea eliminar");
                    n=entrada.nextInt();
                    if(n<listan.size()){
                        listan.remove(n);
                    }else{
                        System.out.println("Indice fuera de la lista");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el numero que va a ingresar");
                    n=entrada.nextInt();
                    System.out.println("Ingrese el indice donde va el nuevo numero");
                    r=entrada.nextInt();
                    listan.set(r,n);
                    break;
                case 5:
                    for(int j:listan){
                        suma=suma+j;
                    }
                    System.out.println("La suma total es "+suma);
            }
        }while(opcion<=5);




    }

    public void ejecuarArray2(){
        Vehiculo m1=new Moto("honda");
        Vehiculo m2=new Moto("suzuki");
        Vehiculo m3=new Moto("yamaha");

        Vehiculo c1=new Carro("mazda");
        Vehiculo c2=new Carro("lambo");

        ArrayList<Moto> listaM = new ArrayList<>();
        listaM.add((Moto) m1);
        listaM.add((Moto) m2);
        listaM.add((Moto) m3);
        ArrayList<Carro> listaC = new ArrayList<>();
        listaC.add((Carro) c1);
        listaC.add((Carro) c2);

        ArrayList<Vehiculo> listaMyC = new ArrayList<>();

        listaMyC.addAll(listaC);
        listaMyC.addAll(listaM);

        System.out.println(listaMyC);

        Iterator <Vehiculo> i=listaMyC.iterator();

        while(i.hasNext()){
            Vehiculo vi=i.next();
            if(vi.getMarca()=="honda"){
                vi.setMarca("kawasaki");
            }

        }

        listaMyC.removeIf(vehiculo -> (vehiculo.getMarca()=="lambo"));
        System.out.println(listaMyC);
    }
}

abstract class Vehiculo {

    private String marca;
    private int numLLanta;

    abstract void setMarca(String marca);

    abstract void setNumLLanta();

    abstract String getMarca();

}

class Moto extends Vehiculo{

    private String marca;
    private int numLlanta;

    public Moto(String marca) {
        this.marca=marca;
        setNumLLanta();
    }

    @Override
    void setMarca(String marca) {
        this.marca=marca;
    }

    @Override
    void setNumLLanta() {
        this.numLlanta=2;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", numLlanta=" + numLlanta +
                '}';
    }
}

class Carro extends Vehiculo{

    private String marca;
    private int numLlanta;

    public Carro(String marca) {
        this.marca=marca;
        setNumLLanta();
    }

    @Override
    void setMarca(String marca) {
        this.marca=marca;
    }

    @Override
    void setNumLLanta() {
        this.numLlanta=4;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", numLlanta=" + numLlanta +
                '}';
    }
}


