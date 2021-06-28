package com.generics;

import java.util.ArrayList;
import java.util.List;

// #######################################################################################################################################

public class Demo1 {
	public static void main(String[] args) {
		B.main(args);
	}
}

// #######################################################################################################################################

class B {
	static void printNames(List list) {
		for( int i = 0; i < list.size(); i++) {

			String name = (String) list.get(i);
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add(new StringBuilder("lokeshwar"));
		/*- above will give below error:
	
			.\com\generics\Demo1.java:27: error: incompatible types: StringBuilder cannot be converted to String
			                names.add(new StringBuilder("lokeshwar"));
			                          ^
			Note: .\com\generics\Demo1.java uses unchecked or unsafe operations.
			Note: Recompile with -Xlint:unchecked for details.
			Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
			1 error

		*/

		printNames(names);
	}
}

// #######################################################################################################################################

class A {
	
	static void printNames(List list) {
		for( int i = 0; i < list.size(); i++) {

			String name = (String) list.get(i);

			/*- above gives RunTimeException as below:
				Exception in thread "main" java.lang.ClassCastException: class java.lang.StringBuilder cannot be cast to class java.lang.String (java.lang.StringBuilder and java.lang.String are in module java.base of loader 'bootstrap')
				        at com.generics.Demo1.printNames(Demo1.java:10)
				        at com.generics.Demo1.main(Demo1.java:18)
			*/

			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		List names = new ArrayList();
		/*- above gives warning when: javac -Xlint:unchecked .\com\generics\Demo1.java
			.\com\generics\Demo1.java:17: warning: [unchecked] unchecked call to add(E) as a member of the raw type List
			                names.add(new StringBuilder("lokeshwra"));
			                         ^
			  where E is a type-variable:
			    E extends Object declared in interface List
			1 warning
		*/


		names.add(new StringBuilder("lokeshwra"));
		printNames(names);
	}
}

// #######################################################################################################################################