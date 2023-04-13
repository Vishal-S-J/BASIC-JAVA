package com.sample.super_concept;

/**
 * 1) super is used to refer immediate parent class instance variable.
 *
 * We can use super keyword to access the data member or field of parent class.
 * It is used if parent class and child class have same fields.
 * */

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    public void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class Super_Concept_1st_use {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}
