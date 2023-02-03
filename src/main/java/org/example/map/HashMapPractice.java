package org.example.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapPractice {

    /**
     * un HashMap almacena elementos en pares de "clave/valor",
     * y puede acceder a ellos mediante un índice (por ejemplo, una cadena).
     *
     * El siguiente ejemplo es de un distribuidor de Utiles escolares con el patron de diseño Builder
     * El HashMap ayudará a asignar el pedido correspondiente a un almacen especifico por su Nit
     */

    public void ejecutar(){

        List<Utiles> pedidosAlmacen = new ArrayList<Utiles>();

        HashMap<Integer, Utiles > pedidos = new HashMap<Integer, Utiles>();

        /**
         * Se construyen los pedidos
         */
        Utiles laPlaya = new UtilesBuilder().borradores("Nata").lapices("Mirado 2").build();
        Utiles occidental = new UtilesBuilder().borradores("Nata").lapices("Mirado 2").colores("Faber-Castell").cuadernosArgollados("Norma").build();
        Utiles bodegaIlusion = new UtilesBuilder().marcadores("Pelikan").cuadernosCuadriculados("Primavera").cuadernosLineaCorriente("Norma").build();

        pedidosAlmacen.add(laPlaya);
        pedidosAlmacen.add(occidental);
        pedidosAlmacen.add(bodegaIlusion);

        for(int nit=0; nit< pedidosAlmacen.size(); nit++){

            pedidos.put(nit, pedidosAlmacen.get(nit));
        }

        /**
         * Permite ver la clave y  la información contenida en el Builder
         */

        for(Map.Entry<Integer, Utiles> entry : pedidos.entrySet()) {
            System.out.println(entry.getKey() + ": " +  entry.getValue().toString());
        }

    }
}

class Utiles {
    private String lapices;
    private String borradores;
    private String sacaPuntas;
    private String lapiceros;
    private String cuadernosCuadriculados;
    private String cuadernosLineaCorriente;
    private String cuadernosArgollados;
    private String colores;
    private String marcadores;

    public String getLapices() {
        return lapices;
    }

    public void setLapices(String lapices) {
        this.lapices = lapices;
    }

    public String getBorradores() {
        return borradores;
    }

    public void setBorradores(String borradores) {
        this.borradores = borradores;
    }

    public String getSacaPuntas() {
        return sacaPuntas;
    }

    public void setSacaPuntas(String sacaPuntas) {
        this.sacaPuntas = sacaPuntas;
    }

    public String getLapiceros() {
        return lapiceros;
    }

    public void setLapiceros(String lapiceros) {
        this.lapiceros = lapiceros;
    }

    public String getCuadernosCuadriculados() {
        return cuadernosCuadriculados;
    }

    public void setCuadernosCuadriculados(String cuadernosCuadriculados) {
        this.cuadernosCuadriculados = cuadernosCuadriculados;
    }

    public String getCuadernosLineaCorriente() {
        return cuadernosLineaCorriente;
    }

    public void setCuadernosLineaCorriente(String cuadernosLineaCorriente) {
        this.cuadernosLineaCorriente = cuadernosLineaCorriente;
    }

    public String getCuadernosArgollados() {
        return cuadernosArgollados;
    }

    public void setCuadernosArgollados(String cuadernosArgollados) {
        this.cuadernosArgollados = cuadernosArgollados;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getMarcadores() {
        return marcadores;
    }

    public void setMarcadores(String marcadores) {
        this.marcadores = marcadores;
    }

    @Override
    public String toString() {
        return "Utiles{" +
                "lapices='" + lapices + '\'' +
                ", borradores='" + borradores + '\'' +
                ", sacaPuntas='" + sacaPuntas + '\'' +
                ", lapiceros='" + lapiceros + '\'' +
                ", cuadernosCuadriculados='" + cuadernosCuadriculados + '\'' +
                ", cuadernosLineaCorriente='" + cuadernosLineaCorriente + '\'' +
                ", cuadernosArgollados='" + cuadernosArgollados + '\'' +
                ", colores='" + colores + '\'' +
                ", marcadores='" + marcadores + '\'' +
                '}';
    }
}

class UtilesBuilder {
    private Utiles utiles;


    public UtilesBuilder() {
        utiles= new Utiles();
    }


    public UtilesBuilder lapices(String lapices) {
        utiles.setLapices(lapices);
        return this;
    }

    public UtilesBuilder borradores(String borradores) {
        utiles.setBorradores(borradores);
        return this;
    }

    public UtilesBuilder sacaPuntas(String sacaPuntas) {
        utiles.setSacaPuntas(sacaPuntas);
        return this;
    }

    public UtilesBuilder lapiceros(String lapiceros) {
        utiles.setLapiceros(lapiceros);
        return this;
    }

    public UtilesBuilder cuadernosCuadriculados(String cuadernosCuadriculados) {
        utiles.setCuadernosCuadriculados(cuadernosCuadriculados);
        return this;
    }

    public UtilesBuilder cuadernosLineaCorriente(String cuadernosLineaCorriente) {
        utiles.setCuadernosLineaCorriente(cuadernosLineaCorriente);
        return this;
    }

    public UtilesBuilder cuadernosArgollados(String cuadernosArgollados) {
        utiles.setCuadernosArgollados(cuadernosArgollados);
        return this;
    }

    public UtilesBuilder colores(String colores) {
        utiles.setColores(colores);
        return this;
    }

    public UtilesBuilder marcadores(String marcadores) {
        utiles.setMarcadores(marcadores);
        return this;
    }


    public Utiles build(){
        return this.utiles;
    }

    public Utiles getUtiles() {
        return utiles;
    }

}
