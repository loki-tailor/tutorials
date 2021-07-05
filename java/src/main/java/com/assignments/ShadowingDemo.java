package com.assignments;

/*-
	@created 03-08-2020

	-----------------------
	output:
	f.myBar.barNum is 28
	myBarNum in changeIt is 99
	myBarNum in changeIt is now 28
	f.myBar.barNum after changeIt is 99
	-----------------------
*/

class Bar {
	int barNum = 28;
}

class Foo {
	Bar myBar = new Bar();
	void changeIt(Bar myBar) {
		myBar.barNum = 99;
		System.out.println("myBarNum in changeIt is " + myBar.barNum);
		myBar = new Bar();
		System.out.println("myBarNum in changeIt is now " + myBar.barNum);	
	}
	public static void main(String args[]) {
		Foo f = new Foo();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);
		f.changeIt(f.myBar);
		System.out.println("f.myBar.barNum after changeIt is " + f.myBar.barNum);
	}
}