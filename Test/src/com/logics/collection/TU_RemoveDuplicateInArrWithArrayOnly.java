package com.logics.collection;

public class TU_RemoveDuplicateInArrWithArrayOnly {

    static int removeduplicate(int[] arr) {

	int j = 0;
	for (int i = 0; i < arr.length - 1; i++) {
	    if (arr[i] != arr[i + 1]) {
		arr[j] = arr[i];
		j++;
	    }
	}
	arr[j++] = arr[arr.length - 1];
	return j;
    }

    public static void main(String[] args) {
	int[] a = new int[] { 1, 1, 3, 4, 4, 5, 6, 6, 6 };

	int j = TU_RemoveDuplicateInArrWithArrayOnly.removeduplicate(a);
	for (int i = 0; i < j; i++) {
	    System.out.print(a[i] + " ");
	}

    }

}
