package com.lambda_expressions;

/**
	created @ 25-01-2020
	@author lokeshwar

	Print elements of arraylist using lambda expressions &
	Print even numbers from an arraylist using lambda expressions

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,6,5,4,3,6,10));

		System.out.println("Printing using lambda expressions");
		list.forEach(n -> System.out.print(n + " "));

		System.out.println("\nPrinting odd numbers using lambda expression");
		list.forEach(n -> { 
			if(n%2==0) 
				System.out.print(n + " ");
			} 
		);
	}
}

/*- OUTPUT:

Printing using lambda expressions
1 2 4 6 5 4 3 6 10
Printing odd numbers using lambda expression
2 4 6 4 6 10

*/

