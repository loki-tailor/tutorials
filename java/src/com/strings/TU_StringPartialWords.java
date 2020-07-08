package com.strings;

public class TU_StringPartialWords {

    public static void main(String[] args) {
	String s = "My Flipkart - online shopping App";

	String arrOfStr[] = s.split(" ");
	for (int i = 0; i < arrOfStr.length; i++) {
	    if (arrOfStr[i].length() > 2) {
		String query = "";
		for (int j = i + 1; j < arrOfStr.length; j++) {
		    if (arrOfStr[j].length() > 1) {
			query = query + arrOfStr[i] + " " + arrOfStr[j].substring(0, 3);
			System.out.println(query);

		    }
		    query = "";
		}

	    }
	}

    }

}
