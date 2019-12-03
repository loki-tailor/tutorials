package com.logics.tu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayPrintMissingElements {

    public static void main(String[] args) {
	int a[] = { 1, 1, 2, 3, 5, 5, 7, 9, 11 };
	Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	for (int i = 0; i < a.length; i++) {
	    map.put(a[i], 1);

	}
	for (Entry<Integer, Integer> entry : map.entrySet()) {
	    if (entry.getValue() == 1) {
		System.out.println(entry.getKey());
	    }
	}
    }

}
