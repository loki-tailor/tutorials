package com.operators;

/*- @created 14-10-2020
	ref: https://stackoverflow.com/a/30343391/7415499
	This program prints the combinations for 3 things i.e. gives us 2^3=8 distinct combinations
*/

public class OperatorPrecedenceDemo2 {
	public static void main(String[] args) { 
		
		for(int i=0; i<8; i++) {
			System.out.println("i = " + i + ", in binary = " + new StringBuilder(decimalToBinary(i)).reverse());			

			int a1 = i >> 2;
			int a2 = a1 & 1;
			boolean a = a2 == 1;
			System.out.println("a = ((i>>2)&1)==1 = " + a + ", (a1 & 1) = " + a2 + ", (i >> 2) = " + a1);

			int b1 = i >> 1;
			int b2 = b1 & 1;
			boolean b = b2 == 1;
			System.out.println("b = ((i>>1)&1)==1 = " + b + ", (b1 & 1) = " + b2 + ", (i >> 1) = " + b1);

			int c1 = i & 1;
			boolean c = c1 == 1;
			System.out.println("c = (i&1)==1 = " + c + ", (i & 1) = " + c1);

			boolean x1 = (a || b && c);
			boolean x2 = ((a || b) && c);
			
			System.out.println(String.format("%s || %s && %s = %s",a,b,c,x1));
			System.out.println(String.format("(%s || %s) && %s = %s",a,b,c,x2));
			

			System.out.println();
		} // end of for-loop

	} // end of main

	public static String decimalToBinary(int num) {
		int[] remainder = new int[8];
		int i = 0;
		while(num > 0) {
			remainder[i++] = num%2;
			num /= 2;
		} // end of while
		return java.util.Arrays.toString(remainder).replaceAll("\\W","");
	} // end of method

} // end of class
