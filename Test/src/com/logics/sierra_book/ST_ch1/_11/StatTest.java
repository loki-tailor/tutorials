package com.logics.sierra_book.ST_ch1._11;

/**
	@created 05-07-2020

	Q - Which, inserted independently, compiles ?
	Options:
		x - import static java.lang;
		x - import static java.lang.Integer;
	v - import static java.lang.Integer.*;
		x - static import java.lang.Integer.*;
	v - import static java.lang.Integer.MAX_VALUE;
		x - None of the above statements are valid import syntax
*/

// insert here the imports

class StatTest {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
	}
}
