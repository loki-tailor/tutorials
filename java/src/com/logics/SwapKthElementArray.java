package com.logics;

import java.util.Scanner;

public class SwapKthElementArray {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	while (T > 0) {
	    int N = sc.nextInt();
	    int k = sc.nextInt();
	    int input[] = new int[N];
	    for (int i = 0; i < N; i++) {
		input[i] = sc.nextInt();
	    }

	    int temp = 0;
	    temp = input[k - 1];
	    input[k - 1] = input[N - k];
	    input[N - k] = temp;
	    for (int j = 0; j < N; j++) {
		System.out.print(input[j] + " ");
	    }

	    T--;
	}
    }

}
