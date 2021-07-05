package com.logics.t1;

import java.util.ArrayList;
import java.util.List;

public class _04_Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(2));
		list.add(new Integer(1));
		list.add(new Integer(0));

		list.remove(list.indexOf(0));

		System.out.println(list);
	}
}

/**
 * Explanation remove method of List interface is overloaded: remove(int) and
 * remove(Object).
 * 
 * indexOf method accepts argument of Object type, in this case list.indexOf(0)
 * => 0 is auto-boxed to Integer object so no issues with indexOf code.
 * list.indexOf(0) returns 2 (index at which 0 is stored in the list). So
 * list.remove(list.indexOf(0)); is converted to list.remove(2);
 * 
 * 
 * 
 * remove(int) version is matched, it's a direct match so compiler doesn't do
 * auto-boxing in this case. list.remove(2) removes the element at index 2,
 * which is 0.
 * 
 * 
 * 
 * Hence in the output, you get [2, 1].
 */