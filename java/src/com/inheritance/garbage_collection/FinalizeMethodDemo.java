package com.garbage_collection;

/*
	@created August 11, 2020

	NOTE: Unless, System.gc() is not called, the finalize() method is not invoked.

	https://stackoverflow.com/a/51011172/7415499
	I'd like to add that finalize is deprecated since Java 9. – Zabuzard Jun 24 '18 at 15:13

	----------------------------------------------
	OUTPUT :

	PS F:\git\tutorials\java\src> java com.garbage_collection.FinalizeMethodDemo
	Total JVM Memory = 188416
	before obj creation : Free  JVM Memory = 186449
	after obj creation : Free  JVM Memory = 158923
	end of garbage collection
	in finalize method : Free  JVM Memory = 159799
	finalize method called
	----------------------------------------------
*/

public class FinalizeMethodDemo {
	 public static void main(String[] args)  
    {   Runtime rt = Runtime.getRuntime();	
		System.out.println("Total JVM Memory = " + rt.totalMemory()/(1024));
		System.out.println("before obj creation : Free  JVM Memory = " + rt.freeMemory()/(1024));
		FinalizeMethodDemo obj  = null;
		for(int i=0; i<500000; i++) {
        obj = new FinalizeMethodDemo();   
        // System.out.println(obj.hashCode());   
		}
		System.out.println("after obj creation : Free  JVM Memory = " + rt.freeMemory()/(1024));		
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
    @Override  
    protected void finalize()   
    {   
		System.out.println("in finalize method : Free  JVM Memory = " + Runtime.getRuntime().freeMemory()/(1024));
        System.out.println("finalize method called");   
    }  
}