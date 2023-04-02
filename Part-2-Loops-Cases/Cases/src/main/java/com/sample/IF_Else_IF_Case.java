package com.sample;

/**
 * This is the ladder system where multiple statements get executed
 *
 * Syntax -
 * if(condition1){
 *     //code to be executed if condition1 is true
 * } else if(condition2){
 *     //code to be executed if condition2 is true
 * } else if(condition3){
 *     //code to be executed if condition3 is true
 * }
 * ...
 * else {
 *     //code to be executed if all the conditions are false
 * }
 * */

public class IF_Else_IF_Case {
    public static void main(String[] args) {
        int marks = 30;

        if (marks > 0 && marks <= 35) {
            System.out.println("Fail");
        } else if (marks > 35 && marks <= 50) {
            System.out.println("GRADE E");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("GRADE D");
        } else if (marks > 60 && marks <= 75) {
            System.out.println("GRADE C");
        } else if (marks > 75 && marks <= 90) {
            System.out.println("GRADE B");
        } else if (marks > 90 && marks <= 100) {
            System.out.println("GRADE A");
        } else {
            System.out.println("INVALID MARKS");
        }

        //try changing the marks to 34, 45, 55, 65, 85, 100
        //all conditions will be executed
        //also try negative num and 500
    }
}
