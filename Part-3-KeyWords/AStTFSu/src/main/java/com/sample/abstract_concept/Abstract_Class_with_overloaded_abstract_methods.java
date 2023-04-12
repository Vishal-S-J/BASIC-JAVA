package com.sample.abstract_concept;

abstract class Vehicle4 {
    abstract void display();
    abstract void display(String msg);
}

class Honda4 extends Vehicle4 {

    @Override
    void display() {
        System.out.println("display method no params");
    }

    @Override
    void display(String msg) {
        System.out.println(msg);
    }
}

public class Abstract_Class_with_overloaded_abstract_methods {
    public static void main(String[] args) {
        Honda4 obj1 = new Honda4();
        obj1.display();
        obj1.display("display method with params");
    }
}
