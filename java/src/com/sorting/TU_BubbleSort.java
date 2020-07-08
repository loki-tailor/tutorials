package com.sorting;

public class TU_BubbleSort {
    public static void main(String[] args) {
	int[] a = new int[] { 1, 2, 3, 4, 12, 6, 7, 8, 9, 10, 11, 5 };

	for (int i = 0; i < a.length - 1; i++) {
	    for (int j = 0; j < a.length - i - 1; j++) {
		if (a[j] > a[j + 1]) {
		    int temp = a[j + 1];
		    a[j + 1] = a[j];
		    a[j] = temp;
		}
	    }
	}

	for (int i : a) {
	    System.out.print(i + " ");
	}

    }

}
