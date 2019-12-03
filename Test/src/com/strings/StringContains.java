package com.strings;

public class StringContains {

    public static void main(String[] args) {
	String query = "amaz";
	String s = "Amazon Go";
	query = query.toLowerCase();
	s = s.toLowerCase();
	if (s.contains(query)) {
	    System.out.println("yes");
	} else {
	    System.out.println("no");
	}
    }

}
