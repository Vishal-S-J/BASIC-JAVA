package com.sample.abstract_concept;

class Vehicle5 {
    abstract class Car {
        abstract void display();
    }
    class Honda5 extends Car {
        @Override
        void display() {
            System.out.println("inner abstract class");
        }
    }
}

public class Abstract_Inner_Class {
    public static void main(String[] args) {
        Vehicle5 obj=new Vehicle5();
        Vehicle5.Car c=obj.new Honda5();
        c.display();
    }
}
