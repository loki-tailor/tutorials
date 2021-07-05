package com.sorting;

public class SortingArrayProgram {
    public static void main(String[] args) {
	int arr[] = { 1, 0, 0, 1, 1, 1, 0, 0, -1, -1, -1 };
	int x = 0, y = 0, z = 0;
	for (int i = 0; i < arr.length; i++) {
	    switch (arr[i]) {
	    case -1: {
		x++;
		break;
	    }

	    case 0: {
		y++;
		break;
	    }
	    case 1: {
		z++;
		break;
	    }

	    }

	}
	int j = 0;

	while (x != 0) {
	    arr[j] = -1;
	    System.out.print(arr[j] + " ");
	    x--;
	    j++;
	}
	while (y != 0) {
	    arr[j] = 0;
	    System.out.print(arr[j] + " ");
	    y--;
	    j++;
	}
	while (z != 0) {
	    arr[j] = 1;
	    System.out.print(arr[j] + " ");
	    z--;
	    j++;
	}

    }

}
