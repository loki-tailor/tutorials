package com.imports;

public class AmbiguousImportsDemo {
	public static void main(String[] args) {
	
		/*-
		com/imports/AmbiguousImportsDemo.java:14: error: reference to MAX_VALUE is ambiguous
		System.out.println("MAX_VALUE = " + MAX_VALUE);
		                                    ^
		both variable MAX_VALUE in Integer and variable MAX_VALUE in Long match
		1 error
		*/
		//compile error, since ambiguous imports for MAX_VALUE
		// System.out.println("MAX_VALUE = " + MAX_VALUE);
	}
}
