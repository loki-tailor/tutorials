package com.stackoverflow_and_outofmemory;

/*-
	@created 13-07-20
*/

public class MainRecursiveCall {
	private static int i = 0;
	public static void main(String[] args) {
		// main(args); // Exception in thread "main" java.lang.StackOverflowError

		// ref: https://stackoverflow.com/a/2535728/7415499
		try {
			System.out.print(i++ + " ");
			main(args);
		} catch(StackOverflowError soe) {
			try { Thread.sleep(5000); } catch(Exception e) {}
			System.out.println("SO catched and thrown below as:\n" + soe);
			System.gc();
		} finally {
			System.out.print(i + "Finally ");

			//  System.exit(-1);
			// when above is uncommented, below error comes
			// thread "main" java.lang.NoClassDefFoundError: Could not initialize class java.lang.Shutdown
			// 	at java.lang.Runtime.exit(Unknown Source)
			// 	at java.lang.System.exit(Unknown Source)
			// 	at com.stackoverflow_and_outofmemory.MainRecursiveCall.main(MainRecursiveCall.java:21)
		}
		System.out.print("bye.................");
	}
}
