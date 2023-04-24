package com;

/**
 * polymorphism are of two types
 * 1. overloading (same name different parameters)
 * 2. overriding
 * */

class Overloading {
    public void add(int a, int b) {
        System.out.println("int parameters is called");
        System.out.println("Add method with int parameters "+(a+b));
    }

    public void add(double a, double b) {
        System.out.println("double parameters is called");
        System.out.println("Add method with double parameters "+(a+b));
    }
}

class Overriding {
    class Vehicle1 {
        public void engine() {
            System.out.println("This is Vehicle Engine");
        }
    }

    class Car1 extends Vehicle1{
        public void engine() {      //defining same method as parent class Vehicle gets override
            System.out.println("This is Car Engine");
        }
    }

    class Bike1 extends Vehicle1 {
        public void engine() {
            System.out.println("This is Bike Engine");
        }
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("===========OVERLOADING=============");
        Overloading overloading = new Overloading();
        overloading.add(10, 20);
        System.out.println("===================================");
        overloading.add(10, 40.0);

        System.out.println("===========OVERRIDING=============");
        Overriding overriding = new Overriding();
        Overriding.Car1 car = overriding.new Car1();
        car.engine();
        System.out.println("=================================-");
        Overriding.Bike1 bike = overriding.new Bike1();
        bike.engine();
    }
}
