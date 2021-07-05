package com.logics.tu;

public class ArrayCopy {

    static void copy(int[] a1, int[] a2) {

	int i = 0, j = 0, k = 0;
	while (i < a1.length && j < a2.length) {
	    if (a1[i] < a2[j]) {
		System.out.println(a1[i++]);
		k++;
	    }

	    else if (a2[j] < a1[i]) {
		System.out.println(a2[j++]);
		k++;
	    }
	    // skip the common elements
	    else {
		i++;
		j++;
	    }
	}
	while (i < a1.length) {
	    System.out.println(a1[i]);
	    i++;
	    k++;
	}
	while (j < a2.length) {
	    System.out.println(a2[j]);
	    j++;
	    k++;
	}
    }

    static void printArray(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
    }

    public static void main(String[] args) {
	int a1[] = { 2, 4, 6, 7, 8 };
	int a2[] = { 1, 2, 6, 9, 11 };
	// int arr[] = new int[a1.length+a2.length];
	ArrayCopy.copy(a1, a2);

	// ArrayCopy.printArray(arr);
    }

}
