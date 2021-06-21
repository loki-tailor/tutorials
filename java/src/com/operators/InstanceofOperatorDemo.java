package com.operators;

public class InstanceofOperatorDemo {
	public static void main(String[] args) {
		String name = null;

		boolean a = false;
		boolean b = false;

		a = name instanceof String;
		b = null instanceof Object;
		System.out.println(a + " : " + b);

		name = "lokeshwar";

		a = name instanceof String;
		b = null instanceof Object;
		System.out.println(a + " : " + b);

		name = null;

		boolean c = String.class.isInstance(name);
		System.out.println("c = " + c);

		System.out.println("loki".equals(name));
		System.out.println(name.equals("loki"));

	}
}
