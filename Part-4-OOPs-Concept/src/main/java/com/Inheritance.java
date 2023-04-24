package com;

/**
 * subclass (child) - the class that inherits from another class
 * superclass (parent) - the class being inherited from
 * To inherit from a class, use the extends keyword.
 * */

class Vehicle {
    protected String brand = "FORD";

    public void run() {
        System.out.println("Vroom Vroom");
    }
}

class Car extends Vehicle {
    private String modleName = "MUSTANG";
    public static void meth() {
        Car car = new Car();
        car.run();          //calling method of parent class from child class
        System.out.println(car.brand+" "+car.modleName);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car.meth();
    }
}
