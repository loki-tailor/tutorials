package com.logics.sierra_book.ST_ch1._10;

/**
	@created 05-07-2020

	---------------------------------------------------------------
	Options:
	v - The class Tablet will NOT compile
		x - The interface Gadget will NOT compile
		x - The output will be plug in show book
		x - The abstract class Electronic will NOT compile
		x - The class Tablet CANNOT both extend and implement
	---------------------------------------------------------------
	Output :-
	com/logics/sierra_book/ST_ch1/_10/Tablet.java:16: error: doStuff() in Tablet cannot implement doStuff() in Gadget
		void doStuff() { System.out.print("show book "); } 
		     ^
	  attempting to assign weaker access privileges; was public
	1 error
	---------------------------------------------------------------
*/

interface Gadget {
	void doStuff(); // by default this is public, so implement class should include the keyword 'public'
}

abstract class Electronic {
	void getPower() { System.out.print("plug in "); }
}

public class Tablet extends Electronic implements Gadget {    
    
    	// below will give compile error since, doStuff() should be declared public
    	// void doStuff() { System.out.print("show book "); }
	public void doStuff() { System.out.print("show book "); } 
    
	public static void main(String[] args) {
		new Tablet().getPower();
		new Tablet().doStuff();
	}
}
