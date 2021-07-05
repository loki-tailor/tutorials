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

// class B2 extends A {}
// Compile error for above when it's uncommented, Implicit super constructor A()
// is undefined for default constructor. Must
// define an explicit constructo

/*-
	TBD: when this error came..
	Above statement is commented, compiler error as below, when main() has 'new B();'

	--------------------------------------------------------------------------
	com/constructors/Demo1.java:15: error: constructor A in class A cannot be applied to given types;
	class B extends A {}
	^
	  required: int
	  found: no arguments
	  reason: actual and formal argument lists differ in length
	1 error
	--------------------------------------------------------------------------
*/

class B3 extends A2 {
	B3() {
		// compile error if call to super is not made here
		// mplicit super constructor A() is undefined for default constructor. Must
		// define an explicit constructo
		super(0);
		System.out.println("Inside class B3's constructor w/o args");
	}
}

public class Demo1 {
	public static void main(String[] args) {

		// new B2();
		new B3();
		System.out.println("done");
	}
}
