package com.loops;

/*- @created 28-10-2020

	-------------------------------------------------------------------------------
	* The terms for-in, for-each, and "enhanced for" all refer to the same Java construct.

	* for-loop in pseudocode form:
	for(initialization ; condition ; iteration) {
		loop_body
	}

	* 'iteration' expression always happens after the loop body runs (e.g.1)

	* You can have only 1 test expression

	* Barring a forced exit, evaluating the iteration expression and then evaluating the conditional expression,
	  are always the last two things that happen in a for loop!

	* e.g. of forced exit includes: break, return, System.exit(), an exception - which casues a loop to terminate abruptly (e.g.2)

	* e.g. 3: none of the 3 sections of the for declaration are required! (although not necessarily good practice)

	* e.g. 4: with the absence of the initialization and increment sections, the loop will act like a while loop.

	* e.g. 5: for-loop with multiple variables in play in for-syntax

	* e.g. 6: The 3 expressions in the for-statement don't need to operate on the same variables, although typically they do.
			  Even the iterator expression, which mistakenly call the 'increment expression', doesn't need to increment or set anything,
			  you can put arbitary code statements that you want to happen with each iteration of the loop.
	-------------------------------------------------------------------------------
*/

public class ForLoopsDemo1 {
	public static void main(String[] args) {		
		e_g_6();
	}

	static void e_g_6() {
		int b = 3;
		for(int a=1; b!=1; System.out.println("for-syntax-iteration-area"), e_g_1()) {
			b = b-a;
			try {
				java.util.concurrent.TimeUnit.MILLISECONDS.sleep(600);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static void e_g_5() {
		for(int i=0, j=0; (i<10) || (j<5); i++, j++) {
			System.out.println("Multi-variable in for-syntax: i is " + i + ", j is " + j);
			try {
				java.util.concurrent.TimeUnit.MILLISECONDS.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static void e_g_4() {
		int x = 0; 
		for(; x<5; ) {
			x++;
			System.out.println(x + " : loop w/o initialization & iteration in 'for' syntax i.e. similar to 'while' loop.");
			try {
				java.util.concurrent.TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static void e_g_1() {
		for(int x=0; x < 1; x++) {
			System.out.println(x + " : from e_g_1()");
		}
	}

	static boolean e_g_2() {
		for (int x = 0; x < 3; x++) {
			System.out.println("in for loop & method exists along with loop");
			return true;
		}
		System.out.println("outside for loop, this will never print");
		return false;
	}

	static boolean e_g_3() {
	// endless loop
		for( ; ; ) {
			System.out.println("inside an endless loop");
			try {
				java.util.concurrent.TimeUnit.SECONDS.sleep(2);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}