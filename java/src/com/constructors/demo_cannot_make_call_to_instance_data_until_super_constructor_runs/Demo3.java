package com.constructors.demo_cannot_make_call_to_instance_data_until_super_constructor_runs;

/*-
	@author lokeshwar @created 13-07-20

	Demonstrating Constructor Rule: 
		* You cannot make a call to an instance method or access an instance variable until after the super constructor runs.
		* Only static variables and methods can be accessed as part of the calls to super() or this(). 

	* COMPILE ERROR: since we are using variable 'j' to call a super-constructor which doesn't exists. 

	-------------------------------------------------------------------------------------------

	OUTPUT :- 

	com/constructors/demo_cannot_make_call_to_instance_data_until_super_constructor_runs/Demo3.java:33: error: constructor Object in class Object cannot be applied to given types;
		A() { super(j); System.out.println(i + " - " + j); }
		      ^
	  required: no arguments
	  found: int
	  reason: actual and formal argument lists differ in length
	1 error

	-------------------------------------------------------------------------------------------

	
*/

class A {
	int i = 10;
	static int j = 20;

	A() { super(j); System.out.println(i + " - " + j); }

	A(int var) { System.out.println(var); }
}

public class Demo3 {
	public static void main(String[] args) {
		new A();	
	}
}
