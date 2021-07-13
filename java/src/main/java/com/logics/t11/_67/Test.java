package com.logics.t11._67;

interface Profitable1 {
	default double profit() { return 12.5; }
}

interface Profitable2 {
	default double profit() { return 25.5; }
}

public abstract class Test implements Profitable1, Profitable2 {

	// ##########################################################################################
	// public default double profit() { return 50.0; } // modifier default not allowed here

	// ##########################################################################################
	// protected double profit() { return 50.0; } // error: attempt to assign weaker privileges; was public

	// ##########################################################################################
	// double profit() { return 50.0; } // error: attempt to assign weaker privileges; was public

	// ##########################################################################################
	// public double profit() { return Profitable1.profit(); } // error:  error: non-static method profit() cannot be referenced from a static context

	// ##########################################################################################
	public double profit() { return Profitable2.super.profit(); } // no error

	// ##########################################################################################
	// public double profit() { return 50.0; } // no error

	

}

/*- compile error as below if Test class is kept empty

error: class Test inherits unrelated defaults for profit() from types Profitable1 and Profitable2

*/

/*-

Profit class causes compilation error as it complains about duplicate default methods: Profitable1.profit() and Profitable2.profit(). To rectify this error abstract class Profit must override the profit() method.



default keyword for method is allowed only inside the interface and default methods are implicitly public. So overriding method should use public modifier and shouldn't use default keyword.

If you want to invoke the default method implementation from the overriding method, then the correct syntax is: [Interface_name].super.[default_method_name].

Hence, `Profitable1.super.profit();` will invoke the default method of Profitable1 interface and `Profitable2.super.profit();` will invoke the default method of Profitable2 interface.

*/