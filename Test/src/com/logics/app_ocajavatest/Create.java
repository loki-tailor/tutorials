package com.logics.app_ocajavatest;

/**
	created @ 23-01-2020
	@author lokeshwar

	A1 = The code prints 2 4
	A2 = The code prints 3 4 if constructor Create(int nm) is removed
*/

public class Create {

	Create() { System.out.print("1 "); }
	//Create(int num) { System.out.print("2 "); }
	Create(Integer num) { System.out.print("3 "); }
	Create(Object num) { System.out.print("4 "); }
	Create(int... nums) { System.out.print("5 "); } 
	public static void main(String[] args) {
		new Create(100);
		new Create(100L);
	}
}