package com.sample;         //this is the package name just like folder within folder

import java.util.Scanner;       //import this will take the class path with package name

public class Others_Left {
    public void add(int num1, int num2) {   //void is a keyword where it returns nothing
        int sum = num1 + num2;
        System.out.println("SUM IS :: " + sum);
    }

    public int sum(int num1, int num2) {
        return num1 + num2;                 //this is the return keyword depending on the return type of method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Others_Left ol = new Others_Left();     //new keyword is used to create new object
        ol.add(a, b);
        System.out.println("==========================================================");

        System.out.println("SUM IS " + ol.sum(a, b));
        System.out.println("==========================================================");

        System.out.println(ol instanceof Others_Left);
    }
}
