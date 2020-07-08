package com.inheritance;

import java.io.IOException;
import java.io.InterruptedIOException;

/*-
 * 	@author lokeshwar @created 07-07-20
 * 
 * 	CASE-1:
 * 	"The overriding method must NOT throw checked exceptions that are 
 * 	new or broader than those declared by the overridden method."
 * 
 * 	CASE-2:
 * 	"The overriding method can throw narrower or fewer exceptions."
 * 
 * 	CASE-3:
 * 	"Bottom line: An overriding method doesn't have to declare any exceptions 
 * 	that it will never throw, regardless of what the overridden method declares"
 */

public class ExceptionsInOverriddenMethods extends SuperClass {
    // CASE-1: <exception> Exception is not compatible with throws clause in SuperClass.method1()
    // public void method1() throws Exception {}
    // public void method1() throws InterruptedIOException {}
    
    // CASE-2: no err
    // public void method1() throws IOException {}
    
    // CASE-3: no err
    public void method1() {}
}

class SuperClass {
    public void method1() throws IOException {}
}