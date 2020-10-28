package com.loops;

/*- @created 28-10-2020
	
	-------------------------------------------------------
	Enhanced for loop syntax

	for(declaration : expression) {
		loop_body
	}
	-------------------------------------------------------
	e_g_1: basic demo

	e_g_2: legal & illegal examples

	*	The enhanced for loop assumes that, barring an early exit from the loop, 
		you'll always loop through every element of the array.
	-------------------------------------------------------
	
*/

public class ForEnhancedLoopDemo {
	public static void main(String[] args) {
		e_g_2();
	}

	static void e_g_2() {
		int x;
		long x2;
		long [] la = {7,8,9}; // 'L' is optional i.e. 7L
		int [][] twoDee = {{1,2,3},{4,5,6},{7,8,9}};
		String [] sNums = {"one","two","three"};
		Animals [] animals_1 = { new Dog(), new Cat() };
		Animals [] animals_2 = { new Dog(), new Dog() };

		// legal 'for' declarations
		for(long y : la) {}
		for(int [] n : twoDee);
		for(int n2 : twoDee[3]) {}
		for(String s : sNums);
		for(Object o : sNums) {}
		for(Animals a : animals_1);
		for(Animals a : animals_2) {}

		// ILLEGAL 'for' declarations
		// for(x2 : la) ; // error: bad initializer for for-loop
		// for(int x4 : twoDee) {} // error: incompatible types: int[] cannot be converted to int
		// for(int x3 : la); // error: incompatible types: possible lossy conversion from long to int
		// for(Dog d : animals_1); // error: incompatible types: Animals cannot be converted to Dog
		// for(Dog d : animals_2) {} // error: incompatible types: Animals cannot be converted to Dog
		
	}
	
	static void e_g_1() {
		int[] a = {1,2,3,4,5};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		for(int n : a) {
			System.out.print(n);
		}
	}
}

interface Animals {}
class Dog implements Animals {}
class Cat implements Animals {}