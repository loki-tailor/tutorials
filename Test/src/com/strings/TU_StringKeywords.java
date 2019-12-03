package com.strings;

public class TU_StringKeywords {

    public static void main(String[] args) {
	String s = "My Flipkart - online shopping App";
	String array[] = { "Flipkart Online Shopping App", "Flipkart Seller Hub", "Flipkart Online Shopping India", "Fonts for FlipFont Romance", "Fonts for FlipFont #19", "Fonts Script for FlipFont Free", "Fonts for FlipFont #15", "Fonts for FlipFont 50 #6", "Script 2 Fonts for FlipFont®", "Fonts for Galaxy FlipFont Free" };
	int index[] = new int[50];
	boolean flag = true;

	String arrOfStr[] = s.split(" ");
	for (int i = 0; i < arrOfStr.length; i++) {

	    for (int j = i + 1; j < arrOfStr[i].length(); j++) {
		String query = "";
		if (arrOfStr[i].length() > 1) {
		    query = arrOfStr[i].substring(0, j + 1);
		    System.out.println(query);
		    for (int k = 0; k < array.length; k++) {
			if (!array[i].contains(query)) {
			    flag = false;
			    System.out.println(array[i]);
			    break;

			}
		    }

		}

	    }

	}

    }

}
