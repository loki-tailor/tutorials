package com.lambda_expressions;

/**

	created @ 26-01-2020
	@author lokeshwar
*/

interface Secret {
	String magic(double d);
}

class Demo6 implements Secret {
	public String magic (double d) {
		return "Poof in func";
	}
	public static void main(String[] args) {
		// Secret d = (e) -> { String e = ""; return "Poof" }; // INVALID
		// Secret d = (e) -> { "Poof" }; // INVALID
		// Secret d = (e) -> "Poof inside lambda"; // VALID
		// Secret d = e -> { String e = ""; "Poof" }; // INVALID*
		// Secret d = (e) -> { String e = ""; return "Poof"; }; // INVALID
		//  Secret d = (e) -> { String f = ""; return "Poof in lambda"; }; // VALID
		System.out.println(d.magic(10));
	}
}	