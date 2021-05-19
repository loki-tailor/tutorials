package com.exceptions_and_errors;

/*-

	@created 14-07-20

	ref: https://javaconceptoftheday.com/classnotfoundexception-vs-noclassdeffounderror-in-java/

	* Both ClassNotFoundException and NoClassDefFoundError occur when a particular class is not found at run time. 

	* But, they occur at different scenarios. 

	* ClassNotFoundException is an exception which occurs when you try to load a class at run time using 
	Class.forName() or loadClass() methods and mentioned classes are not found in the classpath. 

	* NoClassDefFoundError is an error which occurs when a particular class is present at compile time but it was missing at run time.

*/

// NOTE: Once compiled, delete the A.class file, to reproduce the 'NoClassDefFoundError

class A {}

public class DemoNoClassDefFoundError {
	public static void main(String[] args) {
		new A();
	}
}

/*-

OUTPUT:

Exception in thread "main" java.lang.NoClassDefFoundError: com/exceptions_and_errors/A
	at com.exceptions_and_errors.DemoNoClassDefFoundError.main(DemoNoClassDefFoundError.java:26)
Caused by: java.lang.ClassNotFoundException: com.exceptions_and_errors.A
	at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	... 1 more
*/
