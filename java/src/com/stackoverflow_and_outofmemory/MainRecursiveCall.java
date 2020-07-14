package com.stackoverflow_and_outofmemory;

/*-
	@created 13-07-20
*/

public class MainRecursiveCall {
	public static void main(String[] args) {
		// main(args); // Exception in thread "main" java.lang.StackOverflowError

		// ref: https://stackoverflow.com/a/2535728/7415499
		try {
			main(args);
		} catch(StackOverflowError soe) {
			System.out.println("SO catched and thrown below as:\n" + soe);
		}
	}
}
