package com.logics.sierra_book.ST_ch2._5;

/*-
	@created 18-07-2020

	What is the result?
		x - pre b1 b2 r3 r2 hawk
		x - pre b2 b1 r2 r3 hawk
		x - pre b2 b1 r2 r3 hawk r1 r4
	v - r1 r4 pre b1 b2 r3 r2 hawk
		x - r1 r4 pre b2 b1 r2 r3 hawk
		x - pre r1 r4 b1 b2 r3 r2 hawk
		x - pre r1 r4 b2 b1 r2 r3 hawk
		x - The order of output cannot be predicted
		x - Compilation fails

	"Static init blocks are executed at class loading time; instance init blocks run right after the call to super() in a constructor. When multiple init blocks of a single type occur in a class, they run in order, from top to down."
*/

class Bird {
	{ System.out.print("b1 "); }
	public Bird() { System.out.print("b2 "); }
}

class Raptor extends Bird {
	static { System.out.print("r1 "); }
	public Raptor() { System.out.print("r2 "); }
	{ System.out.print("r3 "); }
	static { System.out.print("r4 "); }
}

class Hawk extends Raptor {
	public static void main(String[] args) {
		System.out.print("pre ");
		new Hawk();
		System.out.println("hawk ");
	}
}
