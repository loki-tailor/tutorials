package com.exceptions_and_errors;

/*- @created 10-11-2020

	Note:	An overriding method cannot throw checked exceptions that are broader than
			those thrown by overidden method. However, an overriding method can throw 
			RuntimeException not thrown by the overidden method. 

			i.e. Sub-classes can be thrown, but not super-classes
*/

class Exception1 extends Exception {}
class Exception2 extends Exception1 {}
class Exception3 extends Exception2 {}

class A {
	void see() throws Exception2 {}
}

public class BroaderExceptionsDemo extends A {
	public static void main(String[] args) throws Exception2  {
		new BroaderExceptionsDemo().see();
	}

	void see() throws Exception2 {
		System.out.println("inside see()");
	}
}