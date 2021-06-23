package com.logics.t3;
/*
 * created @ Wed Jun 23 2021 7:18:14 am
 * ref @ 
 */

class Student {
    String name;
    int age;

    Student() {
        Student("James", 25); // the method is undefined
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class _31_Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + " : " + s.age);
    }
}

/*-
Explanation
A constructor can call another constructor by using this(...) and not the constructor name.

Hence Student("James", 25); causes compilation error.
*/