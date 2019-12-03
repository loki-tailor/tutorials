package com.logics.tu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateStrings {

    public static void main(String[] args) {
	String names[] = { "java", "c", "Python", "C++", "java" };
	Set<String> store = new HashSet<String>();
	for (String name : names) {
	    if (store.add(name) == false) {
		System.out.println(name);
	    }
	    // store.add(name);

	}
	Map<String, Integer> hm = new HashMap<String, Integer>();
	for (String s : names) {
	    Integer count = hm.get(s);
	    if (count == null) {
		hm.put(s, 1);
	    } else {
		hm.put(s, count + 1);
	    }
	    for (Entry<String, Integer> entry : hm.entrySet()) {
		if (entry.getValue() > 1) {
		    System.out.println(entry.getKey());
		}
	    }
	}

    }

}
