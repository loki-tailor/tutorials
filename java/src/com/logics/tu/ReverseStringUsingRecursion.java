package com.logics.tu;

public class ReverseStringUsingRecursion {

    private static void reverseString(String s) {
	if (s == null || s.length() <= 0) {
	    System.out.println(s);
	    return;
	} else {

	    System.out.print(s.charAt(s.length() - 1));
	    reverseString(s.substring(0, s.length() - 1));

	}
    }

    public static void main(String[] args) {
	String s = "java";
	ReverseStringUsingRecursion.reverseString(s);
    }

}
