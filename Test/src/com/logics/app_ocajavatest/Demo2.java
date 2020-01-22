package com.logics.app_ocajavatest;

/**
	created @ 23-01-2020
	@author lokeshwar
*/

public class Demo2 {
	public static void main(String[] args) {
		boolean keepGoing = true;
		int result = 15, i = 10;
		do {
			i--;
			if(i==8) keepGoing = false;
			result -= 2;
		} while(keepGoing);
		System.out.println(result);
	}
}