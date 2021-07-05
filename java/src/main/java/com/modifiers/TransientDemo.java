package com.modifiers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*-
	@author = lokeshwar
	@created = 14-12-19
	
	A sample class that uses transient keyword to skip their serialization
	ref = https://www.geeksforgeeks.org/transient-keyword-java/
	
	* The 'transient modifier applies only to instance variable
*/
import java.io.Serializable;
import java.util.Date;

public class TransientDemo implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;

    // Making password transient for security
    private transient String password = "default";

    // Making age transient as age is auto-computable from DOB and current date
    transient int age;

    // serialize other fields
    private String username, email;
    Date dob;

    // normal variables
    int i = 10, j = 20;

    // transient variable
    transient int k = 30;

    // user of transient has no impact here
    transient static int l = 40;
    transient final int M = 50;

    public static void main(String[] args) {
	TransientDemo transientDemo = new TransientDemo();
	try {
	    // serialization
	    FileOutputStream fos = new FileOutputStream("serializedData.txt"); // file created on dir up of
									       // com.modifiers
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(transientDemo);
	    System.out.println("i = " + transientDemo.i + " - normal variable");
	    System.out.println("j = " + transientDemo.j + " - normal variable");
	    System.out.println("k = " + transientDemo.k + " - transient int variable");
	    System.out.println("l = " + transientDemo.l + " - transient static int variable");
	    System.out.println("m = " + transientDemo.M + " - transient final int variable");
	    System.out.println("Serialization done. Object : " + transientDemo + "\n");

	    // deserialization
	    FileInputStream fis = new FileInputStream("serializedData.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    TransientDemo readObj = (TransientDemo) ois.readObject();
	    System.out.println("i = " + readObj.i + " - normal variable");
	    System.out.println("j = " + readObj.j + " - normal variable");
	    System.out.println("k = " + readObj.k + " - transient int variable");
	    System.out.println("l = " + readObj.l + " - transient static int variable");
	    System.out.println("m = " + readObj.M + " - transient final int variable");
	    System.out.println("De-serialization done. Object : " + readObj);

	} catch (Exception e) {
	    e.printStackTrace();
	}
    } // end of method
} // end of class
