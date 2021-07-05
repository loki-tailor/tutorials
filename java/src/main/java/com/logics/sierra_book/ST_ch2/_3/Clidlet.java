package com.logics.sierra_book.ST_ch2._3;

/*-
	@created 18-07-2020

	v - Clidlet
		x - Clidder
		x - Clidder
			Cliddlet
		x - Clidlet
			Clidder
		x - Compilation fails

	"Although a final method cannot be overridden, in this case, the method is private and therefore, hidden. The effect is that a new, accessible, method flipper is created. There, no polymorphism occurs in this example, the method invoked is simply that of the child class, and no error occurs"
*/

class Clidder {
	private final void flipper() { System.out.println("Clidder"); }
}

public class Clidlet extends Clidder {
	public final void flipper() { System.out.println("Clidlet"); }
	public static void main(String [] args) {
		new Clidlet().flipper();
	}
}
