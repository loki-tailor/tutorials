package com.constructors;

/**
 * @author lokeshwar @created June 12, 2020
 * 
 *         https://beginnersbook.com/2013/12/java-private-constructor-example/
 * 
 *         This demonstrates the use of private constructors to restrict
 *         creation of objects and ensure that only one object is created at a
 *         time
 * 
 *         Demonstration of: Private Constructors
 */

public class PrivateConstructor {
    public static void main(String[] args) {
	SingletonClass obj1 = SingletonClass.createObject();
	System.out.println("Object 1 created as - " + obj1);

	SingletonClass obj2 = SingletonClass.createObject();
	System.out.println("Object 2 created as - " + obj2);
    } // end of main

} // end of class

class SingletonClass {
    private static SingletonClass obj = null;

    // public SingletonClass() {
    // System.out.println("inside pubclic constructor");
    // }

    // SingletonClass() {
    // System.out.println("inside default constructor");
    // }

    // Error: The constructor SingletonClass() is not visible
    private SingletonClass() {
	// this will prevent instantiation of this class
	System.out.println("inside private constructor");
    }

    public static SingletonClass createObject() {
	if (obj == null) {
	    obj = new SingletonClass();
	}
	return obj;
    }

    public void display() {
	System.out.println("Inside display method of " + this.getClass().getSimpleName());
    }

}
