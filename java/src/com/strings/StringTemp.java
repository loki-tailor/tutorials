package com.strings;

import java.util.List;
import java.util.Arrays;

/**
	@created on 22-01-2020
	@author lokeshwar
*/

public class StringTemp {
	public static void main (String[] args) {

		String[] names = {"Tom","Dick","Harry"};
		List<String> list = Arrays.asList(names); // names.asList();
		list.set(0,"Sue");
		System.out.println(names[0]);
		System.out.println("identityHashCode of list = " + System.identityHashCode(list));
		System.out.println("identityHashCode of names = " + System.identityHashCode(names));
	}
} // end of class