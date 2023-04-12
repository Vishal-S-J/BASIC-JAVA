package com.sample.static_concept;

//Writing a code where we will count number of times the object is called

public class Count_Without_Static {

    int count = 0;

    Count_Without_Static() {
        count++;
        System.out.println("Counter :: "+count);
    }

    public static void main(String[] args) {
        Count_Without_Static c1 = new Count_Without_Static();
        Count_Without_Static c2 = new Count_Without_Static();
        Count_Without_Static c3 = new Count_Without_Static();
    }

}
