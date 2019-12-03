package com.logics;

public class SendZeroToEndOfIntegerArr {

    static void print(int a[]) {
	int count_zero = 0;
	for (int i = 0; i < a.length; i++) {

	    if (a[i] != 0) {
		System.out.print(a[i]);
	    } else
		count_zero++;
	}
	while (count_zero > 0) {
	    System.out.print(0);
	    count_zero--;
	}
	System.out.println();
    }

    public static void main(String[] args) {

	int[] input = new int[] { 1, 2, 3, 0, 5, 0, 3 };
	int[] temp = new int[input.length];
	SendZeroToEndOfIntegerArr.print(input);

	int count_zero = 0;

	for (int i = 0; i < input.length; i++) {
	    if (input[i] == 0)

	    {
		count_zero++;
	    }
	}
	int count_of_nonZero = 0;
	for (int j = 0; j < input.length; j++) {

	    if (input[j] != 0) {
		temp[count_of_nonZero] = input[j];
		count_of_nonZero++;
	    }

	}
	for (int z = 0; z < count_zero; z++) {
	    temp[count_of_nonZero] = 0;
	    count_of_nonZero++;
	}
	for (int z = 0; z < input.length; z++) {
	    System.out.print(temp[z]);
	}

    }

}
