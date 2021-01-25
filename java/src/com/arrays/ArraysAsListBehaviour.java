package com.arrays;

import java.util.List;
import java.util.Arrays;

/**
	@created on 22-01-2020
	@author lokeshwar

	Demonstration of how 'Arrays.asList([])' creates only a mere list-representation 
	of the passed Array.

	However, changes the the returned list in above, would have impact on the original array as well
*/

public class ArraysAsListBehaviour {
	public static void main (String[] args) {

		String[] names = {"Tom","Dick","Harry"};
		System.out.println("names[] = " + Arrays.toString(names)); 

		List<String> list = Arrays.asList(names); // names.asList();
		System.out.println("list (of names[]) = " + list + "\n");

		list.set(0,"Sue");
		System.out.println("names[] after modification in list = " + Arrays.toString(names)); 
		System.out.println("list (of names[]) after modification = " + list + "\n");

		System.out.println("identityHashCode of list = " + System.identityHashCode(list));
		System.out.println("identityHashCode of names = " + System.identityHashCode(names));
	}
} // end of class