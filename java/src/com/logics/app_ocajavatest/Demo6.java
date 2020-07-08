package com.logics.app_ocajavatest;

/**
	created @ 25-01-2020
	@author lokeshwar

	Demonstration of autoboxing, lambda expressions
*/

import java.util.List;
import java.util.ArrayList;

public class Demo6 {
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5")); // autoboxing, because parseInt() returns 'int'
		ages.add(Integer.valueOf("6")); // no autoboxing, because valueOf() returns 'Integer'
		ages.add(7); // autoboxing, int -> Integer
		ages.add(null); // NullPointerException while accessing this
		
		// exception will still not be printed when using foreach
		ages.forEach(n -> { 
			try { System.out.println(n); } 
			catch(Exception e) { e.printStackTrace(); } 
		}); 

		System.out.println();

		for(int age : ages) System.out.print(age + " "); // throws exception
		
	}
}