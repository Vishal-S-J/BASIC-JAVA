package com.sample;

public class Main {
    public static void main(String[] args) {
        //this is object creation  syntax = className objectName = new className();
        Car_Class c1 = new Car_Class("Honda", "Civic", "Blue", "SEDAN", 2335000);
        Car_Class c2 = new Car_Class("Mercedes", "Benz E-class", "Red", "COUPE", 8900000);
        Car_Class c3 = new Car_Class("Chevrolet", "Corvette", "Red", "SPORS CAR", 5000000);
        Car_Class c4 = new Car_Class("Volvo", "V60", "Maroon", "STATION WAGON", 4500000);
        Car_Class c5 = new Car_Class("Volkswagen", "Golf GTI", "Red", "HATCHBACK", 2000000);
        Car_Class c6 = new Car_Class("Porsche", "718 Boxster", "Blue", "CONVERTIBLE", 13600000);
        Car_Class c7 = new Car_Class("Hyundai", "kona", "Green", "SUV", 2384000);
        Car_Class c8 = new Car_Class("Honda", "Ridgeline", "Black", "PICKUP TRUCK", 3132000);

        System.out.printf("----------------------------------------------------------------------------%n");
        System.out.printf("|                                CAR CLASS                                 |%n");
        System.out.printf("|--------------------------------------------------------------------------|%n");
        System.out.printf("| %-12s | %-15s | %-10s | %-15s | %8s |%n", "BRAND", "NAME", "COLOR", "TYPE", "PRICE");
        System.out.printf("|--------------------------------------------------------------------------|%n");
        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
        c7.display();
        c8.display();
        System.out.println("----------------------------------------------------------------------------");
    }
}
