package com.sample;

/**
 * The short data type is a 16-bit signed two's complement integer.
 * Its value-range lies between -32,768 to 32,767 (inclusive).
 * Its minimum value is -32,768 and maximum value is 32,767.
 * Its default value is 0.
 *
 * The short data type can also be used to save memory just like byte data type.
 * A short data type is 2 times smaller than an integer.
 * */

public class Short_Type {
    public static void main(String[] args) {
        short num = -32768;
        System.out.println("NUM :: " + num);

        /*
        if the values is out of range then it gives compilation error
        num = -32770;
        System.out.println("num" + num);
         */
    }
}
