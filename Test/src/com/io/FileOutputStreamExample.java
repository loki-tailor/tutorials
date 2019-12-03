package com.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String args[]) {
	try {
	    FileOutputStream fout = new FileOutputStream("/home/anita/Music/IO/demo.txt");
	    String s = "Welcome to javaTpoint...hello";
	    byte b[] = s.getBytes();// converting string into byte array
	    fout.write(b);
	    fout.close();
	    System.out.println("success...");
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}