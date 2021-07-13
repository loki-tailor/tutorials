package com.logics.t11._70;

public class Test {
	public static void main(String[] args) {
		java.util.List<Integer> list = new java.util.ArrayList<>();
		byte b = 10;
		list.add(b); // The method add(Integer) in the type List<Integer> is not applicable for the arguments (byte)Java(67108979)
		int mul = list.get(0) * list.get(0);
		System.out.println(mul);
		System.out.println("done");
	}
}