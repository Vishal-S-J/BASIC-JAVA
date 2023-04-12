package com.sample.static_concept;

public class Count_With_Static {

    static int count = 0;

    Count_With_Static() {
        count++;
        System.out.println("Counter :: "+count);
    }

    public static void main(String[] args) {
        Count_With_Static c1 = new Count_With_Static();
        Count_With_Static c2 = new Count_With_Static();
        Count_With_Static c3 = new Count_With_Static();
    }

}
