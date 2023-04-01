package com.sample;

/**
 * The long data type is a 64-bit two's complement integer.
 * Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive).
 * Its minimum value is -9,223,372,036,854,775,808 and maximum value is 9,223,372,036,854,775,807.
 * Its default value is 0.
 * The long data type is used when you need a range of values more than those provided by int.
 *
 * Don't forget to add 'L' at the end of the number if not added it will consider as int.
 * */

public class Long_Type {
    public static void main(String[] args) {
        long num = 9999999999L;
        System.out.println("NUM :: " + num);
    }
}
