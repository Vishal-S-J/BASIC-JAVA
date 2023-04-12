package com.sample.this_concept;

/**
 * 2) this: to invoke current class method
 *
 * As u can see below we have used the m method within n
 * this gets changed at compile time, but we don't know that
 * this.m() is same as m()
 * */

class Method {
    public void mMethod() {
        System.out.println("This is the M Method");
    }

    public void nMethod() {
        System.out.println("This is the N Method");
//        this.mMethod(); is same as mMethod();
        this.mMethod();
        mMethod();
    }
}

public class This_Concept_2nd_use {
    public static void main(String[] args) {
        Method method = new Method();
        method.nMethod();
    }
}
