package com.sample;

/**
 * In Java the if statement tests the condition.
 * It executes the - if block - if condition is true.
 *
 * Syntax -
 * if(condition) {
 *     //code to run or execute
 * }
 * */

public class IF_Case_Simple {
    public static void main(String[] args) {
        int num1 = 55, num2 = 33;
        if(num1 > num2) {
            System.out.println(num1 +" IS GREATER THAN "+ num2);
        }

        //now make changes in num2 to 99
        //and execute it will run, but it will not show any output
        //that will be covered in else statement
    }
}
