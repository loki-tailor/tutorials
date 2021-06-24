package com.constructors.demo_cannot_make_call_to_instance_data_until_super_constructor_runs;

/*-
	@author lokeshwar @created 13-07-20

	Demonstrating Constructor Rule: 
		* You cannot make a call to an instance method or access an instance variable until after the super constructor runs.
		* Only static variables and methods can be accessed as part of the calls to super() or this(). 

	* NO COMPILE ERROR
	
	Output :- 
	10 - 20
*/

class A {
	int i = 10;
	static int j = 20;

	A() {
		System.out.println(i + " - " + j);
	}

	A(int var) {
		System.out.println(var);
	}
}

public class Demo1 {
	public static void main(String[] args) {
		new A();
	}
}
