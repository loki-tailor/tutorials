package com.logics.et1;


interface Account {
	public default String getId() { return "000"; }
}

interface PremiumAccount extends Account {
	
//	static String getId() { return "111"; } // error
	
//	String getId(); // no error
	
//	default String getId() { return "111"; } // no error
	
//	abstract static String getName(); // error, if static was absent the valid
	
//	static String getName(); // error
	
//	default String getName(); // error
}

public class _69 {

}
