package com.logics.t11._71;

class A { void greet() { System.out.println("Good morning!"); } }

class B extends A { void greet() { System.out.println("Good Afternoon!"); } }

class C extends B { void greet() { System.out.println("Good Night!"); } }

public class Test {
	public static void main(String[] args) {

		A a = new C();
		a.greet(); // allowed
		( (B) a).greet(); // instance is of 'C', althought type of 'A', hence 'C' method  is called
		( (C) a).greet(); // same as above
		

	}
}