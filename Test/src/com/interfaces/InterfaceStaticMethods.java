package com.interfaces;

/**
	created @ 28-01-2020
	@author lokeshwar

	Topic: static interface methods
	* static interface methods are declared by using the static keyword
	* static interface methods cannot be marked as private, protected, final, or abstract.
	* static interface methods must have a concrete method body
	* When invocking a static interface method, the method's type (interface name) MUST be included in the invocation. 
*/

interface StaticIface {
	static int m1() { return 42; } 	// legal
	public static void m2() { ; } 	// legal
	//final static void m3() { ; } 	// illegal: final not allowed
	//abstract static void m4() { ; }	// illegal: abstract not allowed (illegal combination of static and abstract) & error: interface abstract methods cannot have body
	//static void m5();		// illegal: needs a method body ( error: missing method body, or declare abstract)
}

public class InterfaceStaticMethods implements StaticIface {
	public static void main(String[] args) {
		System.out.println(StaticIface.m1()); // legal, m1()'s type must be included
		
		new InterfaceStaticMethods().go();

		//System.out.println(m1()); // illegal: reference to interface is required
	}
	void go() { 
		System.out.println(StaticIface.m1()); // also legal from an instance  
	}
}




