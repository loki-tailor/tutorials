package com.logics.et2;

public class _58 {
	public static void main(String[] args) {
		int i = 0;
		loop: {
			System.out.println("loop lable line");
			try {
				for (; true; i++) {
					if (i > 5)
						break loop;
				}
			} catch (Exception e) {
				System.out.println("exception in loop.");
			} finally {
				System.out.println("in finally");
			}
		}
	}
}
