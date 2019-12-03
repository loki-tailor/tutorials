package com.sorting;

public class TU_SelectionSort {

    public static void main(String[] args) {
	int[] a = new int[] { 1, 3, 5, 6, 7, 1, 2, 9, 99, 0, 4 };

	for (int i = 0; i < a.length - 1; i++) {
	    int min_index = i;
	    for (int j = i + 1; j < a.length; j++) {
		if (a[min_index] > a[j]) {
		    min_index = j;

		}

	    }
	    int temp = a[min_index];
	    a[min_index] = a[i];
	    a[i] = temp;

	}

	for (int k = 0; k < a.length; k++) {
	    System.out.print(a[k] + " ");
	}

    }

}
