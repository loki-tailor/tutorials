package com.logics.et1;

public class _2 {
	public static void main(String[] args) {
		char c;
		int i;
		c = 'a';
		i = c;
		i++;
//		c = i; // error
		c = (char) i;
		c++;
	}
}
