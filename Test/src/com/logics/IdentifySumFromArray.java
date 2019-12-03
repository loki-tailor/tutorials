package com.logics;

import java.util.Arrays;

public class IdentifySumFromArray {

    /*-
     * 	Problem Statement: Given array and a number, find values from the array such that it adds up to the number.
     * 	e.g. [1, 2, 3, 9] , sum = 8
     * 	e.g. [1, 2, 4, 4] , sum = 8
     * 
     * logic_1 = self_array iteration > comparison pair summation and break loop if equals as expected
     * 
     * logic_2 = quadratic
     * 
     * logic_3 = binary_search, taking 1 number as base, such that their summation is 8 (log algorithm, better than quadratic) - 
     * 		 BUT ABOVE IN A SORTED LIST
     * 		 Binary Search > being uni-directionals > nlogn solution
     * 
     * logic_4 = moving from both the extreme ends towards the center
     * 		 if summation is higher then 8, reduce a number index from right
     * 		 if summation is lower than 8, increase a number towards right
     * 		 bi-directional, hence faster
     * 		 PROVIDED - SORTING IS DONE, if sorting is required, the it would be nlogn solution (i.e. same as logic_3)
     * 
     */

    public static void main(String args[]) {

	int a[] = new int[] { 1, 2, 3, 9 };
	int b[] = new int[] { 1, 2, 4, 4 };
	int sum = 8;

	long start = System.nanoTime();
	logic_4(a, sum);
	logic_4(b, sum);
	long end = System.nanoTime();

	System.out.println("Total time = " + (end - start));

    }

    private static void logic_4(int[] arr, int sum) {
	boolean hasPairWithSum = false;
	for (int i = 0, j = arr.length - 1;;) {
	    if (i < j) {
		break;
	    }
	    int tmpSum = arr[i] + arr[j];
	    if (tmpSum == sum) {
		hasPairWithSum = true;
		break;
	    } else if (tmpSum < sum) {
		i++;
		continue;
	    } else if (tmpSum > sum) {
		j--;
	    }
	}
	System.out.println(hasPairWithSum);
    }

    private static void logic_1(int arr[], int sum) {
	boolean pass = false;
	for (int i = 0; i < arr.length; i++) {

	    for (int j = i + 1; j < arr.length; j++) {
		if (arr[i] + arr[j] == sum) {
		    System.out.println(arr[i] + " + " + arr[j] + " = " + sum + ", from array - " + Arrays.toString(arr));
		    pass = true;
		    break;
		}
	    }
	}
	if (!pass) {
	    System.out.println("No summation pair found in array - " + Arrays.toString(arr));
	}
    }
}
