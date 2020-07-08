package com.logics;

public class MultiplicationOfDigits {

    public static void main(String[] args) {
	int num = 136;
	int r = 0;
	int p = 1;

	while (num > 0) {
	    r = num % 10;
	    p = p * r;
	    num = num / 10;
	}

	System.out.println(p);
    }

}
