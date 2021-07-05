package com.logics.sierra_book.ST_ch2._6;

/*-
	@created 18-07-2020
*/

class X { void do1() {} } 
class Y extends X { void do2() {} }
class Chrome {
	public static void main(String [] args) {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		
		// A. 
		// x2.do2(); // compile error #1

		// B.
		//(Y)x2.do2(); // compile error #2

		// C.
		((Y)x2).do2(); // no error

		// D. Compilation Fails

		// F. An exception is thrown at runtime		
	}
}
/*- COMPILE ERROR #1

	com/logics/sierra_book/ST_ch2/_6/Chrome.java:16: error: cannot find symbol
			x2.do2(); // compile error
			  ^
	  symbol:   method do2()
	  location: variable x2 of type X
	1 error

*/

/*- COMPILE ERROR #2
	com/logics/sierra_book/ST_ch2/_6/Chrome.java:19: error: not a statement
			(Y)x2.do2(); // compile error
			^
	1 error
*/
