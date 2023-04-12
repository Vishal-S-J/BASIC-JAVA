package com.sample.this_concept;

/**
 * 4) this: to pass as an argument in the method
 *
 * */

public class This_Concept_4th_use {
    static class S {
        void mMethod(S obj) {
            System.out.println("Method m invoked");
        }

        void p() {
            mMethod(this);
            System.out.println("Method p invoked");
        }
    }

    public static void main(String[] args) {
        S s = new S();
        s.p();
    }
}
