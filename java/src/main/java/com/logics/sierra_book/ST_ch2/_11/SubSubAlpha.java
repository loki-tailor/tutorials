package com.logics.sierra_book.ST_ch2._11;

/*-
	@created 18-07-2020

	What is the result?
		x - subsub
		x - sub subsub
	v - alpha subsub
		x - alpha sub subsub
		x - compilation fails
		x - An exception is thrown at runtime

	""
*/

class Alpha {
	static String s = " ";
	protected Alpha() { s += "alpha "; }
}

class SubAlpha extends Alpha {
	private SubAlpha() { s += "sub "; }
}

public class SubSubAlpha extends Alpha {
	private SubSubAlpha() { s += "subsub "; }
	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
