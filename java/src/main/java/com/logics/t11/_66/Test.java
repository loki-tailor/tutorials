package com.logics.t11._66;

class Shape {
	int side = 0;
	int getSlide() { return side; }
}

class Square extends Shape {
	private int side = 4;
	protected int getSlide() { return side; }
}

public class Test {
	public static void main(String[] args) {
		Shape s = new Square();
		System.out.println(s.side + ":" + s.getSlide()); // 0:4
	}
}

/*-

so basically,

If reference is super-type
And instance is sub-type
Then calling a variable which is present in both super & sub
When that variable is default in super & private in sub

So, even though instance is of sub-type
But since reference is of super-type

Hence, super-type.[variable] is allowed


*/