package com.logics.sierra_book.ST_ch2._12;

/*-
	@created 18-07-20

	What is the result?
		x - h hn x
		x - hn x h
	v - b h hn x
		x - b hn x h
		x - bn x h hn x
		x - b bn x h hn x
		x - bn x b h hn x
		x - Compilation Fails

	"Constructors call their superclass constructors, which execute first, and that constructors can be overloaded."
*/

class Building {
	Building() { System.out.print("b "); }
	Building(String name) {
		this(); System.out.print("bn " + name);
	}
}

public class House extends Building {
	House() { System.out.print("h "); }
	House(String name) {
		this(); System.out.print("hn " + name);
	}
	public static void main(String[] args) { new House("x "); }
}
