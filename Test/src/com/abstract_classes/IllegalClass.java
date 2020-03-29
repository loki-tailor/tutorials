package com.abstract_classes;

/*-
	created @ 29-03-20
	@author lokeshwar
*/

public class IllegalClass {
    	// compile error will come below
	// public abstract void doIt();
}

/*-
	COMPILE ERROR as :

	com/abstract_classes/IllegalClass.java:8: error: IllegalClass is not abstract and does not override abstract method doIt() in IllegalClass
	public class IllegalClass {
	       ^
	1 error

*/

