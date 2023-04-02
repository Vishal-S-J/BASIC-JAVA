package com.sample;

/**
 * In Java if-else statement also tests the condition.
 * It executes the - if block - if condition is true otherwise else block gets executed.
 *
 * Sntax -
 * if(condition) {
 *     //code to run
 * } else {
 *     //code to run
 * }
 * */

public class IF_Else_Case {
    public static void main(String[] args) {
        int num1 = 55, num2 = 33;
        if(num1 > num2) {
            System.out.println(num1 +" IS GREATER THAN "+ num2);
        } else {
            System.out.println(num2 +" IS GREATER THAN "+ num1);
        }

        //now how will you perform if you have 3 numbers
        //there are 2 different ways one is ladder and another is nested
    }
}
