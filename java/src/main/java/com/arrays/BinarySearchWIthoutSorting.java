package com.arrays;

/**
	created @ 25-01-2020
	@author lokeshwar

	Arrays.binarySearch(arr,var) requires sorting before searching
	It's results in 2 (the actual index), however,
	it's said that the results are undefined. 
*/

import java.util.Arrays;

public class BinarySearchWIthoutSorting {
	public static void main(String[] args) {
		int[] random  = {6,-4,12,0,-10};
		int x = 12;
		int y = Arrays.binarySearch(random,x);
		System.out.println(y);
	}
}