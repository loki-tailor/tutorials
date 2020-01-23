package com.logics.app_ocajavatest;

/**
	@created on 22-01-2020
	@author lokeshwar
*/

public class Square {
	public static long square (int x) {
		long y = x * (long) x;
		x = -1;
		return y;		
	} 
	public static void main(String[] args) {
		int value = 9;
		long result = square(value);
		System.out.println(value);
	}
} // end of class