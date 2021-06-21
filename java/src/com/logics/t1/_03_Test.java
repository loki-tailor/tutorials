package com.logics.t1;

import java.util.ArrayList;
import java.util.List;

class Student {
	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student[" + name + ", " + age + "]";
	}
}

public class _03_Test {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("James", 25));
		students.add(new Student("James", 27));
		students.add(new Student("James", 25));
		students.add(new Student("James", 25));

		students.remove(new Student("James", 25));

		for (Student stud : students) {
			System.out.println(stud);
		}
	}
}

/***
 * Explanation Before you answer this, you must know that there are 5 different
 * Student object created in the memory (4 at the time of adding to the list and
 * 1 at the time of removing from the list). This means these 5 Student objects
 * will be stored at different memory addresses.
 * 
 * 
 * 
 * remove(Object) method removes the first occurrence of matching object and
 * equals(Object) method decides whether 2 objects are equal or not.
 * equals(Object) method defined in Object class uses == operator to check the
 * equality and in this case as 5 Student objects are stored at different memory
 * location, hence not equal.
 * 
 * 
 * 
 * Nothing is removed from the students list, all the 4 Student objects are
 * printed in the insertion order.
 */