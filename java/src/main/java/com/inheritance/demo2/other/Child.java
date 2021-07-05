 package com.inheritance.demo2.other;

/*-
	created @ 29-03-20
	@author lokeshwar
*/

import com.inheritance.demo2.certification.Parent;

class Child extends Parent {

	// RUN 1
	// public void testIt() { System.out.println("x is " + x); } // inherits x from Parent 

	// RUN 2
	public void testIt() {
		System.out.println("x is " + x);
		
		Parent p = new Parent();
		// compile error will come when using 'x' usnig reference of Parent
		// System.out.println("X in parent is " + p.x);
	} // end of method

} // end of class

/*-	RUN 1: 
	When we are trying to access the 'x' variable using the 'this' i.e. present class i.e. 'Child' class instance
	Then we are not getting any errors
*/

/*-	RUN 2:
	When we access x using 'Parent' class instance,
	Then we get below compilation error:

	com/inheritance/demo2/other/Child.java:19: error: x has protected access in Parent
		System.out.println("X in parent is " + p.x);
		                                        ^
1 error

*/

		
