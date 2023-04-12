package com.sample.abstract_concept;

abstract class Vehicle
{
    abstract void bike();
}
class Honda extends Vehicle
{
    @Override
    void bike() {
        System.out.println("Bike is running");
    }
}

public class Abstract_Class_with_Abstract_Method {
    public static void main(String[] args) {
        Honda obj=new Honda();
        obj.bike();
    }
}
