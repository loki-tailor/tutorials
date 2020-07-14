package com.initialization_blocks.demo2;

/*-
	@created 14-07-2020
	-----------------------------------------------------------------------------------------

	* If there is a mistake in [static] init block, the JVM can throw an ExceptionInInitializationError

	-----------------------------------------------------------------------------------------
	Output :- 

	Exception in thread "main" java.lang.ExceptionInInitializerError
	Caused by: java.lang.ArrayIndexOutOfBoundsException: 4
		at com.initialization_blocks.demo2.ExceptionInInitializerErrorDemo.<clinit>(ExceptionInInitializerErrorDemo.java:9)
	-----------------------------------------------------------------------------------------
*/

public class ExceptionInInitializerErrorDemo {
	static int [] x = new int[4];
	//static { x[4] = 5; } // bad array index !!
	{ x[4] = 5; } // bad array index !!
	public static void main(String [] args) {
		new ExceptionInInitializerErrorDemo();
	}
}
