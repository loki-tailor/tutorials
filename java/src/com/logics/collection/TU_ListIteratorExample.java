package com.logics.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TU_ListIteratorExample {

    public static void main(String[] args) {

	List<String> l1 = Arrays.asList("lokeshwar".split(""));

	ListIterator<String> itr = l1.listIterator(l1.size());
	while (itr.hasPrevious()) {

	    System.out.println(itr.previous());

	}

	System.out.println();
	Iterator<String> itr2 = l1.iterator();
	l1.forEach(a -> {
	    System.out.print(a + " ");
	});
    }

}
