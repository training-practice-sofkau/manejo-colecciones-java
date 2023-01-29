package org.example.map;

import java.util.HashMap;

public class HashMapEjemplo3 {
    public void main() {
        // Crear un HashMap para almacenar información sobre productos y sus precios
        HashMap<String, Integer> productos = new HashMap<>();
        productos.put("Laptop", 500);
        productos.put("Television", 800);
        productos.put("Smartphone", 750);
        productos.put("Tablet", 350);

        // Imprimir la información sobre los productos en el mapa
        System.out.println("Información sobre los productos: " + productos);

        // Obtener el precio de un producto específico
        Integer precio = productos.get("Laptop");
        System.out.println("Precio de Laptop: " + precio);

        // Modificar el precio de un producto
        productos.put("Laptop", 480);

        // Imprimir la información sobre los productos en el mapa después de modificar
        System.out.println("Información sobre los productos después de modificar: " + productos);
    }

}
