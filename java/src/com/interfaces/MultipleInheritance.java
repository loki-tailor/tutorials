package com.interfaces;

/*-
	@author lokeshwar @created 11-07-2020

	------------------------------------------------------------

	* 'A' implements both 'C' & 'D'

	------------------------------------------------------------

	* case 1 (compile error): 
		- 'C' & 'D' has 'default void m1() {..}'
		- during 'A' class declaration, compile error: class A inherits unrelated defaults for m1() from types C and D

	------------------------------------------------------------

	* case 2 (no errors):
		- 'C' has 'default void m1() {..}'
		- 'D' has 'void m1();'
		- 'A' has 'public void m1() {..}'
		- output :- 'A.m1()'

	------------------------------------------------------------

	* case 3 (no errors):
		- 'C' has 'default void m1() {..}'

			a. 'D' has 'static void m1();'
			-  'A' has 'public void m1() {..}'
			- on 'D', compiler error as: missing method body, or declare abstract

			b. 'D' has 'static void m1() {..}'
			- 'A' has 'public void m1() {...}'
			- output :- 'A.m1()'

			c. 'D' has 'static void m1() {..}'
			- 'A' is EMPTY
			- output :- 'C.m1()'

			d. 'D' has 'static void m1() {..}'
			- 'A' is EMPTY
			- Main has 'D da = new A(); da.m1();'
			- compile error: illegal static interface method call ... the receiver expression should be replaced with the type qualifier 'D'

			e. 'D' has 'static void m1() {..}'
			- 'A' is EMPTY
			- Main has 'D.m1();'
			- output :- 'D.m1();

	------------------------------------------------------------
*/

interface C {
	// default void m1() { System.out.println("C.m1()"); }
	static void m1() { System.out.println("C.m1()"); }
}

interface D {
	// static void m1() { System.out.println("D.m1()"); }
	default void m1() { System.out.println("D.m1()"); }
}

class A implements C, D {
	//public void m1() { System.out.println("A.m1()"); }
}

interface E extends C, D {
	// If m1 is 'default' in 'D', then compile error: m1() in E clashes with m1() in D
	// static void m1() { System.out.println("E.m1()"); }
	default void m2() { System.out.println("E.m2()"); }
}

public class MultipleInheritance {
	public static void main(String[] args) {

		A a = new A();
		// a.m1();

		// D da = a;
		// da.m1();

		// D.m1();

		System.out.println("done");
	}
}
