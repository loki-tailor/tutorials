package com.enums.demo4;

/*-
	created @ 02-04-2020
	@author lokeshwar
*/

enum CoffeeSize {	
	BIG(8), 
	HUGE(10), 
	OVERWHELMING(16) { // start a code block that defines the 'body' for this constant
		public String getLidCode() { // override the method defined in CoffeeSize
			return "A";
		}
	} // end of constant block

	; // `;` is mandaory if methods/variables are to be included in enums

	CoffeeSize(int ounces) {  // enum constructor
		this.ounces = ounces;
	}

	private int ounces; // enum instance variable
	public int getOunces() { return ounces; }
	public String getLidCode() { // this method is overriden by the OVERWHELMING constant
		return "B"; // the default value we want to return the CoffeeSize constants
	}
} // end of enum

class Coffee {
	CoffeeSize size; // each instance of Coffee has an enum
	
	public static void main(String[] args) {
		Coffee drink1 = new Coffee();
		drink1.size = CoffeeSize.BIG;

		Coffee drink2 = new Coffee();
		drink2.size = CoffeeSize.OVERWHELMING;

		System.out.println(drink1.size.getLidCode()); 

		for(CoffeeSize cs : CoffeeSize.values()) {
			System.out.println(cs + " " + cs.getLidCode());
		}
	}
}
