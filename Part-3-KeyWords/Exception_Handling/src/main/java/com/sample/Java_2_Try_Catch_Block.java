package com.sample;

/**
 * Java try block is used to enclose the code that might throw an exception.
 * It must be used within the method.
 *
 * If an exception occurs at the particular statement in the try block,
 * the rest of the block code will not execute.
 * So, it is recommended not to keep the code in try block that will not throw an exception.
 *
 * Java try block must be followed by either catch or finally block.
 * */

public class Java_2_Try_Catch_Block {
    public void tryCatchBlock(int a, int b) {
        try {
            int c = a/b;
            System.out.println("C :: "+c);
            System.out.println("EXECUTION SUCCESSFUL");
        } catch (Exception e) {
            System.out.println("EXCEPTION");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Java_2_Try_Catch_Block t2 = new Java_2_Try_Catch_Block();
        t2.tryCatchBlock(10, 2);
    }
}
