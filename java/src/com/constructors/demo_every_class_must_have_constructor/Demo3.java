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
		// compile error: Implicit super constructor A() is undefined. Must explicitly
		// invoke another constructorJava(134217871)

	}

	public B(int i) {
		// compile error: Implicit super constructor A() is undefined. Must explicitly
		// invoke another constructorJava(134217871)

	}
}
/*-
	Above statement will give compiler error as below, when main() has 'new B();'

	--------------------------------------------------------------------------
	com/constructors/Demo3.java:16: error: constructor A in class A cannot be applied to given types;
		public B(){}
			  ^
	  required: int
	  found: no arguments
	  reason: actual and formal argument lists differ in length
	com/constructors/Demo3.java:17: error: constructor A in class A cannot be applied to given types;
		public B(int i) {}	
			        ^
	  required: int
	  found: no arguments
	  reason: actual and formal argument lists differ in length
	2 errors
	--------------------------------------------------------------------------
*/

public class Demo3 {
	public static void main(String[] args) {

		new B();
		System.out.println("done");
	}
}
