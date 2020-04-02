package com.variables;

/*-
	created @ 31-03-20
	@author lokeshwar
*/

public class Shadowing {
	int count = 9;

	public void logIn() { 
		int count = 10;
		System.out.println("local variable count is " + count);
	}

	public void count() { System.out.println("instance variable count is " + count); }

	public void count(int count) {
		count = count;
	}

	public static void main(String[] args) {
		Shadowing s = new Shadowing();
		s.logIn();
		s.count(20);		
		s.count();
	}
} // end of class
