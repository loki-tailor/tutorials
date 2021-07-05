package com.exceptions_and_errors;
/*-	@created 02-11-2020

	----------------------------------------------------------------------

	*	- The exceptions that a method can throw must be declared (unless the exceptions are subclasses
		of RuntimeException). 
		- The list of exception is part of a method's public interface (signature)
		'throws' keyword is used.
		- That includes methods that aren't actually throwning it directly, but are 'ducking' and letting
		the exception pass down to the next method in the stack. 

	*	Just becahse the method declares that it throws an exception, doesn't mean it always will.
		It just tells the world that it might.

	*	Each method muust either handle all checked exceptions by supplying a catch clause or list each 
		unhandled checked exception as a thrown exception. This rule is referred to as Java's 
		"handle or declare" requirement (aka 'catch or decalre')

	*	RuntimeException may be thrown from any method without being specified as part of the method's public
		interface (and a handler neeed not be present). 
		And even if the method does declare a RuntimeException, the calling method is under no obligation
		to handle or declare it.

	*	RuntimeException, Error and all their subtypes are unchecked exceptions, and unchekced exceptions do not have
		to be specified or handled. 

	*	e_g_1: To create your own exception, you simply subclass Exception (or one of its subclasses).

	*	e_g_2: When an object of a subtype of Exception is thrown, it must be handled or declared.
		These objects are called 'checked exceptions' and include all exceptions except those that 
		are subtype of RuntimeException, which are unchecked exceptions.
	----------------------------------------------------------------------

*/
public class ExceptionsDemo3 {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

/*- e_g_2:
class MyException extends Exception {
	void someMethod() {
		doStuff();
	}
	void doStuff() throws MyException {
		try {
			throw new MyException();
		} catch(MyException me) {
			throw me;
		}
	}
}

-- output:
--------------------------------------------------------------------------------
com\exceptions_and_errors\ExceptionsDemo3.java:50: error: unreported exception MyException; must be caught or declared to be thrown
                        throw me;
                        ^
1 error
--------------------------------------------------------------------------------
*/


// ##########################################################################################

// e_g_1
/* class MyException extends Exception {}
class Demo { 
	void p() { throw new MyException(); } // throws a checked exception  
}

- output of e_g_1:
------------------------------------------------------------------------
com\exceptions_and_errors\ExceptionsDemo3.java:36: error: unreported exception MyException; must be caught or declared to be thrown
        void p() { throw new MyException(); } // throws a checked exception
                   ^
1 error
------------------------------------------------------------------------
*/