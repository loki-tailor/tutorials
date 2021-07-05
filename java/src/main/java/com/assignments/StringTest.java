package com.assignments;

/*
	@created 03-08-2020

	-------------------------------
	output:
	y string = Java
	y string = Java
	-------------------------------
*/

public class StringTest {
	public static void main(String[] args) {
		String x = "Java";
		String y = x;
		System.out.println("y string = " + y);
		x = x + " Bean";
		System.out.println("y string = " + y);
	}
}