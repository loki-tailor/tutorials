package com.logics.sierra_book.ST_ch2._14;

/*-
	@created 15-07-2020
	
		x - hopping 212
		x - Compilation fails due to an error on line 2
		x - Compilation fails due to an error on line 5
		x - Compilation fails due to an error on line 12
	v - Compilation fails due to an error on line 13
		x - Compilation fails due to an error on line 14
	v - Compilation fails due to an error on line 16
*/

interface FrogBoilable {
	static int getCtoF(int cTemp) { // line 2
		return (cTemp * 9 / 5) + 32;
	}
	default String hop() { return "hopping "; } // line 5
}

public class DontBoilFrogs implements FrogBoilable {
	public static void main(String[] args) {
		new DontBoilFrogs().go();
	}
	void go() {
//		System.out.println(hop()); // line 12 : no compile error : op = "hopping "
//		System.out.println(getCtoF(100)); // line 13 : compile error : cannot find symbol
//		System.out.println(FrogBoilable.getCtoF(100)); // line 14 : no compile error : op = 212
//		DontBoilFrogs dbf = new DontBoilFrogs(); // line 15 : no compile error
//		System.out.println(dbf.getCtoF(100)); // line 16 : compile error : error: cannot find symbol
	}
}

