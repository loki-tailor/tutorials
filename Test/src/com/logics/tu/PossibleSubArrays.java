package com.logics.tu;

public class PossibleSubArrays {

    public static void main(String[] args) {
	String s = "abcd";
	String substring = "";

	for (int i = 0; i < s.length(); i++) {
	    for (int j = i + 1; j <= s.length(); j++) {
		substring = s.substring(i, j);
		System.out.println(substring);

	    }
	}

    }

}
