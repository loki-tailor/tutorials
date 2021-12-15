package com.logics.et1;

public class _30 {
	public static int[] getArr() {
		return null;
	}

	public static void main(String[] args) {
		int index = 1;
		try {
			getArr()[index = 2]++;
		} catch (Exception e) {
		}

		System.out.println("index = " + index);
	}
}
