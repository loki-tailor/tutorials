package com.logics.sierra_book.ST_ch1._5.pkgB;

/**
	@created 05-07-2020

	Options:
		x - 5 6 7
		x - 5 followed by an exception
		x - Compilation fails with an error on line 7 from Baz.java
	v - Compilation fails with an error on line 8 from Baz.java
	v - Compilation fails with an error on line 9 from Baz.java
		x - Compilation fails with an error on line 10 from Baz.java
	------------------------------------------------------------------------------
	Output :- 
	com/logics/sierra_book/ST_ch1/_5/pkgB/Baz.java:22: error: a is not public in Foo; cannot be accessed from outside package
			System.out.print(" " + f.a); // line 8
				                ^
	com/logics/sierra_book/ST_ch1/_5/pkgB/Baz.java:23: error: b has protected access in Foo
			System.out.print(" " + f.b); // line 9
				                ^
	2 errors
	------------------------------------------------------------------------------
*/

import com.logics.sierra_book.ST_ch1._5.pkgA.*;

public class Baz {
	public static void main(String[] args) {
		Foo f = new Foo(); // line 7
		System.out.print(" " + f.a); // line 8
		System.out.print(" " + f.b); // line 9
		System.out.println(" " + f.c); // line 10
	}
}
