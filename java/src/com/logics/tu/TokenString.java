package com.logics.tu;

public class TokenString {

    public static void main(String[] args) {
	String s = "He is a very very good boy, isn't he?";
	String s1[] = s.split("[!?@',]");
	System.out.println(s1.length);
	for (String a : s1) {
	    System.out.println(a);

	}
    }

}
