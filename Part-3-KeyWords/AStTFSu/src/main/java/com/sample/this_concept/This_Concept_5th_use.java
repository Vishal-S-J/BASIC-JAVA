package com.sample.this_concept;

/**
 * 5) this: to pass as argument in the constructor call
 *
 * We can pass the "this" keyword in the constructor also.
 * It is useful if we have to use one object in multiple classes.
 *
 * */

class A {
    This_Concept_5th_use use5;
    A(This_Concept_5th_use use5) {
        this.use5 = use5;
    }

    void display() {
        System.out.println("DISPLAY METHOD :: "+use5.data);
    }
}

public class This_Concept_5th_use {

    int data = 10;
    This_Concept_5th_use() {
        A a = new A(this);
        a.display();
    }

    public static void main(String[] args) {
        This_Concept_5th_use use5 = new This_Concept_5th_use();
    }
}
