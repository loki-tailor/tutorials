package com.logics.tmisc;

public class ET1_26 {
	public static void main(String[] args) throws Exception {
		try {
			m1();
			System.out.println("A");
		} 
		
//		catch (Exception e) { System.out.println("B"); }
		
		finally { System.out.println("C"); }
		
		
		System.out.println("D");
	}

	public static void m1() throws Exception {
		throw new Exception();
	}
}
