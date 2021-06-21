package com.logics.t1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Student3 {
    private String name;
    private int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student3[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student3) {
            Student3 stud = (Student3) obj;
            if (this.name.equals(stud.name) && stud.age == 27) {
                return true;
            }
        }
        return false;
    }
}

public class _55_Test {
    public static void main(String[] args) {
        List<Student3> student3s = new ArrayList<>();
        student3s.add(new Student3("James", 25)); // Line n1
        student3s.add(new Student3("James", 27)); // Line n2
        student3s.add(new Student3("James", 25)); // Line n3
        student3s.add(new Student3("James", 25)); // Line n4

        student3s.remove(new Student3("James", 25)); // Line n5

        for (Student3 stud : student3s) {
            System.out.println(stud);
        }
    }
}