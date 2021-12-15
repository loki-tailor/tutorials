package com.logics.et5;

public class _29 {
	String s1 = "green mile"; // 0

	public void generateReport(int n) {
		String local; // 1
		if (n > 0)
			local = "good"; // 2
		else
			local = "bad"; // if this else is not there, then below usage of 'local' will give error
		System.out.println(s1 + " = " + local);
	}

}
