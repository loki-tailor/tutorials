package com.variables;

/*-
	created @ 31-03-20
	@author lokeshwar
	
	Key Points:
	* 'final variables cannot be reassigned once assigned a value
	* 'final' reference variables cannot refer to a different object once the object has been assigned to the final variable
	* 'final' variable must be initialized before the constructor completes.
	* There is no such thing as final object. An object reference marked final does NOT mean the object itself can't change. 
*/

public class FinalVariables {

    // below will give compiler error, since
    // 'final' variables must be initialized before the constructor completes
    // final String invalid_final_var;

    public FinalVariables() {
	System.out.println("Inside default constructor");
	// System.out.println("Value of invalid_final variable color = " +
	// invalid_final_var);
	System.out.println("Valid final_variable - " + valid_final_Var);
    }

    final String valid_final_Var = "loki";

    public static void main(String[] args) {
	FinalVariables fv = new FinalVariables();
    }

} // end of class
