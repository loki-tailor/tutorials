package com.recursion;

/*-
	@created 14-07-20

	ref: https://stackoverflow.com/a/21426731/7415499

	* In head recursion, the recursive call, when it happens, comes before other processing in the function 
	(think of it happening at the top, or head, of the function).

	* In tail recursion, it’s the opposite—the processing occurs before the recursive call. 
	Choosing between the two recursive styles may seem arbitrary, but the choice can make all the difference.
*/

public class TailRecursion {
	public void tail(int n) {
		if(n==0) return;
		else System.out.println(n);
		tail(n-1);
	}
	public static void main(String[] args) {
		new TailRecursion().tail(10);
	}
}

/*-

OUTPUT:

10
9
8
7
6
5
4
3
2
1

*/
