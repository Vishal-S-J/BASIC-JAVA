package com.sample;

/**
 * You will learn more about this in inheritance
 * */

class base_class {
    //contains methods and variables
    int num1 = 30;
    int num2 = 40;

    public void sum() {
        System.out.println("SUM IS :: "+ (num1+num2));
    }
}

public class Extends_Keyword extends base_class {   //extends the base class
    public static void main(String[] args) {
        Extends_Keyword ek = new Extends_Keyword();
        ek.sum();//calling parent class method
    }
}
