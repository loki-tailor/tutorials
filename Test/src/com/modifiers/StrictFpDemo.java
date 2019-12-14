package com.modifiers;

/**
		@author lokeshwar created @ 12-12-19
		Java program to illustrate strictfp modifier
		TODO: Understand the behavioural difference between using strictfp and not using it.
*/

public class StrictFpDemo {
	
	// calculating large sum using strictfp modifier
	public static strictfp void sum() {
		
		double num1 = 10e+10;
		double num2 = 6e+08;
		double sum = num1 + num2;
		System.out.println("strictfp sum: " + num1 + " + " + num2 + " = " + sum);
		
	} 
	
	// calculate large sum without using 
	public static void normalSum() {
		double num1 = 10e+10;
		double num2 = 6e+08;
		double sum = num1 + num2;		
		System.out.println("normal sum: " + num1 + " + " + num2 + " = " + sum);
	} 


	// strictfp not allowed on abstract methods	
	// error: illegal combination of modifiers: abstract and strictfp
	// strictfp abstract void add(double num1, double num2);

	// strictfp not allowed on variables
	// error: modifier strictfp not allowed here
	// strictfp String name = "Lokeshwar";

	// strictfp not allowed on Constructors
	// error: modifier abstract not allowed here
	// public abstract StrictFpDemo() {}
	
	public static void main(String args[]) {
		sum();
		normalSum();
	} // end of main()
	
} // end of class

interface StrictFpInterface {
	void add();

	// strictfp is not allowed in interface methods or initialized variable (ref below)
	// compile error: modifier strictfp not allowed here
	// strictfp int subtract();
	// strictfp int var2 = -1;
	
	// compile time error: = expected
	// strictfp int var;
}
