package com.logics.et4;

public class _1 {
	public static void main(String[] args) {
//		int a = b = c = 100; // invalid, since b & c are used before declaration
		
//		int a, b, c; a = b = c = 100; // no error
		
//		int a, b, c = 100; // valid
		
//		int a = 100, b, c; // valid
		
//		int a = 100 = b = c; // inavlid
		
//		int b = 0, c = 0; int a = b = c = 100; // valid
		
		int b, c; int a = c = b = 100; // valid
	}
}
