package com.logics.sierra_book.ST_ch1._9;

/**
	@created 05-07-2020

	--------------------------------------------------------------------
	Options:
		x - 13
		x - Compilation fails due to multiple errors
		x - Compilation fails due to an error on line 6
	v - Compilation fails due to an error on line 7
		x - Compilation fails due to an error on line 11

	--------------------------------------------------------------------
		Output :-
	com/logics/sierra_book/ST_ch1/_9/Frodo.java:11: error: non-static method countGold(int,int) cannot be referenced from a static context
			System.out.println(countGold(myGold,6)); // line 7
				           ^
	1 error
	--------------------------------------------------------------------
*/

public class Frodo extends Hobbit {
	public static void main(String[] args) {
		int myGold = 7; // line 6
		//System.out.println(countGold(myGold,6)); // line 7
	}	
}

class Hobbit {
	int countGold(int x, int y) { return x + y; } // line 11
}
