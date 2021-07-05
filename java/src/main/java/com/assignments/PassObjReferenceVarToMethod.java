package com.assignments;

/*-
	@created 03-08-2020

	--------------------------------
	output:
	Before, d.height = 10
	dim.height = 11
	After, d.height = 11
	--------------------------------
*/

public class PassObjReferenceVarToMethod {
	public static void main(String[] args) {
		java.awt.Dimension d = new java.awt.Dimension(5,10);
		PassObjReferenceVarToMethod obj = new PassObjReferenceVarToMethod();
		System.out.println("Before, d.height = " + d.height);
		obj.modify(d);
		System.out.println("After, d.height = " + d.height);
	}	
	void modify(java.awt.Dimension dim) {
		dim.height += 1;
		System.out.println("dim.height = " + dim.height);
	}
}