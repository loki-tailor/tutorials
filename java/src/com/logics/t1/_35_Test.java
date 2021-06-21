package com.logics.t1;

class Student2 {
    String name;
    int age;

    void Student2() {
        Student2("James", 25);
    }

    void Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class _35_Test {
    public static void main(String[] args) {
        Student2 s = new Student2();
        System.out.println(s.name + ":" + s.age);
    }
}

/*-

Explanation
Methods can have same name as the class. Student() and Student(String, int) are methods and not constructors of the class, note the void return type of these methods.

As no constructors are provided in the Student class, java compiler adds default no-arg constructor. That is why the statement Student s = new Student(); doesn't give any compilation error.



Default values are assigned to instance variables, hence null is assigned to name and 0 is assigned to age. 



In the output, null:0 is displayed.
*/