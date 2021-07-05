package com.logics.sierra_book.ST_ch1._8;

/**
	@created 05-07-2020

	Options :-
		x - TUE
	v - WED
		x - The output is unpredictable
		x - Compilation fails due to an error on line 4
		x - Compilation fails due to an error on line 6
		x - Compilation fails due to an error on line 8
		x - Compilation fails due to an error on line 9
*/

public class TestDays {
	public enum Days { MON, TUE, WED }; // line 4 (public enums are allowed inside a class)
	public static void main(String[] args) {
		for(Days d : Days.values() ) // line 6
		;
		Days [] d2 = Days.values(); // line 8
		System.out.println(d2[2]); // line 9
	}
}
