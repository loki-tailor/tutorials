package com.lambda_expressions;

/**
	created @ 25-01-2020
	@author lokeshwar

	Demonstrats lambda expressions using two arguments
*/

public class Demo3 {
	
	// operation is implemented using lambda expression
	interface FuncInter1 {
		int operation(int a, int b);
	}

	interface FuncInter2 {
		void sayMessage(String message);
	}

	// Performs FuncInter1's operation on 'a' and 'b'
	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a,b);
	}

	public static void main(String[] args) {
		
		// lambda expression for addition for two parameters 
        	// data type for x and y is optional. 
        	// This expression implements 'FuncInter1' interface
		FuncInter1 add = (int x, int y) -> x + y;

		// lambda expression multiplication for two parameters.
		// This expression also implements 'FuncInter'1 interface
		FuncInter1 multiply = (x,y) -> x * y;

		// Creating an object of Demo3 to call operate using
		// different implementation using lambda expressions
		Demo3 obj = new Demo3();

		// add 2 nos. using lambda expression
		System.out.println("Addition is " + obj.operate(6,3,add));

		// multily 2 nos. using lambda expression
		System.out.println("Multiplication is " + obj.operate(6,3,multiply));

		// lambda expression for single parameter.
		// This expression implements 'FuncInter2' interface
		FuncInter2 fobj = message -> System.out.println("Hello " + message);
	}

	
} // end of class