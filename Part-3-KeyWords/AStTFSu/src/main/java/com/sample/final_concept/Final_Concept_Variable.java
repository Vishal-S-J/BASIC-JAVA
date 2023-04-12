package com.sample.final_concept;

/**
 * If you make any variable as final, you cannot change the value of final variable(It will be constant).
 * */

class Bike1 {
    final int speedLimit = 100;
    void run() {
//        uncomment the next line, and you will get the "compile time error".
//        speedLimit = 400;
    }
}

public class Final_Concept_Variable {
    public static void main(String[] args) {
        Bike1 bike1 = new Bike1();
        bike1.run();
    }
}
