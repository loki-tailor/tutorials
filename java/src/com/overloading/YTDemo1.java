package com.overloading; 

/*- @created 09-02-21
 * ref:  youtube.com/watch?v=4NshxkCx5ac
 */
public class YTDemo1 {

	private static void m(int x) {
		System.out.println("int version @ " + x);
	}

	private static void m(char x) {
		System.out.println("char version @ " + x);
	}

	public static void main(String[] args) {
		int i = '_'; // this is basically storing the ASCII value
		m(i);
		m('5');
	}
}
