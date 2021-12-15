package com.logics.tmisc;

import java.io.File;

class StringWrapper {
	private String val;

	public StringWrapper(String str) {
		this.val = str;
	}
}

public class ET1_33 {
	public static void main(String[] args) {
		StringWrapper sw = new StringWrapper("lokeshwar");
		StringBuilder sb = new StringBuilder("lokeshwar");
		Object o = new Object();
		File f = new File("");

		System.out.println("Hello, " + sw);
		System.out.println("Hello, " + sb);
		System.out.println("Hello, " + o);
		System.out.println("Hello, " + f);
	}
}
