package com.exceptions_and_errors;

/*- @created 03-11-2020
*/

// e_g_3: pg. 318 - ex-5-4
public class BadFoodException extends Exception {
	class MyException {}
	public static void main(String[] args) {
		if(args.length <= 0) {
			System.out.println("Please specify food while running the application. Bye...");
		} else {
			try {
				checkFood(args[0]);
			} catch(BadFoodException e) {
				e.printStackTrace();
			}
		}
	}

	static void checkFood(String food) throws BadFoodException {
		if(java.util.Arrays.asList("apple", "mango", "banana").contains(food)) {
			System.out.println("I like the food i.e. " + food);
		} else {
			throw new BadFoodException();
		}
	}

}