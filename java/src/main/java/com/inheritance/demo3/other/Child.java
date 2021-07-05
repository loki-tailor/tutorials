package com.inheritance.demo3.other;

/*-
	created @ 29-03-20
	@author lokeshwar
*/

import com.inheritance.demo3.certification.Parent;

public class Child extends Parent {
	public void testIt() {
	    	// compile error will come when using x
		// System.out.println("x is " + x); 
		Parent p = new Parent();
		// System.out.println("X in parent is " + p.x);
	} // end of method
} // end of class

/*-	BELOW COMPILATION ERROR COMES:

	com/inheritance/demo3/other/Child.java:12: error: x is not public in Parent; cannot be accessed from outside package
		System.out.println("x is " + x); 
		                             ^
	com/inheritance/demo3/other/Child.java:14: error: x is not public in Parent; cannot be accessed from outside package
			System.out.println("X in parent is " + p.x);
				                                ^
	2 errors
*/
