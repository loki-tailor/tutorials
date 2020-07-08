package com.logics.app_ocajavatest;

/**
	created @ 23-01-2020
	@author lokeshwar

	Demonstrating the usage of static/non-static variables inside a ...
	... static/nonstatic block
*/

public class Order3 {

	final String value1 = "1";
	static String value2 = "2";
	String value3 = "3";

	{
		// CODE SNIPPET 1
		value3 = "f"; // valid
		//value1 = "d"; // invalid - error: cannot assign a value to final variable value1
		value2 = "e"; // valid
	}	

	static {
		// CODE SNIPPET 2
		value2 = "h"; // valid
		//value3 = "i"; // invalid - error: non-static variable value3 cannot be referenced from a static context
		//value1 = "g"; // invalid -  error: non-static variable value1 cannot be referenced from a static context
	}

	public static void main(String[] args) {
		
	}
}