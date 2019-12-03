package com.logics.tu;

public class MissingNumber {

    public static void main(String[] args) {
	int a[] = { -1, 0, 1, 2, 4, 5 };
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
	    sum = a[i] + sum;
	}

	int n = (5 * 6) / 2;
	int missingnumber = n - sum;
	System.out.println(missingnumber);
    }

}
