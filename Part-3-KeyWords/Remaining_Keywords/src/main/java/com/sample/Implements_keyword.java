package com.sample;

/**
 * This is same as extends keyword extends is used for class to class or interface to interface
 * whereas implements is used for interface to class
 */

interface Animal {
    public void animalSound();
    public void sleep();
}

class Dog implements Animal {

    @Override
    public void animalSound() {
        System.out.println("BARKS");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}

public class Implements_keyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.animalSound();
        d.sleep();
    }
}
