package com.inheritance.demo4.certification;

/*-
	created @ 29-03-20
	@author lokeshwar

	Demo'ing "Default" access modifier (within same package), from OCAJP Sierra bk (pg. 42)

	No compilation error will come when accessing x, since Parent class is in the same package.
*/

public class Child extends Parent {

	static public void main(String[] args) {
		Child sc = new Child();
		sc.testIt();
	} // end of main

	public void testIt() {
		System.out.println("Variable x is " + x);
	} // end of method

} // end of class

