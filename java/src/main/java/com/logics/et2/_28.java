package com.logics.et2;

public class _28 {
	public static void main(String[] args) {

		System.out.println(Boolean.parseBoolean("true") == true);

		System.out.println(Boolean.parseBoolean("TrUe") == new Boolean(null));

		System.out.println(new Boolean("TrUe") == new Boolean(true));

	}
}
