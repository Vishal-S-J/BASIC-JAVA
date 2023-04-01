package com.sample;

/**
 * The float data type is a single-precision 32-bit IEEE 754 floating point.
 * Its value range is unlimited.
 * It is recommended to use a float (instead of double)
 * if you need to save memory in large arrays of floating point numbers.
 * The float data type should never be used for precise values, such as currency.
 * Its default value is 0.0F
 *
 * float size is 4 byte
 * */

public class Float_Type {
    public static void main(String[] args) {
        float num = 9999.73895f;
        System.out.println("NUM :: " + num);
    }
}
