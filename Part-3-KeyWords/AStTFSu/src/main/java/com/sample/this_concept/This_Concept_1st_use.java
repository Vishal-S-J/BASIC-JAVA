package com.sample.this_concept;

/**
 * 1) this: to refer current class instance variable
 *
 * There can be a lot of usage of Java this keyword.
 * In Java, this is a reference variable that refers to the current object.
 * */

public class This_Concept_1st_use {
    /**This is the example without this keyword*/
    static class Student1 {
        int roll_no;
        String name;
        float fee;

        Student1(int roll_no, String name, float fee) {
            roll_no = roll_no;
            name = name;
            fee = fee;
        }

        public void display() {
            System.out.println(roll_no+" "+name+" "+fee);
        }
    }

    /**This is the class with this keyword*/
    static class Student2 {
        int roll_no;
        String name;
        float fee;

        Student2(int roll_no, String name, float fee) {
            this.roll_no = roll_no;
            this.name = name;
            this.fee = fee;
        }

        public void display() {
            System.out.println(roll_no+" "+name+" "+fee);
        }
    }

    /**This is the example where the "this" keyword is not required but code works*/
    static class Student3 {
        int roll_no;
        String name;
        float fee;

        Student3(int roll, String nme, float fe) {
            roll_no = roll;
            name = nme;
            fee = fe;
        }

        public void display() {
            System.out.println(roll_no+" "+name+" "+fee);
        }
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1(205, "NAVIN", 52000f);
        student1.display();
        Student2 student2 = new Student2(205, "NAVIN", 52000f);
        student2.display();
        Student3 student3 = new Student3(216, "RAJESH", 40000);
        student3.display();
    }
}
