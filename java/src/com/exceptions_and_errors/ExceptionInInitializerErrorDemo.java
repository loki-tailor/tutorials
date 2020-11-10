package com.exceptions_and_errors;

/*- @created  05-11-2020
*/

public class ExceptionInInitializerErrorDemo {
	static {
		// int a = 1/0;
		/*- above will give below exception: 
				Exception in thread "main" java.lang.ExceptionInInitializerError
				Caused by: java.lang.ArithmeticException: / by zero
				at com.exceptions_and_errors.ExceptionInInitializerErrorDemo.<clinit>(ExceptionInInitializerErrorDemo.java:8)
		*/
	}

	// ########################################################################################################################

	private static int state = initializeVar();
	/*- above will give below exception: 
			Exception in thread "main" java.lang.ExceptionInInitializerError
			Caused by: java.lang.RuntimeException
					at com.exceptions_and_errors.ExceptionInInitializerErrorDemo.initializeVar(ExceptionInInitializerErrorDemo.java:19)
					at com.exceptions_and_errors.ExceptionInInitializerErrorDemo.<clinit>(ExceptionInInitializerErrorDemo.java:16)
	*/

	private static int initializeVar() {
		throw new RuntimeException();
	}

	// ########################################################################################################################

	public static void main(String[] args) {
		// static ExceptionInInitializerErrorDemo obj; // error: illegal start of expression
		System.out.println("Static object initialization trying...");
	}

	// ########################################################################################################################
}