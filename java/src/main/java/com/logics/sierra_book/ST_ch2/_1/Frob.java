package com.logics.sierra_book.ST_ch2._1;

/*-
	@created 18-07-2020

	"Given: 'Frobnicate' interface
*/

// ------------------------------------------------------------------------------------------

// A.
// public abstract class Frob implements Frobnicate { public abstract void twiddle(String s) {} }







// ------------------------------------------------------------------------------------------

/*- COMPILE ERROR:
	com/logics/sierra_book/ST_ch2/_1/Frob.java:10: error: abstract methods cannot have a body
	public abstract class Frob implements Frobnicate { public abstract void twiddle(String s) {} }
		                                                                ^
	1 error
*/





// ------------------------------------------------------------------------------------------

// B. (no compilation error
// public abstract class Frob implements Frobnicate {}

// ------------------------------------------------------------------------------------------







// C.
// public class Frob extends Frobnicate { public void twiddle(String i) {} }
/*- COMPILATION ERROR
	com/logics/sierra_book/ST_ch2/_1/Frob.java:23: error: no interface expected here
	public class Frob extends Frobnicate { public void twiddle(String i) {} }
		                  ^
	1 error
*/









// ------------------------------------------------------------------------------------------

// D. 
// public class Frob implements Frobnicate { public void twiddle(Integer i) {} }

/*- COMPILATION ERROR
	com/logics/sierra_book/ST_ch2/_1/Frob.java:64: error: Frob is not abstract and does not override abstract method twiddle(String) in Frobnicate
	public class Frob implements Frobnicate { public void twiddle(Integer i) {}}
	       ^
	1 error
*/









// ------------------------------------------------------------------------------------------

// E. (NO COMPILATION ERROR)

public class Frob implements Frobnicate {
	public void twiddle(String i) {}
	public void twiddle(Integer s) {}
}
// ------------------------------------------------------------------------------------------
