package com.constructors;

import java.io.FileNotFoundException;

/*- 
	@author lokeshwar @created 15-07-20

	OUTPUT :- 

	-----------------------------------------------------------
	Inside abstract class A's - (int) constructor
	Inside abstract class A's - () constructor
	Inside overridden method B.dis()
	Inside abstract class B's - (string) constructor
	Inside abstract class B's - () constructor
	-----------------------------------------------------------
*/

import java.io.IOException;

abstract class A {
	A() { this(1); System.out.println("Inside abstract class A's - () constructor"); try { dis(); } catch(Exception e) {} }
	A(int i) { System.out.println("Inside abstract class A's - (int) constructor"); }
	
	abstract protected void dis() throws IOException;
}

class B extends A {
	B() { this("1"); System.out.println("Inside abstract class B's - () constructor"); }
	B(String j) { System.out.println("Inside abstract class B's - (string) constructor"); }
	public void dis() throws FileNotFoundException { System.out.println("Inside overridden method B.dis()"); }
}

public class AbstractClassConstructor {
	public static void main(String[] args) {
		new B();
	}
}
