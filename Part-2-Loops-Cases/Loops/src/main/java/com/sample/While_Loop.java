package com.sample;

/**
 * The "while loop" loops through a block of code as long as a specified condition is true
 *
 * Syntax -
 * while (condition) {
 *      // code block to be executed
 * }
 *
 * Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
 * */

public class While_Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("I IS "+i);
            i++;
        }

        System.err.println("Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!");
    }
}
