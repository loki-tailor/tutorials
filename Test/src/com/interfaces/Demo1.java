package com.interfaces;

/**

	created @ 28-01-2020
	@author lokeshwar

	Demonstrates valid ways of declaring a variable inside a interface

	by default all variables are PUBLIC STATIC FINAL in an INTERFACE
*/

interface Interface1 {
	public int x1 = 1; 
	int x2 = 1; 
	static int x3 = 1; 
	final int x4 = 1;
	public static int x5 = 1;
	public final int x6 = 1;
	static final int x7 = 1;
	public static final int x8 = 1;
}

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Inside - " + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}