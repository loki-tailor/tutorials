package com.logics.tu;

public class ExceptionHandling {
    int method() throws Exception {
	try {
	    throw new Exception();
	} catch (Exception e) {
	    return 10;
	} finally {
	    return 20;
	}

    }

    public static void main(String args[]) throws Exception {
	int i = new ExceptionHandling().method();
	System.out.println(i);
    }

}
