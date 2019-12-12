package com.modifiers;

/**
		@author lokeshwar created @ 12-12-19
		Java program to illustrate strictfp modifier
*/

public class StrictFpDemo {
	
	// calculating large sum using strictfp modifier
	public static strictfp void sum() {
		
		double num1 = 10e+10;
		double num2 = 6e+08;
		double sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
	} // end of method
	
	// calculate large sum without using 
	public static void normalSum() {
		
	} // end of method()
	
	public static void main(String args[]) {
		sum();
	} // end of main()
	
} // end of class