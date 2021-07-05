package com.misc;

/***
 * 
 * @author lokeshwar @created July 04, 2020
 * 
 *         Reference:
 *         https://www.tutorialspoint.com/Covariant-return-types-in-Java
 *
 */

public class CovariantReturnTypeDemo extends SuperClass {       

    public static void main(String[] args) {
	SuperClass sc = new CovariantReturnTypeDemo();
	System.out.println(sc.get().getClass().getCanonicalName());
    }

    @Override
    SuperClass get() {
	System.out.println("Inside " + this.getClass().getCanonicalName() + "...");
	return this;
    }

}

abstract class SuperClass {
    abstract SuperClass get();
}