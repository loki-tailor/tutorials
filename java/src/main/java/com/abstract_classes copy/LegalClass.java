package com.abstract_classes;

/*-
	created @ 29-03-20
	@author lokeshwar
*/

public abstract class LegalClass {
	public void doIt1() {}
	public static void doIt2() {}

	// for below compilation error will come
	// public static abstract void doIt3() {}
	/*-
		com/abstract_classes/LegalClass.java:11: error: illegal combination of modifiers: abstract and static
		public static abstract void doIt3() {}
				            ^
	1 error
	*/
}

/*-
	- No compilation error
	- Having an abstract class with no abstract method is legal
*/
