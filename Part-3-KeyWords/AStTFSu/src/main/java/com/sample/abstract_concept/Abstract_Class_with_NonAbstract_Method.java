package com.sample.abstract_concept;

abstract class Vehicle1
{
    abstract void bike();

    void car()
    {
        System.out.println("Car is running");
    }
}
class Honda1 extends Vehicle1
{
    @Override
    void bike() {
        System.out.println("Bike is running");

    }
}

public class Abstract_Class_with_NonAbstract_Method {
    public static void main(String[] args) {
        Honda1 obj=new Honda1();
        obj.bike();
        obj.car();
    }
}
