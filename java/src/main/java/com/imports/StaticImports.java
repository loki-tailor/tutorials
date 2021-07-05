package com.imports;

//static import java.lang.Integer.*;
// Below compile error comes when above is uncommented and compiled
// com/temp/Temp.java:3: error: class, interface, or enum expected
// static import java.lang.Integer.*;
//      ^
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.toHexString;

public class StaticImports {

    public static void main(String[] args) {
	System.out.println(MAX_VALUE);
	System.out.println(toHexString(16));
    }

} // end of class
