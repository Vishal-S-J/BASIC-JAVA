package com.sample;

public class Car_Class implements Vehicle_Interface {
    String brand = null;
    String name = null;
    String color = null;
    String type = null;
    int price = 0;

    Car_Class() {
        //this is default constructor with no parameters
    }

    Car_Class(String brand, String name, String color, String type, int price) {
        //this is parameterized constructor
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    @Override
    public void speed() {
        System.out.println("This is speed method");
    }

    @Override
    public void brakes() {
        System.out.println("This is brake method to apply brakes");
    }

    @Override
    public void gear_state() {
        System.out.println("This is gear current state");
    }

    public void display() {
        System.out.printf("| %-12s | %-15s | %-10s | %-15s | %08d |%n", brand, name, color, type, price);
    }
}
