package com.variables;

/***
 * 
 * @author lokeshwar @created June 17, 2020
 *
 *         IMP:
 * 
 *         The scope of a local variable that shadows a class variable doesn’t
 *         necessarily begin at the same point that the local variable’s scope
 *         begins. The shadowing begins when the local variable is declared, but
 *         the local variable’s scope doesn’t begin until the variable is
 *         initialized. If you attempt to access the variable between the
 *         declaration and the initialization, the Java compiler displays an
 *         error message.
 * 
 */

public class ShadowingDemo2 {

    static int x;

    public static void main(String[] args) {
	x = 5;
	System.out.println("x = " + x);
	int x;
	x = 10; // imp: if we comment this, compiler error will come
	System.out.println("x = " + x);
	System.out.println("ShadowingDemo2 .x = " + ShadowingDemo2.x);
    }
}