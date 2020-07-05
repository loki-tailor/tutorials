package com.logics.sierra_book.ST_ch1._12;

/**
	@created 05-07-2020
*/

interface MyInterface {
	// code here

	// --------------------------------------------------------------------------------------
	// public static m1() {;} // compile error - no return type
	/*-
	com/logics/sierra_book/ST_ch1/_12/MyInterface.java:10: error: <identifier> expected
		public static m1() {;} // compile error - no return type
			        ^
	1 error
	*/



	// --------------------------------------------------------------------------------------
	default void m2() {;} // valid - default are allowed in interfaces since Java-8



	// --------------------------------------------------------------------------------------
	abstract int m3(); // valid



	// --------------------------------------------------------------------------------------
	// final short m4() {return 5;} // compile error - method body should be absent + final is not allowed
	/*-
	com/logics/sierra_book/ST_ch1/_12/MyInterface.java:32: error: modifier final not allowed here
		final short m4() {return 5;} // compile error - method body should be absent + final is not allowed
			    ^
	com/logics/sierra_book/ST_ch1/_12/MyInterface.java:32: error: interface abstract methods cannot have body
		final short m4() {return 5;} // compile error - method body should be absent + final is not allowed
			         ^
	2 errors
	*/	




	// --------------------------------------------------------------------------------------
	// default long m5(); // compile error - method body required
	/*-
	com/logics/sierra_book/ST_ch1/_12/MyInterface.java:47: error: missing method body, or declare abstract
		 default long m5(); // compile error - method body required
			      ^
	1 error
	*/




	// --------------------------------------------------------------------------------------
	static void m6() {;} // valid - static are allowed in interfaces since Java-8
}
