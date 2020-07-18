package com.logics.sierra_book.ST_ch2._8;

/*-
	@created 18-07-2020

	What is the result?
		x - howl howl sniff
		x - howl woof sniff
		x - howl howl followed by an exception
		x - howl woof followed by an exception
		x - Compilation fails with an error at line 14
	v - Compilation fails with an error at line 15

	
	
*/

class Dog {
	public void bark() { System.out.print("woof "); }
}

class Hound extends Dog {
	public void sniff() { System.out.print("sniff "); }
	public void bark() { System.out.print("howl "); }
}

public class DogShow {
	public static void main(String[] args) { new DogShow().go(); }
	void go() {
		new Hound().bark();
		((Dog) new Hound()).bark(); // line 14
		((Dog) new Hound()).sniff(); // line 15: compilation error, since 'Dog' does not have 'sniff' method
	}
}
