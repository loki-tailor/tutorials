package com.logics.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap_CharRepeatingMoreThanOnce {

    public static void main(String[] args) {

	String s = "Hello World";
	s = s.replaceAll(" ", "");
	Map<Character, Integer> numChars = new LinkedHashMap<Character, Integer>();

	for (int i = 0; i < s.length(); i++) {
	    char charAt = s.charAt(i);
	    if (!numChars.containsKey(charAt)) {
		numChars.put(charAt, 1);
	    } else {
		numChars.put(charAt, numChars.get(charAt) + 1);
	    }
	}

	for (Entry<Character, Integer> entry : numChars.entrySet()) {
	    if (entry.getValue() > 1) {
		System.out.println(entry.getKey());
		break;

	    }
	}

    }

}
