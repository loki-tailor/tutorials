package com.strings;

/**
	created @ 26-01-2020
	@author lokeshwar
*/

public class Demo1 {
	public static void main(String[] args) {

		StringBuilder puzzle = new StringBuilder("Java");
		System.out.println(puzzle);

		// TARGET: to print "avaJ"

		//System.out.println(puzzle.append("vaJ$").substring(0,4)); // FALSE

		//System.out.println(puzzle.reverse()); // TRUE

		//System.out.println(puzzle.append("vaJ$").delete(0,3).deleteCharAt(puzzle.length())); // FALSE

		System.out.println(puzzle.append("vaJ$").delete(0,3).deleteCharAt(puzzle.length() - 1)); // TRUE		
	}
}