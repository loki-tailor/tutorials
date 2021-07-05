package com.recursion;

/*-
	@created 14-07-20

	ref: https://stackoverflow.com/a/21426731/7415499

	* In head recursion, the recursive call, when it happens, comes before other processing in the function 
	(think of it happening at the top, or head, of the function).

	* In tail recursion, it’s the opposite—the processing occurs before the recursive call. 
	Choosing between the two recursive styles may seem arbitrary, but the choice can make all the difference.
*/

public class HeadRecursion {
	public void head(int i) {
		if(i==0) return;
		else head(i-1);
		System.out.println(i);
	}

	public static void main(String[] args) {
		new HeadRecursion().head(10);
	}
}

/*-

OUTPUT:

1
2
3
4
5
6
7
8
9
10

*/
