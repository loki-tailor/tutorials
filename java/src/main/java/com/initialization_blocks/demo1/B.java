package com.initialization_blocks.demo1;

/*-
	@created 14-07-20

	-----------------------------------------------------

	SEQUENCE of execution when initialization blocks exists:

	* init blocks execute in the order in which they appear
	* Static init blocks run once, when the class is first loaded
	* Instance init blocks run everytime a class instance is created
	* Instance init blocks run after the constructor's call to super().

	-----------------------------------------------------

	NOTES:

	* Instance init blocks are often used as a place to put code that all the constructors in a class should share.
	* If there's a mistake in the init block, the JVM can throw an ExceptionInInitializerError.

	-----------------------------------------------------

	OUTPUT :- 

	A : 1st static initialization block
	A : 2nd static initialization block
	B : 1st static initialization block
	B : 2nd static initialization block
	A : 1st instance initialization block
	A : 2nd instance initialization block
	A : no-arg constructor
	B : 1st instance initialization block
	B : 2nd instance initialization block
	B : no-arg constructor

	A : 1st instance initialization block
	A : 2nd instance initialization block
	A : no-arg constructor
	B : 1st instance initialization block
	B : 2nd instance initialization block
	B : 1-arg constructor
	-----------------------------------------------------
*/


class A {
	A(int i) { System.out.println("A : 1-arg constructor"); }
	A() { System.out.println("A : no-arg constructor"); }
	static { System.out.println("A : 1st static initialization block"); }
	{ System.out.println("A : 1st instance initialization block"); }
	{ System.out.println("A : 2nd instance initialization block"); }
	static { System.out.println("A : 2nd static initialization block"); }

}

public class B extends A{

	B(int i) { System.out.println("B : 1-arg constructor"); }
	B() { System.out.println("B : no-arg constructor"); }
	static { System.out.println("B : 1st static initialization block"); }
	{ System.out.println("B : 1st instance initialization block"); }
	{ System.out.println("B : 2nd instance initialization block"); }
	static { System.out.println("B : 2nd static initialization block"); }

	public static void main(String[] args) {
		new B(); 
		System.out.println();
		new B(1);
	}
}
