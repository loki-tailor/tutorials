package com.generics;

import java.util.List;
import java.util.ArrayList;

public class GWildMethodPassingInInterfaceSuper {
	public static void main(String... args) {

		List<String> strList = new ArrayList<>();
		strList.add("tweet");

		List<Object> objList = new ArrayList<>(strList);

		readSound(strList);
		readSound(objList);
		System.out.println();
		
		addSound(strList);
		addSound(objList);

		System.out.println("execution completed");
	}

	private static void readSound(List<? extends Object> list) {
		System.out.println("read as - " + list);
		// list.add("quack"); // error
	}

	private static void addSound(List<? super String> list) {
		System.out.println("read as - " + list);
		list.add("quack");
		System.out.println("new read - " + list);
	}
}