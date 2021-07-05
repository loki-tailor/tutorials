package com.logics;

/**
*	@author lokeshwar created on 4-12-19
*		Practice of usage of modifiers from MCQ of app "OCA Java Test"
*
*	Doubt related to this concept is raised and tracked under:
*	https://stackoverflow.com/q/59164008/7415499
*/

public class ModifierNotAllowInMethodCheck {

	private static int pvtInt;

	public static void method1() {
		
		// if pvtInt is not static, compilation error will come
		System.out.println("pvtInt = " + pvtInt);

		int var1 = 10;
		System.out.println("var1 = " + var1);

		// if public is used for var2, the compilation error will come
		int var2 = 20;
		System.out.println("var2 = " + var2);
	} // end of method1()

	public static void main(String args[]) {
		method1();
	} // end of main()

} // end of class
