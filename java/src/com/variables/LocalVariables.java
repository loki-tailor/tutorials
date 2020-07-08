package com.variables;

/*-
	created @ 31-03-20
	@author lokeshwar
*/

public class LocalVariables {

	void testMethod(String args1) {
		
		/*-
			If we don't initialize args2, we will get below error:
		
			com/variables/LocalVariables.java:12: error: variable args2 might not have been initialized
			System.out.println("args1 = " + args1 + ", args2 = " + args2);
				                                               ^
			1 error

		*/
		int args2 = 0;
 		// int args2; 
		System.out.println("args1 = " + args1 + ", args2 = " + args2);
	} // end of method

	public static void main(String[] args) {
		new LocalVariables().testMethod("lokeshwar");
	}

} // end of class
