package com.sample.super_concept;

/**
 * 2) super can be used to invoke parent class method
 *
 * The super keyword can also be used to invoke parent class method.
 * It should be used if subclass contains the same method as parent class.
 * In other words, it is used if method is overridden.
 *
 * In this example Animal and Dog both classes have "eat()" method if we call eat() method from Dog class,
 * it will call the "eat()" method of Dog class by default because priority is given to local.
 * To call the parent class method, we need to use super keyword.
 *
 * */

class Animal1 {
    void eat() {
        System.out.println("EATING");
    }
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("EATING DOG FOOD");
    }

    void bark() {
        System.out.println("BARKING");
    }

    void work() {
        super.eat();
        bark();
    }
}

public class Super_Concept_2nd_use {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.work();
    }
}

