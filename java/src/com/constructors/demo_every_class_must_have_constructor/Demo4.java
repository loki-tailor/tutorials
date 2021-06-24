package com.constructors.demo_every_class_must_have_constructor;

/*-
	@author lokeshwar @created 13-07-2020

	Demonstrating the quote: "Every class, including abstract classes, MUST have a constructor" (sic)
	
*/

abstract class A {
	public A(int i) {
		System.out.println("Inside abstract class A's constructor with args (int)");
	}
}

class B extends A {
	public B() {
		System.out.println("Inside abstract class B's constructor with args ()");
	}
}

/*-
	COMPILE ERROR AS BELOW:

	-----------------------------------------------------------------------------------------------------------
	com/constructors/Demo4.java:20: error: constructor A in class A cannot be applied to given types;
	public B(){ System.out.println("Inside abstract class B's constructor with args ()");}
	          ^
	  required: int
	  found: no arguments
	  reason: actual and formal argument lists differ in length
	com/constructors/Demo4.java:26: error: constructor B in class B cannot be applied to given types;
			new B(10);
			^
	  required: no arguments
	  found: int
	  reason: actual and formal argument lists differ in length
	2 errors
	-----------------------------------------------------------------------------------------------------------

*/

public class Demo4 {
	public static void main(String[] args) {

		new B(10);
		System.out.println("done");
	}
}
