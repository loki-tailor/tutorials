package com.exceptions_and_errors;

import java.io.EOFException;

/*- @ created = 18-05-21 */

public class EOFexcept {
	public static void demo(String[] args) throws EOFException  {
		func();
	}

	public static int func() throws EOFException {
		return 1;
	}
}
