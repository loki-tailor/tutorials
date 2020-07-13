package com.constructors.demo_every_class_must_have_constructor;

/*-
	@author lokeshwar @created 13-07-2020

	Demonstrating the quote: "Every class, including abstract classes, MUST have a constructor" (sic)
*/

abstract class A {
	public A() {
		System.out.println("Inside abstract class A's constructor with args (int)");
	}
}

class B extends A {
	public B(int i) {}	
}
/*-
	Above statement will give compiler error as below, when main() has 'new B();'

	--------------------------------------------------------------------------
	com/constructors/Demo2.java:32: error: class Demo1 is public, should be declared in a file named Demo1.java
	public class Demo1 {
	       ^
	com/constructors/Demo2.java:35: error: constructor B in class B cannot be applied to given types;
			new B();
			^
	  required: int
	  found: no arguments
	  reason: actual and formal argument lists differ in length
	2 errors
	--------------------------------------------------------------------------
*/

public class Demo2 {
	public static void main(String[] args) {

		new B();
		System.out.println("done");
	}
}
