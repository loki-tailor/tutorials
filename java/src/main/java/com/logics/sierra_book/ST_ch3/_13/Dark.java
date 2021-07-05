package com.logics.sierra_book.ST_ch3._13;

/*-
	@created 11-08-2020
	
	What is the result?
		x - 2
		x - 3
		x - 4
		x - 5
	v - Compilation Error
		x - An exception is thrown at runtime
*/

public class Dark {
	int x = 3;
	public static void main(String [] args) {
		new Dark().go1();
	}
	void go1() {
		int x;
		go2(++x);
	}
	void go2(int y) {
		int x = ++y;
		System.out.println(x);
	}
}

/*-
	COMPILATION ERROR
	
	$ javac com/logics/sierra_book/ST_ch3/_13/Dark.java

	com\logics\sierra_book\ST_ch3\_13\Dark.java:14: error: variable x might not have been initialized
					go2(++x);
						  ^
	1 error

*/