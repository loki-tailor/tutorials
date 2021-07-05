package com.exceptions_and_errors;

/*- @created 04-11-2020

	IllegalStateException:	Thrown when thee state of the environment doesn't match operation 
							being attempted - e.g. using a scanner that's been closed 
*/

public class IllegalStateExceptionDemo {
	public static void main(String[] args) {
		java.util.Scanner sc = null;
	
			System.out.print("Enter your name: ");
			sc = new java.util.Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("Hello, " + name + " !!");
			sc.close();

			String readAgain = sc.nextLine(); // Exception in thread "main" java.lang.IllegalStateException: Scanner closed
		
	}
}