package com.logics.tu;

public class QuickSort {

    int partition(int[] arr, int low, int high) {
	int pivot = arr[high];
	int i = low - 1;
	for (int j = low; j < high; j++) {
	    // If current element is smaller than or
	    // equal to pivot
	    if (arr[j] <= pivot) {
		i++;

		// swap arr[i] and arr[j]
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	    }
	}

	// swap arr[i+1] and arr[high] (or pivot)
	int temp = arr[i + 1];
	arr[i + 1] = arr[high];
	arr[high] = temp;

	return i + 1;

    }

    void sort(int a[], int low, int high) {
	if (low < high) {
	    int pi = partition(a, low, high);
	    sort(a, low, pi - 1);
	    sort(a, pi + 1, high);
	}
    }

    static void printArray(int arr[]) {
	int n = arr.length;
	for (int i = 0; i < n; ++i)
	    System.out.print(arr[i] + " ");
	System.out.println();
    }

    public static void main(String[] args) {
	int arr[] = { 4, 7, 90, 0, 87, 1, 55, 3 };
	QuickSort qs = new QuickSort();
	qs.sort(arr, 0, arr.length - 1);

	System.out.println("sorted array");
	printArray(arr);

    }

}
