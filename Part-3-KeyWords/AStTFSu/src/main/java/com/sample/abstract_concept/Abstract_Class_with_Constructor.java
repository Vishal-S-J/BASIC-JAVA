package com.sample.abstract_concept;

abstract class Vehicle3{
    String msg;
    Vehicle3(String msg) {
        this.msg = msg;
    }

    void display() {
        System.out.println(msg);
    }
}

class Honda3 extends Vehicle3 {

    Honda3(String msg) {
        super(msg);
    }
}

public class Abstract_Class_with_Constructor {
    public static void main(String[] args) {
        Honda3 obj = new Honda3("Constructor invoked");
        obj.display();
    }
}
