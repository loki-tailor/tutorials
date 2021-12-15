package com.logics.et2;

public class _2 {
	private int j;

	void showJ() {
		while (j <= 5) {
			for (int j = 1; j <= 5;) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println(j);
			j++;
		}
	}

	public static void main(String[] args) {
		new _2().showJ();
	}
}
