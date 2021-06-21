package com.operators;

public class PrecendenceDemo2 {

	public static void two(String[] args) {
		int x = 10, y = 20, z = 30;
		System.out.println("x = " + x + " : y = " + y + " : z = " + z);
		x -= y += z;
		System.out.println("x = " + x + " : y = " + y + " : z = " + z);
		x += y -= z;
		System.out.println("x = " + x + " : y = " + y + " : z = " + z);

		/*-
			x = 10 : y = 20 : z = 30
			x = -40 : y = 50 : z = 30
			x = -20 : y = 20 : z = 30
		 * 
		 */

	}

	public static void one(String[] args) {
		int x = 10, y = 20;
		System.out.println("x = " + x + " : y = " + y);
		x -= y += 10;
		System.out.println("x = " + x + " : y = " + y);
		x += y -= 10;
		System.out.println("x = " + x + " : y = " + y);

		/*-
		 	x = 10 : y = 20
			x = -20 : y = 30
			x = 0 : y = 20		
		 */
	}
}
