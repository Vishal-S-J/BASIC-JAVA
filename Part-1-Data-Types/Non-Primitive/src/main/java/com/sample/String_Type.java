package com.sample;

/**
 * In Java, string is basically an object that represents sequence of char values.
 * An array of characters works same as Java string.
 * */

public class String_Type {
    public static void main(String[] args) {
        char[] ch={'j','a','v','a','t','p','o','i','n','t'};
        String s=new String(ch);
        System.out.println("ARRAY AS STRING :: "+s);

        //this is same as
        String p="javatpoint";
        System.out.println("STRING :: "+p);
    }
}
