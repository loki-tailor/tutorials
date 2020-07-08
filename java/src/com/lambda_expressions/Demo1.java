package com.lambda_expressions;

/**
	created @ 25-01-2020
	@author lokeshwar

	Demonstrates lambda expressions to implement user defined functional interface

	Syntax: lambda operator / argument list -> body [of lambda expression]
*/

// functional interface [with only 1 abstract method]
interface FuncInterface {
	// abstract function
	void abstractFunc(int x);
	
	// non-abstract (default) function
	default void normalFunc() {
		System.out.println("Hello from default func inside interface");
	}
}

class Demo1 {
	public static void main(String[] args) {
		// lambda expression to implement above 
        	// functional interface. This interface 
        	// by default implements abstractFun()		
		FuncInterface fobj = (int x) -> System.out.println(2*x);
		
		// call above lambda expression
		fobj.abstractFunc(5);

		// call default func
		fobj.normalFunc();
	}
}

