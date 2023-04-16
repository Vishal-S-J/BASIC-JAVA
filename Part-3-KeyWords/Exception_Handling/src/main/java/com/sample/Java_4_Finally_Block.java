package com.sample;

/**
 *                  Program code
 *                        |
 *                        |
 *    -----No-----Exception Occurred (try)-----YES-----
 *    |                                               |
 *    |                        -----NO-----Exception Handle (catch)-----YES-----
 *    |                        |                                               |
 *    |                        |                                               |
 *    -------------------      |      ------------------------------------------
 *                      |      |      |
 *                  finally block (finally)
 *
 *
 * Java finally block is a block used to execute important code such as closing the connection, etc.
 * Java finally block is always executed whether an exception is handled or not.
 * Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.
 * The "finally" block follows the try-catch block.
 *
 * When to use
 * finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
 * The significant statements to be printed can be placed in the "finally" block.
 * */

public class Java_4_Finally_Block {

    public static void divide(int a, int b) {
        int c = a/b;
        System.out.println("DIVISION IS :: " + c);
    }

    public static void tryCatchFinally(int a, int b) {
        try {
            System.out.println("TRY BLOCK EXECUTED");
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("CATCH BLOCK EXECUTED");
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY BLOCK EXECUTED");
        }
    }

    public static void main(String[] args) {
        //finally block is executed in both the cases
        tryCatchFinally(10, 9);
        System.out.println("=====================================");
        tryCatchFinally(40, 0);
    }
}
