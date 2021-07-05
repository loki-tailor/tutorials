package com.exceptions_and_errors;

/*-

	@created 14-07-20

	ref: https://javaconceptoftheday.com/classnotfoundexception-vs-noclassdeffounderror-in-java/

	*	Both ClassNotFoundException and NoClassDefFoundError occur when a particular class is not found at run time. 

	*	But, they occur at different scenarios. 

	*	ClassNotFoundException is an exception which occurs when you try to load a class at run time using 
		Class.forName() or loadClass() methods and mentioned classes are not found in the classpath. 

	*	NoClassDefFoundError is an error which occurs when a particular class is present at compile time 
		but it was missing at run time.

*/

public class DemoClassNotFoundException {

	public static void main(String[] args) {
		try {		
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
