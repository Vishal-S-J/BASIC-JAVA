package com.sample.this_concept;

/**
 * Let's prove that this keyword refers to the current class instance variable.
 * In this program, we are printing the reference variable and this, output of both variables are same.
 * */

class Z {
    void meth() {
        System.out.println(this);
    }
}

public class This_Concept_Proof {
    public static void main(String[] args) {
        Z obj = new Z();
        System.out.println(obj);
        obj.meth();
        System.out.println("=========================================");
        Z obj2 = new Z();
        System.out.println(obj2);
        obj2.meth();
    }
}
