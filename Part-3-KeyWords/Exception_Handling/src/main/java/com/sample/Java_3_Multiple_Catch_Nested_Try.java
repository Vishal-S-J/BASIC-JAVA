package com.sample;

/**
 * A try block can be followed by one or more catch blocks.
 * Each catch block must contain a different exception handler.
 * So, if you have to perform different tasks at the occurrence of different exceptions,
 * use java multi-catch block.
 *
 * In Java, using a try block inside another try block is permitted.
 * It is called as nested try block.
 * Every statement that we enter a statement in try block,
 * context of that exception is pushed onto the stack.
 *
 * For example, the inner try block can be used to handle ArrayIndexOutOfBoundsException
 * while the outer try block can handle the ArithmeticException (division by zero).
 * */

public class Java_3_Multiple_Catch_Nested_Try {
    public void tryMultiCatchBlock1(int a, int b) {
        try {
            int c = a/b;
            System.out.println("C :: "+c);
            System.out.println("EXECUTION SUCCESSFUL");
        } catch (ArithmeticException e) {
            System.out.println("ARITHMETIC EXCEPTION");
        } catch (Exception e) {
            System.out.println("EXCEPTION");
        }
    }

    public void tryMultiCatchBlock2() {
        try {
            int s[] = new int[5];
            System.out.println(s[10]);
            System.out.println("EXECUTION SUCCESSFUL");
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch(Exception e) {
            System.out.println("Parent Exception occurs");
        }
    }

    public static void main(String[] args) {
        Java_3_Multiple_Catch_Nested_Try t3 = new Java_3_Multiple_Catch_Nested_Try();
        t3.tryMultiCatchBlock1(10, 0);
        System.out.println("============================================");
        t3.tryMultiCatchBlock2();
    }
}
