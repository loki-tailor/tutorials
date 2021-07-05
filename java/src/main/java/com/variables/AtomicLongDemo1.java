package com.variables;

import java.util.concurrent.atomic.AtomicLong;

/*-
 * 
 * @author lokeshwar @created July 03, 2020
 * 
 * 
 * 
 */
public class AtomicLongDemo1 {

    public static void main(String[] args) {

	AtomicLong al1 = new AtomicLong();
	AtomicLong al2 = new AtomicLong(123);
	al1.set(345);
	System.out.println(al2);
	System.out.println(al1);
	
	// compareAndSet Demo
	long expectedValue = 123;
	long newValue = 234;
	al2.compareAndSet(expectedValue, newValue);
	
	System.out.println(al2);
    }

}
