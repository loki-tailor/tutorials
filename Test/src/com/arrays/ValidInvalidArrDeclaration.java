package com.arrays;

/**
	created @ 23-01-2020
	@author lokeshwar

	Demonstrates a legal and illegal way of declaring an array
	
	Run 1: 	Only #4 & #6 will give compilation error as below:
	 	error: array dimension missing

	Run 2:	Commenting #4, #6
		Now, only #3 gives compilation error as below:
		 error: cannot find symbol
*/		

public class ValidInvalidArrDeclaration {
	public static void main(String[] args) {
		
		// #1
		int[][] scores = new int[5][]; // valid

		// #2
		java.util.Date[] dates[] = new java.util.Date[2][]; // valid

		// #3
		String beans[] = new beans[6]; // invalid

		// #4
		//int[][] java = new int[][]; // invalid

		// #5
		Object[][][] cubbies = new Object[3][0][5]; // valid

		// #6
		//int[][] types = new int[]; // invalid
		
	}
}