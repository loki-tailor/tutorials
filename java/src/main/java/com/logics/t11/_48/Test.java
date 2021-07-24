package com.logics.t11._48;

import java.io.IOException;
import java.sql.SQLException;

interface Multiplier {
	void multiply(int... x) throws SQLException;
}

class Calculator implements Multiplier {

	// public void multiply (int... x) throws ___ {}

	// public void multiply (int... x) {} // no error

	// public void multiply (int... x) throws Throwable {} // error Exception Throwable is not compatible with throws clause in Multiplier.multiply(int[])

	// public void multiply (int... x) throws SQLWarning {} // no error

	// public void multiply (int... x) throws Exception {} // error: Exception Exception is not compatible with throws clause in Multiplier.multiply(int[])Java(67109266)

	// public void multiply (int... x) throws java.io.IOException {} // error: Exception IOException is not compatible with throws clause in Multiplier.multiply(int[])Java(67109266)

	// public void multiply (int... x) throws IOException {} // ERROR

	// public void multiply (int... x) throws NullPointerException {} // NO-ERROR

	// public void multiply (int... x) throws RuntimeException {} // NO-ERROR

	// public void multiply (int... x) throws SQLException {} // NO ERROR

	// public void multiply(int... x) throws Error {} // NO -ERROR
}

public class Test {
	public static void main(String[] args) {
		try {

			Multiplier obj = new Calculator();
			obj.multiply(1, 2, 3);

		} catch(SQLException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}
	}
}
