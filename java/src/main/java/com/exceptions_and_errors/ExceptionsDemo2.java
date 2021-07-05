package com.exceptions_and_errors;

/*- @created 01-11-2020
	
	--------------------------------------------------

	EXCEPTION MATCHING
	*	When an exception is thrown, Java will try to find (by looking at the 
		available catch clause from the top down) a catch clause for the exception type.
		If it doesn't find one, it will search for a handler for a supertype of the exception.
		If it doesn't find a catch clause that matches a supertype for the exception,
		then the exception is propagated down the call stack. This process is known as 
		Exception Matchings

	*	RandomAccessFile: Instances of this class support both reading and writing to a random access file. 
		A random access file behaves like a large array of bytes stored in the file system. 
		There is a kind of cursor, or index into the implied array

	--------------------------------------------------
*/


public class ExceptionsDemo2 {
	public static void main(String[] args) {
		try {
			java.io.RandomAccessFile raf = new java.io.RandomAccessFile("temp.txt","r");
			byte[] b = new byte[1000];
			raf.readFully(b,0,1000);
		} catch(java.io.FileNotFoundException e) {
			System.err.println("File not found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch(java.io.IOException e) {
			System.err.println("IO Error");
			System.err.println(e.toString());
			e.printStackTrace();
		}
	}
}