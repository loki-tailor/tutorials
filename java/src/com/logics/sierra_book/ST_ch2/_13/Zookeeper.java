package com.logics.sierra_book.ST_ch2._13;

/*- 
	@created 18-07-20

	What is the result?
	v - furry bray
		x - stripes bray
		x - furry generic noise
		x - stripes generic noise
		x - Compilation fails
		x - An exception is thrown at runtime

	"Polymorphism is only for instance method and not instance variables"
*/

class Mammal {
	String name = "furry ";
	String makeNoise() { return "generic noise"; }
}

class Zebra extends Mammal {
	String name = "stripes ";
	String makeNoise() { return "bray "; }
}

public class Zookeeper {
	public static void main(String[] args) { new Zookeeper().go(); }
	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name + m.makeNoise());
	}
}
