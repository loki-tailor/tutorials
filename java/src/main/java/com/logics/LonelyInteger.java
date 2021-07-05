package com.logics;

import java.util.Arrays;

public class LonelyInteger {

    public static void main(String[] args) {

	/*-
	 * 1) Any number xor'd with itself will give zero. 
	 * 2) Any number xor'd with zero will give the number. 
	 * 3) We are told there is an odd number of numbers in the array and they are all pairs of the same number, apart from one.
	 * 4) xor is associative (The associative property states that you can add or multiply regardless of how the numbers are grouped)
	 * 5) xor is commutative (Changing the order/sequence of the operand does not affect the result)
	
		So if we xor all the numbers in the array together then any which are the same will cancel out - 
		and give zero as the result of all the xors.
	
		Then we are left with the unique number, which xor's with zero and so gives the unique number as the answer.
	 */

	int a[] = { 2, 4, 5, 3, 6, 2, 3, 4, 5 };
	// int b[] = { 1, 1, 2, 2, 3, 3 };
	int result = 0;

	System.out.println(Arrays.toString(a));
	for (int i : a) {
	    System.out.println(result + " ^ " + i + " = " + (result ^ i));
	    result = result ^ i;
	}
	System.out.println("lonely integer = " + result);
    }

}
