package com.sample.abstract_concept;

abstract class Vehicle6 {
    abstract class Car {
        abstract void display();
    }
}

class Honda6 extends Vehicle6 {
    class FourWheller extends Car {

        @Override
        void display() {
            System.out.println("Nested Abstract class is invoked");
        }
    }
}

public class Abstract_Nested_Class {
    public static void main(String[] args) {
        Vehicle6 obj1 = new Honda6();
        Honda6 h = (Honda6)obj1;
        Honda6.FourWheller fw = h.new FourWheller();
        fw.display();
    }
}
