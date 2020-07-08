package com.logics.tu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
	String s = "Java";
	Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>();

	for (int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    if (!counts.containsKey(c)) {
		counts.put(c, 1);
	    } else {
		counts.put(c, counts.get(c) + 1);
	    }
	}
	for (Entry<Character, Integer> entry : counts.entrySet()) {
	    if (entry.getValue() == 1) {
		System.out.println(entry.getKey());
		break;
	    }
	}

    }

}
