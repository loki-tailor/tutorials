package com.logics.et4;

import java.io.IOException;

public class _24 {
	public static void main(String[] args) {
		try {
			amethod();
			System.out.println("try ");
		} catch (Exception e) {
			System.out.println("catch ");
		} finally {
			System.out.println("finally ");
		}
		System.out.println("out ");
	}

//	public static void amethod() {}
	public static void amethod() throws IOException { throw new IOException(); }
}
