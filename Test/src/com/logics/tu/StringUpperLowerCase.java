package com.logics.tu;

public class StringUpperLowerCase {

    public static void main(String[] args) {
	String appName = "HelloWorld";
	String query = null;
	query = "";
	for (int i = 0, len = appName.length(); i < len; i++) {
	    char ch = appName.charAt(i);
	    if (i % 2 == 0) {
		query = query + Character.toLowerCase(ch);
	    } else {
		query = query + Character.toUpperCase(ch);
	    }
	}
	System.out.println(query);

    }

}
