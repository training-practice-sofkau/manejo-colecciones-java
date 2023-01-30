package org.example.map;

// Import the HashMap class


import java.util.HashMap;

public class Organizacion {

    public void delegar(){


        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

    }

}
