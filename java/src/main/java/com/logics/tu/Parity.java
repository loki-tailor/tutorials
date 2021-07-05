package com.logics.tu;

public class Parity {

    public static void main(String[] args) {

	int input[] = { 7, 3, 11, 33, 55, 31, 8, 40 };
	int new_arr[] = new int[input.length];
	int left = 0, right = input.length - 1;

	while (left < right) {
	    while (input[left] % 2 == 0 && left < right) {
		left++;
	    }
	    while (input[right] % 2 != 0 && left < right) {
		right--;
	    }
	    if (left < right) {
		int temp = input[left];
		input[left] = input[right];
		input[right] = temp;
		left++;
		right--;

	    }
	}
	for (int i = 0; i < input.length; i++) {
	    System.out.print(input[i] + " ");

	}

    }
}
