package com.sample;

public class Java_6_Throws_keyword {
    public static void validate(int age) throws ArithmeticException{
        if (age < 18) {
            throw new ArithmeticException("AGE less than 18");
        } else {
            System.out.println("valid AGE");
        }
    }

    public static void main(String[] args) {
        validate(50);
        System.out.println("=============================================");
        validate(16);
    }
}
