package com.sample;

public class Java_5_Throw_keyword {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("AGE Less than 18");
        } else {
            System.out.println("Eligible for Voting");
        }
    }

    public static void main(String[] args) {
        validateAge(45);
        System.out.println("=========================================");
        validateAge(15);
    }
}
