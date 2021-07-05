package com.logics.t1;

//Guest.java
class Message {
	static void main(String[] args) {
		System.out.println("Welcome! " + args[1]);
	}
}

public class _12_Guest {
	public static void main(String[] args) {
		Message.main(args);
	}
}

/***
 * Explanation Class Guest has special main method but main method defined in
 * Message class is not public and hence it can't be called by JVM. But there is
 * no issue with the syntax hence no compilation error.
 * 
 * java Guest James Gosling passes new String [] {"James", "Gosling"} to args of
 * Guest.main method.
 * 
 * Guest.main method invokes Message.main method with the same argument: new
 * String [] {"James", "Gosling"}. args[1] is "Gosling" hence "Welcome! Gosling"
 * gets printed on to the console.
 */