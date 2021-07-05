package com.logics.t1;

public class _05_Test {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 0 };
		for (int i : arr) {
			System.out.println(arr[i]);
		}
	}
}

/***
 * 
 * Explanation Inside enhanced for loop, System.out.println(arr[i]); is used
 * instead of System.out.println(i);
 * 
 * When loop executes 1st time, i stores the first array element, which is 2 but
 * System.out.println statement prints arr[2] which is 0. Loop executes in this
 * manner and prints 0 1 2 on to the console.
 * 
 */
