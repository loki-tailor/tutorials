package com.compilation_err_checking;

/**-
	creted @ 29-03-20
	@author lokeshwar
*/

public class AccessModifierToLocalVariableChk {
	void doStuff() {

		// compilation error as : error: illegal start of expression
		// private int x = 7; 
		// public final z = 30;


		// no compilation error, as only one [non-access] modifier is allowed i.e. final
		final int y = 20; 
		
	}	
} // end of class
