package com.collections;

import java.util.Arrays;

/**
	created @ 22-01-2020
	@author lokeshwar
*/

import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {
	public static void main(String[] args) {
		List<String> hex = Arrays.asList("30","8","3A","FF");
		System.out.println("before sorting - " + hex);
		Collections.sort(hex);
		System.out.println("after sorting  - " + hex);
		int x = Collections.binarySearch(hex,"8");
		int y = Collections.binarySearch(hex,"3A");
		int z = Collections.binarySearch(hex,"4F");
		System.out.println(x + " " + y + " " + z);
	}
}