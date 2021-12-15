package com.logics.et3;

public class _43 {
	public static void main(String[] args) {
		Object[] a = { "1", 2, 3 };// valid
		Object[] b = new int[] { 1, 2, 3 }; // invalid
		Object c = new int[] { 1, 2, "3" }; // invalid
		Object d = new int[] { 1, 2, 3 }; // valid
		Object e = new int[10]; // valid
		Object f[] = new int[10]; // invalid
	}
}
