package com.variables;

/*-
	created @ 31-03-20
	@author lokeshwar
*/

public class FinalVariables {

	public FinalVariables() {
		System.out.println("Inside default constructor");
		System.out.println("Value of final variable color = " + color);
	}

	final String color = "diamond";

	public static void main(String[] args) {
		FinalVariables fv = new FinalVariables();
	}

} // end of class
