package com.sample.final_concept;

/**
 * 3) Java final class
 *
 * If you make any class as final, you cannot extend it.
 * */

final class Bike3 {

}

public class Final_Concept_Class{ //extends Bike3{ // write extends Bike3 which will give u compile time error
    void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Final_Concept_Class honda= new Final_Concept_Class();
        honda.run();
    }
}
