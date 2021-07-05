package com.generics;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GWildMethodPassingDemo2 {
	public static void main(String[] args) {

		// List<Number> l1 = new ArrayList<Integer>(); // error

		List<? extends Number> l2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));	
		System.out.println(" : " + total(l2));

		List l2_behind_the_scene = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));	
		System.out.println(" : " + total_behind_the_scene(l2_behind_the_scene));

		System.out.println("execution completed");
	}

	private static long total(List<? extends Number> list) {
		long count = 0;
		for(Number n : list) {
			System.out.print(count + " " );
			count += n.longValue();
		}
		return count;
	}

	private static long total_behind_the_scene(List list) {
		long count = 0;
		for(Object o : list) {
			Number n = (Number) o;
			System.out.print(count + " " );
			count += n.longValue();
		}
		return count;
	}
}