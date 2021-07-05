package com.modifiers.finalMethods;

/*-
	created @ 29-03-20
	@author lokeshwar
	
	Demo'ing "Final Methods" pg. 44, Sierra bk on OCAJP
*/

public class SuperClass {

	public final void showSample() {
		System.out.println("One thing.");
	} // end of method

} // end of class


class SubClass extends SuperClass {
	
    	// below will give compile error 
	// public void showSample() { System.out.println("Another thing."); } // end of method	


	// below won't give compilation error, since we are doing method overloading
	public void showSample(String s) {
		System.out.println("Another thing.");
	}
	
} // end of SubClass

/*- COMPILATION ERROR will come since we are trying to override a final method

	com/modifiers/finalMethods/SuperClass.java:21: error: showSample() in SubClass cannot override showSample() in SuperClass
		public void showSample() {
			    ^
	  overridden method is final
	1 error
*/
