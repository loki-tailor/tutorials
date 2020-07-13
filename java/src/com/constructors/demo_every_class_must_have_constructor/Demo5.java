package com.constructors.demo_every_class_must_have_constructor;

/*-
	@author lokeshwar @created 13-07-2020

	Demonstrating the quote: "Every class, including abstract classes, MUST have a constructor" (sic)

	* NO COMPILE or RUNTIME error 
	* Since, both the Parent & Sub-class have impmeneted all the requried constructors.
	
*/

abstract class A {
	public A() { this(1); System.out.println("Inside abstract class A's constructor with args ()"); }
	public A(int i) {
		System.out.println("Inside abstract class A's constructor with args (int)");
	}
}

class B extends A {
	public B(){ System.out.println("Inside abstract class B's constructor with args ()");}
	public B(int i) { super(); System.out.println("Inside abstract class B's constructor with args (int)"); }	
}

public class Demo5 {
	public static void main(String[] args) {

		new B(10);
		System.out.println("done");
	}
}

/*-
	OUTPUT :- 

	Inside abstract class A's constructor with args (int)
	Inside abstract class A's constructor with args ()
	Inside abstract class B's constructor with args (int)
	done
*/
