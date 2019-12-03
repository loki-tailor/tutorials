package com.logics.tu;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	String s = "";
	String output = "No";
	for (int i = a.length() - 1; i >= 0; i--) {

	    s = s + a.charAt(i);

	}
	if (s.equals(a)) {
	    output = "Yes";
	}
	System.out.println(output);
    }
}