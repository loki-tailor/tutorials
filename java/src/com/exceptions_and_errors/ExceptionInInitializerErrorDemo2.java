package com.exceptions_and_errors;

/*- @created  05-11-2020
*/

import com.exceptions_and_errors.*;

public class ExceptionInInitializerErrorDemo2 {
	public static void main(String[] args) {
		ExceptionInInitializerErrorDemo demo = new ExceptionInInitializerErrorDemo();

		/*- above will give belowo exception: 

		Exception in thread "main" java.lang.ExceptionInInitializerError
        at com.exceptions_and_errors.ExceptionInInitializerErrorDemo2.main(ExceptionInInitializerErrorDemo2.java:10)
Caused by: java.lang.RuntimeException
        at com.exceptions_and_errors.ExceptionInInitializerErrorDemo.initializeVar(ExceptionInInitializerErrorDemo.java:27)
        at com.exceptions_and_errors.ExceptionInInitializerErrorDemo.<clinit>(ExceptionInInitializerErrorDemo.java:18)
        ... 1 more

		*/
	}
}