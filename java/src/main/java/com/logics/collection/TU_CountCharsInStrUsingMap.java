package com.logics.collection;

import java.util.HashMap;
import java.util.Map;

public class TU_CountCharsInStrUsingMap {

    public static void main(String[] args) {
	String s = "Java Programming";
	s = s.replaceAll(" ", "");
	Map<Character, Integer> charmap = new HashMap<Character, Integer>();

	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (charmap.containsKey(ch)) {
		charmap.put(ch, charmap.get(ch) + 1);
	    } else
		charmap.put(ch, 1);

	}
	System.out.println(charmap);

    }

}
