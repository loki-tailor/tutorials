package com.sorting;

public class TU_Sort012 {

    static int[] sortArray(int a[], int size) {
	int low = 0;
	int mid = 0, high = size - 1, temp = 0;
	while (mid < high) {
	    switch (a[mid]) {
	    case 0: {
		temp = a[low];
		a[low] = a[mid];
		a[mid] = temp;
		low++;
		mid++;
		break;

	    }
	    case 1: {
		mid++;
		break;
	    }
	    case 2: {
		temp = a[high];
		a[high] = a[mid];
		a[mid] = temp;
		high--;
	    }
	    }

	}

	return a;

    }

    static void printArray(int a[]) {
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
    }

    public static void main(String[] args) {
	int a[] = { 1, 0, 1, 2, 0, 2, 1, 0 };
	int temp[] = TU_Sort012.sortArray(a, a.length);
	TU_Sort012.printArray(temp);

    }

}
