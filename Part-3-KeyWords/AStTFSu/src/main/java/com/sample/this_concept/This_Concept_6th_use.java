package com.sample.this_concept;

/**
 * 6) this keyword can be used to return current class instance
 *
 * We can return this keyword as a statement from the method.
 * In such case, return type of the method must be the class type (non-primitive).
 *
 * Syntax :
 * return_type method_name(){
 *      return this;
 * }
 * */

class Q {
    Q getQ() {
        return this;
    }

    void msg() {
        System.out.println("HELLO Q");
    }
}

public class This_Concept_6th_use {
    public static void main(String[] args) {
        new Q().getQ().msg();
    }
}
