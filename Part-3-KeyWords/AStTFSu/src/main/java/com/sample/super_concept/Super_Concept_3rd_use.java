package com.sample.super_concept;

/**
 * 3) super is used to invoke parent class constructor.
 *
 * The super keyword can also be used to invoke the parent class constructor.
 * */

class Animal2 {
    Animal2() {
        System.out.println("ANIMAL 2 IS CREATED");
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        super();
        System.out.println("DOG 2 IS CREATED");
    }
}

public class Super_Concept_3rd_use {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
    }
}
