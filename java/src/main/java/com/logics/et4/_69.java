package com.logics.et4;

import java.util.ArrayList;
import java.util.List;

public class _69 {
	public static void main(String[] args) {
		String[] sa = new String[10];
		Object[] oa = sa;
		oa[0] = new Integer(10);
		
		List<String> s  = new ArrayList<>();
		List<Object> o = s;
		
	}
}
