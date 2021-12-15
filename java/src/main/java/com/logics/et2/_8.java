package com.logics.et2;

public class _8 {
	public static void main(String[] args) {
		int i = 0;
		int[] iA = { 10, 20 };
		iA[i] = i = 30;
		System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
	}

}
