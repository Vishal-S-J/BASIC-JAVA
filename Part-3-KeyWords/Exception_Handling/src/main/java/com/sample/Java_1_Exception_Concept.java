package com.sample;

import java.util.Scanner;

/**
 * Exception is an unwanted or unexpected event, which occurs during the execution of a program
 * i.e. at run time, that disrupts the normal flow of the program’s instructions.
 * Exceptions can be caught and handled by the program.
 * When an exception occurs within a method, it creates an object.
 * This object is called the exception object.
 * It contains information about the exception,
 * such as the name and description of the exception and the state of the program when the exception occurred.
 * */

class Code_Without_Exception_handling {
    public void divide(int a, int b) {
        double c = a/b;
        System.out.println("DIVISION IS :: "+c);
    }
}

class Code_With_Exception_handling {
    public void divide(int a, int b) {
        try {
            double c = a / b;
            System.out.println("DIVISION IS :: " + c);
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Exception occured");
        }
    }
}

public class Java_1_Exception_Concept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :: ");
        int a = sc.nextInt();
        System.out.println("Enter b :: ");
        int b = sc.nextInt();

        Code_With_Exception_handling c2 = new Code_With_Exception_handling();
        c2.divide(a, b);

        //first use a = 20 and b = 4 you will get the value as 5
        //now take a = 10 and b = 0 check what happens

        Code_Without_Exception_handling c1 = new Code_Without_Exception_handling();
        c1.divide(a, b);
    }
}
