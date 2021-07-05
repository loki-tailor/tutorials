package com.exceptions_and_errors;

/*- @created 04-11-2020

	---------------------------------------------------------------------------

	*	Broad categories of exception: 
			- JVM exceptions: Those exceptions or errors that are either exclusively or most logically thrown by the JVM.
			- Programmatic Exceptions: Those exceptions that are thrown explicitly by application and/or API programmers.

	*	When you have an exception hierarchy, you should use the most precise exception that you can.
	---------------------------------------------------------------------------

*/

public class NPE_Demo {
	static String static_global_var_null;
	String global_var_null;
	public static void main(String[] args) {
		System.out.println(static_global_var_null); // thos won't give exception
		System.out.println(static_global_var_null.length()); // this will give NPE
		// System.out.println(global_var_null); // NPE won't come & > error: non-static variable global_var_null cannot be referenced from a static context
	}

	void global_var_null_usage() {
		String local_var_null;
		System.out.println(global_var_null); // this won't give compile time error
		// System.out.println(local_var_null); // compile time error: variable local_var_null might not have been initialized
	}
}