package com.logics.et2;

public class _67 {
	public static void main(String args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(args + " ");
		}
	}
}

/*-
- no compile error
- runtime error as below

Error: Main method not found in class com.logics.et2._67, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/