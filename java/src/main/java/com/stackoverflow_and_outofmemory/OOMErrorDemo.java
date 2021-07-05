package com.stackoverflow_and_outofmemory;

/*-
	@created 13-07-2020

	ref: https://javaconceptoftheday.com/stackoverflowerror-vs-outofmemoryerror-in-java/
*/

public class OOMErrorDemo {
	public static void main(String[] args) {
		int j = 0;
		// while(true) { new Object(); System.out.println(j++);}

		/*-
		for (int i = 1; i > 0; i++) {
			new Object();
			System.out.println(i);
		} */

		// ref: https://stackoverflow.com/q/214741/7415499
		// new Object() {{getClass().newInstance();}};
	}
}
