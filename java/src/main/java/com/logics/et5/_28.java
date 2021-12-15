package com.logics.et5;

public class _28 {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("abc");
		StringBuilder sbl = new StringBuilder("abc");

		System.out.println(sbf + " : len = " + sbf.length());
		System.out.println(sbl + " : len = " + sbl.length());

		sbf.setLength(2);
		sbl.setLength(2);
		System.out.println();
		System.out.println("after *.setLength(2)");
		System.out.println(sbf + " : len = " + sbf.length());
		System.out.println(sbl + " : len = " + sbl.length());

		sbf.setLength(5);
		sbl.setLength(5);

		System.out.println();
		System.out.println("after *.setLength(5)");
		System.out.println(sbf + " : len = " + sbf.length());
		System.out.println(sbl + " : len = " + sbl.length());

	}

}
