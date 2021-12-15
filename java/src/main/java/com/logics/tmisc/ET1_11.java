package com.logics.tmisc;
/*
 * created @ Wed Aug 18 2021 6:32:16 pm
 * ref @ 
 */

public class ET1_11 {
	public static void main(String[] args) {
		String myStr = "good";
		char[] myCharArr = { 'g', 'o', 'o', 'd' };

		String newStr = null;
		for (char ch : myCharArr) {
			newStr += ch;
		}
		System.out.println("newStr = " + newStr + ", myStr = " + myStr);
		System.out.println((newStr == myStr) + " " + (newStr.equals(myStr))); // false false
	}
}
