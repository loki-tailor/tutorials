package com.constructors.demo_cannot_make_call_to_instance_data_until_super_constructor_runs;

/*-
	@author lokeshwar @created 13-07-20

	Demonstrating Constructor Rule: 
		* You cannot make a call to an instance method or access an instance variable until after the super constructor runs.
		* Only static variables and methods can be accessed as part of the calls to super() or this(). 

	* COMPILE ERROR: since we are using instance variable 'i' to call this(int) constructor, before all the super-type constructors are called.

	-------------------------------------------------------------------------------------------

	OUTPUT :- 

	com/constructors/demo_cannot_make_call_to_instance_data_until_super_constructor_runs/Demo4.java:33: error: cannot reference i before supertype constructor has been called
		A() { this(i); System.out.println(i + " - " + j); }
			   ^
	1 error

	-------------------------------------------------------------------------------------------

	
*/

class A {
	int i = 10;
	static int j = 20;

	A() {
		this(i);
		System.out.println(i + " - " + j);
	}

	A(int var) {
		System.out.println(var);
	}
}

public class Demo4 {
	public static void main(String[] args) {
		new A();
	}
}
