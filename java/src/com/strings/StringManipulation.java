package com.strings;

public class StringManipulation {

    public static void main(String[] args) {
	String stringJsonResponseBody = "[ddjdljj]";
	String s = "{\"list\":" + stringJsonResponseBody + "}";
	// s= s.replaceAll("\\W"," ");
	System.out.println(s);
	// for(int i=0;i<a.length;i++)
	// {
	// System.out.print(a[i].trim()+" ");
	// }
    }

}
