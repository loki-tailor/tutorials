package com.logics.tu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountMinMaxChars {

    public static void main(String[] args) {
	String s = "grass on the other side always looks greener";
	char ch[] = s.toCharArray();
	Map<Character, Integer> hm = new HashMap<Character, Integer>();

	for (int i = 0; i < ch.length; i++) {
	    if (ch[i] != ' ') {
		if (!hm.containsKey(ch[i])) {
		    hm.put(ch[i], 1);
		} else {
		    hm.put(ch[i], hm.get(ch[i]) + 1);
		}
	    }
	}

	List<Integer> l = new ArrayList<Integer>();
	for (Entry<Character, Integer> entry : hm.entrySet()) {

	    l.add(entry.getValue());

	}
	Collections.sort(l);
	System.out.println(l.get(0));
	System.out.println(l.get(l.size() - 1));

    }

}
