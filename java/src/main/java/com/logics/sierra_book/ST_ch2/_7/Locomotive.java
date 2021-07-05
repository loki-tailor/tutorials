package com.logics.sierra_book.ST_ch2._7;

/*-
	@created 18-07-2020

	What is the result? (choose all that apply)
	v - 2 will be included in the output
		x - 3 will be included in the output
		x - hi will be included in the output
		x - Compilation fails
		x - An exception is thrown at runtime

	"It is legal to overload main(). Since no instance of Locomotive are created, the constructor does not run and the overloaded version of main() does not run."
*/

public class Locomotive {
	Locomotive() { main("hi"); }
	public static void main(String[] args) {
		System.out.print("2 ");
	}
	public static void main(String args) {
		System.out.println("3 " + args);
	}
}
