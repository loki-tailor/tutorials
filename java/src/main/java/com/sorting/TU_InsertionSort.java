package com.sorting;

public class TU_InsertionSort {

    public static void main(String[] args) {
	int[] a = new int[] { 1, 3, 5, 6, 7, 1, 2, 9, 99, 0, 4 };

	for (int i = 1; i < a.length; i++) {
	    int key = a[i];
	    int j = i - 1;
	    while (j >= 0 && a[j] > key) {
		a[j + 1] = a[j];
		j--;
	    }
	    a[j + 1] = key;

	}

	for (int i : a) {
	    System.out.print(i + " ");
	}

    }

}
