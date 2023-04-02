package com.sample;

/**
 * Loops can execute a block of code as long as a specified condition is reached.
 * Loops are handy because they save time, reduce errors, and they make code more readable.
 *
 * Syntax -
 * for (statement 1; statement 2; statement 3) {
 *      // code block to be executed
 * }
 *
 * Statement 1 is executed (one time) before the execution of the code block.
 * Statement 2 defines the condition for executing the code block.
 * Statement 3 is executed (every time) after the code block has been executed.
 *
 * When you know exactly how many times you want to loop through a block of code,
 * use the for loop instead of a while loop
 * */

public class For_Loop {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("I IS :: "+i);
        }

        //for loop can also be used as nested for loop
        System.out.println("\n\n");

        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);      // Executes 2 times
            for (int j = 1; j <= 3; j++) {          // Inner for loop
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
    }
}
