package com.constructors.demo_cannot_make_call_to_instance_data_until_super_constructor_runs;

/*-
	@author lokeshwar @created 13-07-20

	Demonstrating Constructor Rule: 
		* You cannot make a call to an instance method or access an instance variable until after the super constructor runs.
		* Only static variables and methods can be accessed as part of the calls to super() or this(). 

	* COMPILE ERROR: since we are using instance variable 'i' before super-type constructor is being called

	-------------------------------------------------------------------------------------------

	OUTPUT :- 

	com/constructors/demo_cannot_make_call_to_instance_data_until_super_constructor_runs/Demo2.java:15: error: cannot reference i before supertype constructor has been called
		A() { super(i); System.out.println(i + " - " + j); }
			    ^
	com/constructors/demo_cannot_make_call_to_instance_data_until_super_constructor_runs/Demo2.java:15: error: constructor Object in class Object cannot be applied to given types;
		A() { super(i); System.out.println(i + " - " + j); }
		      ^
	  required: no arguments
	  found: int
	  reason: actual and formal argument lists differ in length
	2 errors
	-------------------------------------------------------------------------------------------

	
*/

class A {
	int i = 10;
	static int j = 20;

	A() {
		// super(i); // compile error
		// this(i); // compile error
		// super(j); // compile error
		this(j); // no compile error
		System.out.println(i + " - " + j);
	}

	A(int var) {
		System.out.println(var);
	}
}

public class Demo2 {
	public static void main(String[] args) {
		new A();
	}
}
