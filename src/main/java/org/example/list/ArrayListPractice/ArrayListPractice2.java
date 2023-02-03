package org.example.list.ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice2 {

    /**
     * El siguiente ejemplo con el patron de diseño Builder se construye casa segun especificaciones
     * Se utiliza el Arraylist para guardar cada casa
     */

    public void ejecutar2(){

        List<Casa> casaBuild = new ArrayList<Casa>();

        Casa casaConParqueadero = new CasaBuilder()
                .bodega("si")
                .balcon("si")
                .pisos("2")
                .jardin("no")
                .parqueadero("si")
                .piscina("no").build();

        Casa casaConPiscina = new CasaBuilder()
                .bodega("si")
                .balcon("si")
                .pisos("3")
                .jardin("si")
                .parqueadero("no")
                .piscina("si").build();

        Casa casaCompleta = new CasaBuilder()
                .bodega("si")
                .balcon("si")
                .pisos("1")
                .jardin("si")
                .parqueadero("si")
                .piscina("si").build();

        casaBuild.add(casaConParqueadero);
        casaBuild.add(casaConPiscina);
        casaBuild.add(casaCompleta);

        int i = 1;

        for (Casa casaConstruida:casaBuild) {

            System.out.println("---------------Casa # " + i + "----------------");
            System.out.println("Casa Construida: " + casaConstruida.toString());
            i++;

        }

    }

}

class Casa {
    private String piscina;
    private String jardin;
    private String bodega;
    private String parqueadero;
    private String balcon;
    private String pisos;

    public String getPiscina() {
        return piscina;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    public String getJardin() {
        return jardin;
    }

    public void setJardin(String jardin) {
        this.jardin = jardin;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public String getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(String parqueadero) {
        this.parqueadero = parqueadero;
    }

    public String getBalcon() {
        return balcon;
    }

    public void setBalcon(String balcon) {
        this.balcon = balcon;
    }

    public String getPisos() {
        return pisos;
    }

    public void setPisos(String pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "piscina='" + piscina + '\'' +
                ", jardin='" + jardin + '\'' +
                ", bodega='" + bodega + '\'' +
                ", parqueadero='" + parqueadero + '\'' +
                ", balcon='" + balcon + '\'' +
                ", pisos='" + pisos + '\'' +
                '}';
    }
}

class CasaBuilder {
    private Casa casa;


    public CasaBuilder() {
        casa = new Casa();
    }


    public CasaBuilder piscina(String pisicna) {
        casa.setPiscina(pisicna);
        return this;
    }

    public CasaBuilder jardin(String jardin) {
        casa.setJardin(jardin);
        return this;
    }

    public CasaBuilder bodega(String bodega) {
        casa.setBodega(bodega);
        return this;
    }

    public CasaBuilder parqueadero(String parqueadero) {
        casa.setParqueadero(parqueadero);
        return this;
    }

    public CasaBuilder balcon(String balcon) {
        casa.setBalcon(balcon);
        return this;
    }

    public CasaBuilder pisos(String pisos) {
        casa.setPisos(pisos);
        return this;
    }


    public Casa build(){
        return this.casa;
    }

    public Casa getCasa() {
        return casa;
    }


}