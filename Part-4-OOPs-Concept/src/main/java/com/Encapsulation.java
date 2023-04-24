package com;

/**
 * We know that private variables can only be accessed within the same class (an outside class has no access to it).
 * However, it is possible to access them if we provide public get and set methods.
 * The get method returns the variable value, and the set method sets the value.
 * */

class Person {
    private String name; //private = restricted access

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
//        If the variable(name) was declared as public

        Person person = new Person();
//        person.name = "JOHN";      //error
//        System.out.println(person.name);  //error

        person.setName("LEO");
        System.out.println(person.getName());
    }
}
