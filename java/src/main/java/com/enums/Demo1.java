package com.enums;

/*-
	created @ 31-03-20
	@author lokeshwar
*/

// this cannot be private or protected, it 
// enums declared outside of a class can only be default or public
// ; is optional at the end
enum CoffeeSize { BIG, HUGE, OVERWHELMING } ;

class Coffee {
	CoffeeSize size;
}

public class Demo1 {
	public static void main(String[] args) {

		// enum InvalidEnum { BIG, HUG, DEMO }
		/*-
			above will give compile error as:
			com/enums/Demo1.java:20: error: enum types must not be local
					enum InvalidEnum { BIG, HUG, DEMO }
					^
			1 error
		*/

		Coffee drink = new Coffee();
		drink.size = CoffeeSize.HUGE;
		System.out.println("size = " + drink.size); // op = "size = HUNGE"
	}
} // end of class


