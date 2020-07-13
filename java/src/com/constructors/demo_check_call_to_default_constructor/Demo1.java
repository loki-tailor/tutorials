package com.constructors.demo_check_call_to_default_constructor;

/*-
	@author lokeshwar @created 13-07-20

	Demonstrating: The compiler won't supply a default constructor, if there is already a parameterized constructor defined.

	---------------------------------------------------------------
	Output :- 

	Calling A.A(), getSimpleName @ B
	Calling B.B(int) without super() in B.B(), getSimpleName @ B
	---------------------------------------------------------------
*/

class A {
	A() { System.out.println("Calling A.A(), getSimpleName @ " + this.getClass().getSimpleName()); }
}

class B extends A {
	B() { System.out.println("Calling B.B() without super(), getSimpleName @ " + this.getClass().getSimpleName()); }
	B(int i) { System.out.println("Calling B.B(int) without super() in B.B(), getSimpleName @ " + this.getClass().getSimpleName()); }
}

public class Demo1 {
	public static void main(String[] args) {
		new B();
	}
}
