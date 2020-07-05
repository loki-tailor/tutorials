package com.logics.sierra_book.ST_ch1._7;

/**
	@created 05-07-2020

	Options:
		x - Compilation succeeds
		x - Compilation fails with an error on line 6
	v - Compilation fails with an error on line 7
	v - Compilation fails with an error on line 8
		x - Compilation fails with an error on line 9

	----------------------------------------------------------------------------------
	Output :-
	com/logics/sierra_book/ST_ch1/_7/Announce.java:10: error: illegal character: '#'
			int #lb = 7;
			    ^
	com/logics/sierra_book/ST_ch1/_7/Announce.java:10: error: not a statement
			int #lb = 7;
			^
	com/logics/sierra_book/ST_ch1/_7/Announce.java:11: error: ']' expected
			long [] x [5];
				   ^
	com/logics/sierra_book/ST_ch1/_7/Announce.java:11: error: illegal start of expression
			long [] x [5];
				    ^
	4 errors
	----------------------------------------------------------------------------------	
*/

class Announce {
	public static void main(String [] args) {
		for(int __x = 0; __x < 3; __x++) ; // line 6
		int #lb = 7; // line 7
		long [] x [5]; // line 8
		Boolean []ba[]; // line 9
	}
}
