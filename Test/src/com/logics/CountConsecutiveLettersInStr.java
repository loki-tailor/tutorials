package com.logics;

public class CountConsecutiveLettersInStr {

    public static void main(String[] args) {
	String s = "abbbbczzzzzaaaeefe";
	char c[] = s.toCharArray();

	String x = "";
	int j = 1;

	for (int i = 0; i < s.length(); i++) {
	    if (i == c.length - 1) {
		x = x + c[i] + j;
	    } else {
		if (c[i] == c[i + 1])

		{
		    j++;
		} else {
		    x = x + c[i] + j;
		    j = 1;
		}
	    }
	}

	System.out.println(x);

    }

}
