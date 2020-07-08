package com.functional_interfaces;

/**
	created @ 24-01-2020
	@author lokeshwar
*/

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {
		// create a list of strings
		List<String> names = Arrays.asList("lokeshwar","tailor","loki","thor","mumbai");
		
		// declare the predicate type as string and use
		// lambda expressing to create object
		Predicate<String> p = (s) -> s.startsWith("l"); 
		
		// iterate  thru the list
		for (String str : names) {
			if(p.test(str)) {
				System.out.println(str);
			}
		}
	}
} // end of class