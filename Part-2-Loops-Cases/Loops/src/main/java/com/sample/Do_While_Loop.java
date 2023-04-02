package com.sample;

/**
 * The do/while loop is a variant of the while loop.
 * This loop will execute the code block once, before checking if the condition is true,
 * then it will repeat the loop as long as the condition is true.
 *
 * Syntax -
 * do {
 *      // code block to be executed
 * } while (condition);
 *
 * NOTE: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
 * */

public class Do_While_Loop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 10);

        System.err.println("NOTE :: Do not forget to increase the variable used in the condition, otherwise the loop will never end!");
    }
}
