package com.logics.et2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class _29 {
	public static void main(String[] args) {
		Object o = null;
		Collection c = new ArrayList<>();
		int[][] ia = new int[1][];

		// #1
//		for(o : c) {} // invalid

		// #2
		final boolean checkifFinalIsAllowedHere = true;
		for (final Object o2 : c) {
		} // valid

		// #3
//		for(int i : ia) {} // invalid

		// #4
//		for (Iterator it : c.iterator()) { } // invalid
			
//		c.iterator() does not return any Collection. 
//		Note that the following would have been valid: 
		Collection<Iterator> c2 = new ArrayList<>();// some collection that contains Iterator objects
		for (Iterator it : c2) {
		}
		
		// #5
		for(int i : ia[0]) {}
	}
}
