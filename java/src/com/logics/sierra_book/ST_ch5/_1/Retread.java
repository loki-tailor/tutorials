package com.logics.sierra_book.ST_ch5._1;

/*- @created 10-11-2020

	Note:	An overriding method cannot throw checked exceptions that are broader than
			those thrown by overidden method. However, an overriding method can throw 
			RuntimeException not thrown by the overidden method. 
*/

class MyException extends Exception {}
class Tire {
	void doStuff() {}
}

public class Retread extends Tire {
	public static void main(String[] args) {
		new Retread().doStuff();
	}

	// Option 1: no failures at compile time, but runtime failure
	// Runtime Exception as - Exception in thread "main" java.lang.ArithmeticException: / by zero
	// void doStuff() { System.out.println(7/0); }

	// Option 2: 
	// Compile time error:  overridden method does not throw MyException
	// void doStuff() throws MyException { System.out.println(7/0); }

	// Option 3: no compile time exception
	// Runtime Exception as - Exception in thread "main" java.lang.ArithmeticException: / by zero
	// void doStuff() throws RuntimeException { System.out.println(7/0); }

	// Option 4: no compile time error 
	// Runtime Exception as - Exception in thread "main" java.lang.ArithmeticException: / by zero
	// ArithmeticException is a subclass of RuntimeException (i.e. ArithmeticException extends RuntimeException)
	// void doStuff() throws ArithmeticException { System.out.println(7/0); }
}