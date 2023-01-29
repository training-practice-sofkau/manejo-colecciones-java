package org.example.map;

import java.util.HashMap;

public class HashMapEjemplo1 {
    public void main() {
        // Crear un HashMap para almacenar información sobre videojuegos
        HashMap<String, String> videojuegos = new HashMap<>();
        videojuegos.put("The Legend of Zelda: Breath of the Wild", "Action-adventure");
        videojuegos.put("Super Mario Odyssey", "Plataformas");
        videojuegos.put("Red Dead Redemption 2", "Acción-aventura");
        videojuegos.put("Minecraft", "Sandbox");

        // Imprimir la información sobre los videojuegos en el mapa
        System.out.println("Información sobre los videojuegos: " + videojuegos);

        // Obtener el género de un videojuego específico
        String genero = videojuegos.get("The Legend of Zelda: Breath of the Wild");
        System.out.println("Género de The Legend of Zelda: Breath of the Wild: " + genero);

        // Eliminar un videojuego del mapa
        videojuegos.remove("Minecraft");

        // Imprimir la información sobre los videojuegos en el mapa después de eliminar
        System.out.println("Información sobre los videojuegos después de eliminar: " + videojuegos);
    }

}
