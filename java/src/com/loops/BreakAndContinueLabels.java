package com.loops;

/*- @created 29-10-2020
	
	------------------------------------------------------------------------------------------
	*	'continue' statements must be inside a loop; otherwise, you'll get a compiler error.

	*	'break' statements must be used inside either a loop or a switch statements.
	
	*	The 'break' statement causes the program to stop execution of the innermost loop and 
		start processing the next line of code after that block.
	
	*	The 'continue' statement causes only the current iteration of the innermost loop to
		cease and the next iteration of the same loop to start if the condition of the loop is met.

	------------------------------------------------------------------------------------------
	*	Although many statements in java can be labeled, it's most common to use labels with loop 
		statements like for or while, in conjuction with break & continue statements.

	*	A label statement must be placed just before the statement being labeled, 
		and it consists of a valid identifier that ends with a colon (:)

	*	The labeled varities are needed only in situation where you have a nested loop,
		and they need to indicate which of the nested loops you want to break from, or 
		from which of the nested loop you want to continue with the next iteration.

	*	A break statement will exit out of the labeled loop, as opposed to the innermost
		loop, if the break keyword is combined with a label.

	*	The label must adhere to the rules for a valid variable name and should adhere to the 
		Java naming convention.The syntax for the use of a label name in conjuction with a break
		statement is: "break _keyword_:"

	*	e_g_7: Labeled 'continue' and 'break' statements must be insude the loop that has the 
		same label name; otherwise, the code will not compile 

	------------------------------------------------------------------------------------------

	------------------------------------------------------------------------------------------

*/

public class BreakAndContinueLabels {
	public static void main(String[] args) {
		// e_g_7();
	}

	static void e_g_7() {
		boolean flag = true;
		outer:
			while(true) {
				System.out.println("1st loop - hello world");
				flag = false;
				break outer;
				System.out.println("1st loop - after loop statement which won't print");
			}
		boolean flag_2 = true;
		first: 
			while(flag_2) {
				System.out.println("2nd loop - hello world");
				break first;
				System.out.println("2nd loop - after loop statement which won't print");
			}
	}

	static void e_g_6() {
		// ex. 5.2, pg. 297
		int age = 0;
		outer:
			// int age = 0; // compile error
			while(age <= 21) {
				age++;
				System.out.print("age = " + age + ": ");
				if(age == 16) {
					System.out.println("get your driver's licence");
					continue outer;
				}
				System.out.println("another year");
			}
	}

	static void e_g_5() {
		// example of a complex continue statement
		outer:
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.println("Hello");
					continue outer;
				} // end of inner loop
				System.out.println("outer"); // never prints
			}
	}

	static void e_g_4() {
	// example of a complex usage of labeled break statement
		boolean isTrue = true;
		outer:
			for(int i=0; i<5; i++) {
				while(isTrue) {
					System.out.println("Hello");
					break outer;
				} // end of inner while loop
				System.out.println("Outer Loop"); // won't print
			} // end of outer for loop
			System.out.println("Good Bye...");
	}

	static void e_g_3() {
	// example of a simple label declaration
	foo:
		for(int x = 3, y=10; x<20; x++) {
			while(y>7) {
				y--;
			}
		}
	}

	static void e_g_2() {
		// e.g. of 'contune' / 'break' - unlabeled statements
		for(int i=-13, j=i%2; i<7;++i) {
			if(i%7 == 0) break;
			if(i%3 == 0) continue;
			System.out.println("i = " + i + ", j = " + j);			
		}
	}

	static void e_g_1() {
		/*-
			In this example there is no effect of continue statement
		*/
		for(int i=0; i<10; i++) {
			System.out.println(i + " : Inside Loop");
			continue;
		}
	}
}