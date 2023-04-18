package com.sample;

enum Season {
    Winter, Rainy, Summer
}

public class Enum_Concept {
    public static void main(String[] args) {
        System.out.println("SEASON :: "+Season.Winter);
        System.out.println("========================================================");

        Season s1 = Season.Rainy;
        System.out.println("OBJ CALL :: "+s1);
        System.out.println("========================================================");

        Season season[] = Season.values();
        for (Season season1 : season) {
            System.out.println(season1 +" :: "+season1.ordinal());
        }
    }
}
