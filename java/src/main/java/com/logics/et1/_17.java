package com.logics.et1;

public class _17 {
	
	public int setVar(int a, int b, float c) { return -1; }
	
	public int setVar(int a, float b, int c) { return (int) (a + b + c); } // valid
	
//	public int setVar(int x, int y, float z) { return x + y; } // invalid
	
//	public float setVar(int a, int b, float c) { return c*a; } // invalid
	
	public float setVar(int a) { return a; }
	
	public static void main(String[] args) {
		
	}
}
