package com.logics;

import java.util.Scanner;

public class TU_Pattern1 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	for (int t = 1; t <= T; t++) {
	    int N = in.nextInt();

	    char ch = 'A';
	    for (int i = 1; i <= N; i++) {

		if (i == 1)
		    for (ch = 'A'; ch < 'A' + N; ch++) {
			System.out.print(ch);
		    }
		else if (i != 1 && i < N) {
		    for (int j = 1; j <= N; j++) {
			if (j == 1 || j == N) {
			    System.out.print(ch);
			    ch++;
			} else
			    System.out.print("$");
		    }
		} else {
		    for (int k = 1; k <= N; k++) {
			System.out.print(ch);
			ch++;
		    }
		}
		System.out.println("\n");

	    }

	}
    }

}
