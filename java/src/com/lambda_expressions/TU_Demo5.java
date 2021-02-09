package com.lambda_expressions;

/**
	created @ 25-01-2020
	@author lokeshwar
*/

interface Climb {
	boolean isTooHigh (int height, int limit);
}

public class Demo5 {
	public static void main(String[] args) {
		//check((h,l) -> h.append(l).isEmpty(),5); // invalid

		check((h,l) -> h > l,15); // valid
	}
	
	private static void check(Climb climb, int height) {
		if(climb.isTooHigh(height,10)) 
			System.out.println("too high");
		else
			System.out.println("ok");
	}
}
