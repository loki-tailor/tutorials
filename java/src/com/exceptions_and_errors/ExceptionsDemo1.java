package com.exceptions_and_errors;

/*-	@created 31-10-2020

	------------------------------------------------------

	*	Exception handling works by transferring the execution of a program
		to an appropriate exception handler when an exception occurs.

	*	e_g_1: Even if there is a return statement in the try block, the finally
		block executes right after the return statement in is encountered and 
		before the return statement.

	*	If an exception is thrown, finally runs,
		If an exception is not thrown, finally runs,
		If the exception is caught, finally runs,
		If the exception is not caught, finally runs.

	*	Since the compiler doesn't even require 'catch' clause, sometimes you'll run 
		accross code that hs a try block immediately followed by a finally block.
		Such code is useful when the exception is going to be passed back to the 
		calling method.

	------------------------------------------------------

	*	Most languages have the concept of a method stack or a call stack.
		Simply put, the call stack is the chain of methods that your program
		executes to get the current method. 

	*	If an exception reaches the bottom of the call stack, it's like reaching the
		bottom of a very long drop, the ball explodes, and so does the program. 
		An exception that's never caught will cause your application to stop running.


	*	e_g_2: Exception thrown out of main() results in JVM halting, and the stack trace
		will be printed to the output.

	------------------------------------------------------
*/

public class ExceptionsDemo1 {
	public static void main(String[] args) {
		// System.out.println(e_g_1());
		// System.out.println(demo());
		try {
			e_g_3("lokeshwar tailor");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("program completed");
		}
	}

	static void e_g_3(String data) throws Exception {
		// reverse() 
		// OCA - pg. 305 - ex. 5.3

		if(data == null || data.isEmpty()) {
			throw new Exception("String is NULL or EMPTY.");
		}

		StringBuilder sb = new StringBuilder();
		for(int i = data.length(); i>0; i--) {
			sb.append(data.charAt(i-1));
		}
		System.out.println(sb.toString());
	}

	static void e_g_2_a() {
		e_g_2_b();
	}

	static void e_g_2_b() {
		int x = 5/0;
	}

	static int demo() {
		try {
			System.out.println(1);
			return 2;
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		return 5;
	}

	static String e_g_1() {
		// this demonstrates final being executed before the after the return statement
		try {
			System.out.println("<this_is_before_return_in_try>");
			return "<this_is_return_inside_try_block>";
			// System.out.println("<this_is_after_return_in_try>");
			// throw new Exception("<this_is_an_exception_dude>");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("<this_is_finally_block_statement>");
		}
		System.out.println("<this_is_at_the_end_of_method_before_return");
		return "<return_statement>";
	}
}