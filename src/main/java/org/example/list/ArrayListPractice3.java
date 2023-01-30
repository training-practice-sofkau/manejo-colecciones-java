package org.example.list;

import java.util.ArrayList;

public class ArrayListPractice3 {
    public void ejecutar(){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2018));

        Car firstCar = cars.get(0);
        System.out.println("El primer auto es un " + firstCar.getYear() + " " + firstCar.getMake() + " " + firstCar.getModel());
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
