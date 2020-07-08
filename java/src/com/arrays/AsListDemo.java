package com.arrays;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
	@created on 22-01-2020
	@author lokeshwar
*/

public class AsListDemo {
	public static void main (String[] args) {
		String[] arr = {"Tom", "Dick", "Harry"};
		System.out.println("arr = " + arr);
		System.out.println("Arrays.asList(arr) = " + Arrays.asList(arr));

		// changes made to list1 will also get modified in arr[]
		List<String> list1 = Arrays.asList(arr); 
		System.out.println("list1 = " + list1);
		list1.set(0,"loki");

		// this line will give error, since list1 indirectly has a bridge to arr[]
		// java.lang.UnsupportedOperationException will come
		//list1.add("tailor"); 

		System.out.println("list1 = " + list1);
		System.out.println("Arrays.asList(arr) = " + Arrays.asList(arr));

		// changes made to list2 will not be reflected in arr[]
		List<String> list2 = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("list2 = " + list2);
		list2.set(0,"loki2");
		list2.add("tailor");
		System.out.println("list2 = " + list2);
		System.out.println("Arrays.asList(arr) = " + Arrays.asList(arr));
	} // end of main
} // end of class