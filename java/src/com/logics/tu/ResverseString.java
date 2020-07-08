package com.logics.tu;

public class ResverseString {

    public static void main(String[] args) {
	String s = "Selenium";
	String rev = "";
	for (int i = s.length() - 1; i >= 0; i--) {
	    // System.out.print(s.charAt(i));
	    rev = rev + s.charAt(i);
	}
	System.out.println(rev);

	String a = "Hello World";
	StringBuffer sb = new StringBuffer(a);
	System.out.println(sb.reverse());

    }

}
