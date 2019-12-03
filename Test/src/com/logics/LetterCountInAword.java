package com.logics;
import java.util.LinkedHashMap;
import java.util.Map;

public class LetterCountInAword {

    public static void main(String[] args) {

	String s = "Assessment";

	Map<Character, Integer> countChars = new LinkedHashMap<Character, Integer>();

	char ch[] = s.toCharArray();

	for (int i = 0; i < ch.length; i++) {

	    if (countChars.containsKey(ch[i])) {
		int c = countChars.get(ch[i]);
		countChars.put(ch[i], c + 1);
	    } else {
		countChars.put(ch[i], 1);
	    }
	}

	System.out.println(countChars);

    }

}
