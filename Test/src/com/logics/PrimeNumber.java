package com.logics;

public class PrimeNumber {
    public static void main(String[] args) {

	int num = 2;
	boolean isPrime = false;

	if (num == 1) {
	    isPrime = false;

	} else if (num == 2) {
	    isPrime = true;

	} else {
	    for (int i = 2; i <= num / 2; i++) {
		if (num % i == 0) {
		    isPrime = false;
		    break;
		}
	    }
	}
	if (isPrime)
	    System.out.println("Prime");
	else
	    System.out.println("Not prime");

    }
}
