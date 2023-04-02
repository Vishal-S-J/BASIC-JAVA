package com.sample;

/**
 * There is also called as "for-each" loop, which is used exclusively to loop through elements in an array
 *
 * Syntax -
 * for (type variableName : arrayName) {
 *      // code block to be executed
 * }
 * */

public class For_Loop_Enhanced {
    public static void main(String[] args) {
        String[] cars = {"Creta", "BMW", "Audi", "Mercedes"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
