package com.logics.tu;

public class BinarySearch {

    static int search(int arr[], int low, int high, int key) {
	int mid = (low + high) / 2;
	while (low <= high) {
	    if (key == arr[mid]) {
		return mid;
	    } else if (key < arr[mid]) {

		high = mid - 1;
	    } else {
		low = mid + 1;
	    }

	    mid = (low + high) / 2;
	}
	return -1;

    }

    public static void main(String[] args) {
	int arr[] = { 10, 20, 30, 40, 50 };
	int key = 41;
	int index = BinarySearch.search(arr, 0, arr.length - 1, key);
	System.out.println(index);
    }

}
