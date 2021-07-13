package com.logics.t11._68;

interface Super { String name = "SUPER"; }

interface Sub extends Super {}

public class Test {
	public static void main(String[] args) {

		Sub sub = null;
		System.out.println(sub.name);

	}
}

/*-

Variable 'name' declared inside interface Super is implicitly public, static and final. Line n1 compiles successfully.

In Java a class can extend from only one class but an interface can extend from multiple interfaces. Line n2 compiles successfully.

Variable 'name' can be accessed in 2 ways: Super.name and Sub.name.

Though correct way to refer static variable is by using the type name, such as Sub.name but it can also be invoked by using Sub reference variable. Hence, sub.name at Line n3 correctly points to the name variable at Line n1.

For invoking static fields, object is not needed, therefore even if sub refers to null, sub.name doesn't throw NullPoionterException.

Test class compiles successfully and on execution prints SUPER on to the console.

*/