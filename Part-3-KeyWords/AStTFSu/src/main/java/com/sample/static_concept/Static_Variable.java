package com.sample.static_concept;

/**
 * If you declare any variable as static, it is known as a static variable.
 * The static variable can be used to refer to the common property of all objects
 * (which is not unique for each object),
 * for example, the company name of employees, college name of students, etc.
 * The static variable gets memory only once in the class area at the time of class loading.
 * */

class Student {
    int roll_no;
    String name;
    static String college = "ITS";

    Student(int roll, String nme) {
        roll_no = roll;
        name = nme;
    }

    public void display() {
        System.out.println(roll_no+" "+name+" "+college);
    }
}

public class Static_Variable {
    public static void main(String[] args) {
        Student student1 = new Student(111, "Karan");
        Student student2 = new Student(222, "Ravi");

        student1.display();
        student2.display();
    }
}
