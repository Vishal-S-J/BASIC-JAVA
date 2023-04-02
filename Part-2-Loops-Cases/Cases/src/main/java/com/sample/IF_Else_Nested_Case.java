package com.sample;

/**
 * The nested if statement represents the if block within another if block.
 * Here, the inner if block condition executes only when outer if block condition is true.
 *
 * Syntax -
 * if(condition){
 *      //code to be executed
 *           if(condition){
 *              //code to be executed
 *     }
 * }
 *
 * you can also add if block within the else block
 * */

public class IF_Else_Nested_Case {
    public static void main(String[] args) {
        int num1 = 30, num2 = 20, num3 = 10;

        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println(num1 +" GREATER THAN "+num2 +" and "+ num3);
            } else {
                System.out.println(num3 +" GREATER THAN "+num1 +" and "+ num2);
            }
        } else {
            if(num2 > num3) {
                System.out.println(num2 +" GREATER THAN "+num1 +" and "+ num3);
            } else {
                System.out.println(num3 +" GREATER THAN "+num1 +" and "+ num2);
            }
        }

        //pls use numbers which are not equal
    }
}
