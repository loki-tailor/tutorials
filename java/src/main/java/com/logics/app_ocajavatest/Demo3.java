package com.logics.app_ocajavatest;

/**
	created @ 23-01-2020
	author @ lokeshwar
	
	This code will give compilatin error, since the iteration variable ..
	.. is declared inside the loop. 
	Compile Error as "error: cannot find symbol..."
*/

public class Demo3 {
	public static void main(String[] args) {
		int y = 1;
		do {
			
			System.out.println(y++ + " ");
		} while (y<=10);
	}
}