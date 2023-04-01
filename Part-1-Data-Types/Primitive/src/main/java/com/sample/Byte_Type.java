package com.sample;

/**
 * The byte data type is an example of primitive data type.
 * It is an 8-bit signed two's complement integer.
 * Its value-range lies between -128 to 127 (inclusive).
 * Its minimum value is -128 and maximum value is 127.
 * Its default value is 0.
 * */

public class Byte_Type {
    public static void main(String[] args) {
        byte num = 127;
        System.out.println("NUM :: " + num);

        /*
        if the values is out of range then it gives compilation error
        num = 200;
        System.out.println("num" + num);
         */
    }
}
