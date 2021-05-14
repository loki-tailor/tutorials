package com.logics.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TU_RemoveDuplicateHashSet {

    public static void main(String[] args) {
	List<Integer> l = new ArrayList<Integer>();
	l.add(6);
	l.add(2);
	l.add(3);
	l.add(5);
	l.add(1);
	l.add(3);
	// Collections.sort(l);
	System.out.println(l);

	Set<Integer> s = new HashSet<Integer>();
	for (Integer i : l) {
	    s.add(i);
	}
	System.out.println(s);
    }

}
