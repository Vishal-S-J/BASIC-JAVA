package com.sample;

/**
 * The int data type is a 32-bit signed two's complement integer.
 * Its value-range lies between -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive).
 * Its minimum value is -2,147,483,648and maximum value is 2,147,483,647. Its default value is 0.
 *
 * The int data type is generally used as a default data type for integral values unless
 * if there is no problem about memory.
 * */

public class Int_Type {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println("NUM :: " + num);

        /*
        if the values is out of range then it gives compilation error
        num = 2147483650;
        System.out.println("num" + num);
         */
    }
}
