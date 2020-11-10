package com.logics;

/*- @created 04-11-2020
*/

import java.util.HashMap;

public class DuplicateCharCountInStr {
	public static void main(String[] args) {
		String str = "this is the string containg duplicate characters";
		HashMap<String,Integer> map = new HashMap<>();
		for(String s : str.split("")) {
			map.put(s,map.get(s) == null ? 1 : map.get(s) + 1);
		}
		System.out.println(map);
	}
}