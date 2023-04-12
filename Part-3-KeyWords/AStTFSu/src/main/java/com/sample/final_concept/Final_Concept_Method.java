package com.sample.final_concept;

/**
 * 2) Java final method
 *
 * If you make any method as final, you cannot override it.
 *
 * */

class Bike2{
    final void run(){System.out.println("running");}
}

public class Final_Concept_Method extends Bike2{
//    uncomment the next line, and you will get the "compile time error".
//    void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Final_Concept_Method honda = new Final_Concept_Method();
        honda.run();
    }
}
