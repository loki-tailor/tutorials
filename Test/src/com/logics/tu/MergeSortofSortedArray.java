package com.logics.tu;

public class MergeSortofSortedArray {

    private static int[] mergeArray(int[] a1, int[] a2) {

	int arr[] = new int[a1.length + a2.length];
	int i = 0, j = 0, k = 0;
	while (i < a1.length && j < a2.length) {
	    if (a1[i] < a2[j])
		arr[k++] = a1[i++];
	    else
		arr[k++] = a2[j++];

	}
	while (i < a1.length) {
	    arr[k++] = a1[i++];
	}
	while (j < a2.length) {
	    arr[k++] = a2[j++];
	}
	return arr;

    }

    static void printArray(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
    }

    public static void main(String[] args) {
	int a1[] = { 10, 20, 34, 37, 89 };
	int a2[] = { 1, 2, 6, 9, 11, 90 };
	int arr[] = new int[a1.length + a2.length];
	arr = MergeSortofSortedArray.mergeArray(a1, a2);
	MergeSortofSortedArray.printArray(arr);
    }

}
