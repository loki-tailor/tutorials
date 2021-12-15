package com.logics.tmisc;

public class ET1_30 {
	public static int[] getArray() {
		return null;
	}

	public static void main(String[] args) {

		demo2();

		int index = 1;
		try {
			int t = getArray()[index = 2]++;
			System.out.println(t);
		} catch (Exception e) {
		}
		System.out.println("index = " + index);
	}

	public static void demo2() {
		
		// ref: https://enthuware.com/forum/viewtopic.php?f=2&t=989
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		System.out.println(a[(a = b)[3]]);

		/*-
		 * 
		 * 1. As it clearly says, "the expression to the left of the brackets appears to be fully evaluated ",
		in a [ (a = b)[3] ], the expression to the left of the brackets is "a", which is evaluated first. Which means, the reference to the object pointed to be a is put on the stack first.
		
		2. Now, (a = b)[3] is evaluated. Again, the expression to the left of brackets is (a = b), thus b is assigned to a. (This doesn't change the value that has already been put on the stack in previous step.)
		
		3. Now, a[3] is evaluated, which is actually same as b[3] because a points to the same array as b i.e. 0.
		
		4. Finally, [0] is applied to the original reference that was stored on the stack in step 1. It points to the array { 1, 2, 3, 4 }. Thus, the complete expression finally returns 1.
		 */
	}
}

/*-
 * If the array reference expression produces null instead of a reference to an array, then a NullPointerException is thrown at runtime, but only after all parts of the array reference expression have been evaluated and only if these evaluations completed normally. 

This means, first index = 2 will be executed, which assigns 2 to index. After that null[2] is executed, which throws a NullPointerException. But this exception is caught by the catch block, which prints nothing. So it seems like NullPointerException is not thrown but it actually is.

In other words, the embedded assignment of 2 to index occurs before the check for array reference produced by getArray().

In an array access, the expression to the left of the brackets appears to be fully evaluated before any part of the expression within the brackets is evaluated. Note that if evaluation of the expression to the left of the brackets completes abruptly, no part of the expression within the brackets will appear to have been evaluated.
*/
