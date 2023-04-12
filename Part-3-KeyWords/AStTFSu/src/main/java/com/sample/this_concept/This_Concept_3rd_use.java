package com.sample.this_concept;

/**
 * 3) this() : to invoke current class constructor
 *
 * The "this()" constructor call can be used to invoke the current class constructor.
 * It is used to reuse the constructor.
 * In other words, it is used for constructor chaining.
 * Let's take simple example and move to complex part.
 * */

class Part1 {
    Part1() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    Part1(int x) {
        this();
        System.out.println("PARAMETERIZED CONSTRUCTOR :: "+x);
    }
}

/**
 * Same can be done the opposite
 * */
class Part2 {
    Part2() {
        this(25);
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    Part2(int x) {
        System.out.println("PARAMETERIZED CONSTRUCTOR :: "+x);
    }
}

/**
 * Real usage of this() constructor call
 * */

class Student {
    int roll_no;
    String name,course;
    float fee;
    Student(int roll_no, String name, String course) {
        this.roll_no = roll_no;
        this.name=name;
        this.course=course;
    }
    Student(int roll_no, String name, String course, float fee) {
        this(roll_no,name,course);//reusing constructor
        this.fee=fee;

//        If it's written like this it will give compile time error
//        this.fee=fee;
//        this(roll_no,name,course);
    }
    void display() {
        System.out.println(roll_no +" "+name+" "+course+" "+fee);
    }
}

public class This_Concept_3rd_use {
    public static void main(String[] args) {
        System.out.println("Calling default constructor within parameterized constructor");
        Part1 part1 = new Part1(14);
        System.out.println("============================================================");
        System.out.println("Calling parameterized constructor within default constructor");
        Part2 part2 = new Part2();
        System.out.println("============================================================");
        System.out.println("COMPLEX VERSION or REAL USE");
        Student student = new Student(205, "RITA", "JAVA");
        student.display();
        Student student1 = new Student(112, "RAMESH", "JAVA", 25500f);
        student1.display();
    }
}
