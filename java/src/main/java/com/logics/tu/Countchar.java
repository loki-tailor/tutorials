package com.logics.tu;

public class Countchar {

    public static void main(String[] args) {
	String s = "hello world";
	int count = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == 'e')
		count++;
	}
	System.out.println(count);
    }

}
