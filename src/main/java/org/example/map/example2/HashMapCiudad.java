package org.example.map.example2;

public class HashMapCiudad {
    IManageCiudad iManageCiudad = new ManageCiudadImp();

    public void MapCiudad(){
        // para agregar elementos al HashMap se utiliza el método addKeyValue
        iManageCiudad.addKeyValue("123", Ciudad.MEDELLIN);
        iManageCiudad.addKeyValue("555", Ciudad.ARMENIA);
        iManageCiudad.addKeyValue("654", Ciudad.BUCARAMANGA);
        iManageCiudad.addKeyValue("333", Ciudad.MANIZALES);

        // para imprimir el HashMap se utiliza el método printHashMap
        iManageCiudad.printHashMap();

        // para eliminar una entrada del HashMap se utiliza el método deleteKeyValue
        iManageCiudad.deleteKeyValue("654");
        iManageCiudad.printHashMap();

    }

}
