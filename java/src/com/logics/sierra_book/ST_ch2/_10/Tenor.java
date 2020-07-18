package com.logics.sierra_book.ST_ch2._10;

/*-
	@created 18-07-2020

	What is the result?
		x - fa fa
	v - fa la
		x - la la
		x - Compilation fails
		x - An exception si thrown at runtime

	"The code is correct, but polymorphism doesn't apply to static methods"
*/

public class Tenor extends Singer {
	public static String sing() { return "fa"; }
	public static void main(String[] args) {
		Tenor t = new Tenor();
		Singer s = new Tenor();
		System.out.println(t.sing() + " " + s.sing());
	}
}

class Singer { public static String sing() { return "la"; } }
