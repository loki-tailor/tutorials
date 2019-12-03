package com.logics.tu;

public class RemoveChars {

    public static void main(String[] args) {
	String s = "@@##1247&&&&****(())";

	s = s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);

    }

}
