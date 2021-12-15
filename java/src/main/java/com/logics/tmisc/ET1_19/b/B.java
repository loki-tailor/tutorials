package com.logics.tmisc.ET1_19.b;

import com.logics.tmisc.ET1_19.a.A;

public class B extends A {
// even if this class contains no content, below error will come:
//	Implicit super constructor A() is not visible for default constructor. Must define an explicit constructor

	B() {
	} // above error will come

	public void print() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		new B();
	}

}

/*-
 * Note that there is no modifier for A's constructor. So it has default access. This means only classes in package a can use it. Also note that class B is in a different package and is extending from A. In B's constructor the compiler will automatically add super() as the first line. But since A() is not accessible in B, this code will not compile.
 * */
