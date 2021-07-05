package com.generics;

import java.util.List;
import java.util.ArrayList;

public class GWildMethodPassing {


	// #################################################################################
	public static void main(String... args) {

		List<String> keywords = new ArrayList<>();
		keywords.add("java #11"); 
		keywords.add("lokeshwar");

		printList(keywords); System.out.println();
		p5(keywords); System.out.println();

		// #################################################################################
		List<?> list = new ArrayList<>(); // immutable List<Objects> is stored
		var list2 = new ArrayList<>(); // mutable ArrayList<Objects> is stored

		// #################################################################################
		List<Integer> lint_lg = new ArrayList<>();
		lint_lg.add(10);
		// List<Object> lobj_lint = lint_lg; // error : as Object is not a subclass of Integer
		
		// #################################################################################
		List<Integer> l4 = new ArrayList<>();
		l4.add(100);
		List<? extends Object> lo1 = l4;
		// lo1.add(10.3); // error
		// lo1.add(1); // error
		// lo1.add("a"); // error
	

		System.out.println("execution completed");
	}

	// #################################################################################	
	private static void printList(List<String> l) {
		for(String s : l) {
			System.out.println(s);
		}
	}

	// #################################################################################	
	// if we keep methodname same as printList to make it overloaded
	// then we get below compile error
	// .\com\generics\GWildMethodPassing.java:33: error: name clash: printList(List<? extends Object>) and printList(List<String>) have the same erasure

	private static void p5(List<? extends Object> l) {
		for(Object s : l) { // this line will give compile error
			System.out.println(s);
		}
	}

	// #################################################################################	
	// in below example, the accepting of argument is valid, 
	// but, then iterating through loop, since the arg is having a wildcard '?'
	// it is not certain what will it's type be, hence storing it in 'String' will cause compile erro
	/*-
	private static void p4(List<? extends Object> l) {
		for(String s : l) { // this line will give compile error
			System.out.println(s);
		}
	} */

	// #################################################################################	
	// below will also give compile error, as we are not specifying what type would be for the list
	/*-
	private static void p3(List<> l) {
		for(String s : l) {
			System.out.println(s);
		}
	} */
	

	// #################################################################################
	// error, as String can't be converted to Object or rather Object is not a subclasss of String
	// if the caller had declared the list as 'Object' type, then below would complie (except the loop type)
	/*-
	private static void p2(List<Object> l) { 
		for(String s : l) {
			System.out.println(s);
		}
	}
	*/
	
	// #################################################################################

}