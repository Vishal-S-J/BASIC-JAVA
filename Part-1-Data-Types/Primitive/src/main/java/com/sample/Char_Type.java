package com.sample;

/**
 * The char data type is a single 16-bit Unicode character.
 * Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
 * The char data type is used to store characters and size is 2 byte.
 * */

public class Char_Type {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.println("CHARACTER :: "+letter);

        //if you want to take a single character from a keyword then use
        String word = "Leo";
        letter = word.charAt(0);
        System.out.println("CHARACTER AT 0 :: "+letter);
    }
}
