package com.functional_interfaces;

/**
	created @ 24-01-2020
	@author lokeshwar

	Demonstration of user defined functional interface
*/


//@FunctionalInterface
interface Square {
	int calculate(int x);
	// void display(); this line won't give error, but due to this line, Square will no longer be a functional interface, provided above one is uncommented.
}


public class Demo2 {
	public static void main(String[] args) {
		int a = 5;
		
		// lambda expression to define the calculate method;
		Square s = (int x) -> x*x;

		// parameter passed and return type must be same
		// as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}
} // end of class

