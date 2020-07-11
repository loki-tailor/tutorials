package com.hiding;

/*-
	@created 11-07-20

	ref: https://www.baeldung.com/java-variable-method-hiding
*/

public class VariableHiding {
	private String message = "this is instance variable";

	public VariableHiding() {
		String message = "this is Constructor variable";
		System.out.println(message);
	}

	public void printLocalVariable() {
		String message = "this is method local variable";
		System.out.println(message);
	}	

	public void printInstanceVariable() {
		String message = "this is method local variable 2";
		System.out.println(this.message);
	}

	public static void main(String[] args) {
		VariableHiding vh = new VariableHiding();
		vh.printLocalVariable();
		vh.printInstanceVariable();
	}
}
