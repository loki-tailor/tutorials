package com.generics;

import java.util.List;
import java.util.ArrayList;

/***
	@ref: https://stackoverflow.com/questions/2776975/how-can-i-add-to-list-extends-number-data-structures 
*/

public class GWildCrdDemo2 {

	public static void main(String[] args) {

		// ############################################################################################################
		// ## declaration phase
		
		// List<Number> listNum_ListDouble = new ArrayList<Double>(); // error - can assign only exactly <Number>

		List<? extends Number> listExtendsNum_ListNum = new ArrayList<Number>();
		List<? extends Number> listExtendsNum_ListDouble = new ArrayList<Double>();
		List<? extends Number> listExtendsNum_ListInteger = new ArrayList<Integer>();

		List<? super Number> listSuperNum_ListObj = new ArrayList<Object>(); // no error
		List<? super Number> listSuperNum_ListNum = new ArrayList<Number>(); // no error
		// List<? super Number> listSuperNum_ListDouble = new ArrayList<Double>(); //  error: Double is not a superclass of Number
		// List<? super Number> listSuperNum_ListInteger = new ArrayList<Integer>(); //  error : Integer is not a superclass of Number

		// List<Integer> listInteger_ListNum = new ArrayList<Number>(); // error - can assign only exactly <Integer>
		List<Integer> listInteger_ListInteger = new ArrayList<Integer>(); 
		// List<Integer> listInteger_ListDouble = new ArrayList<Double>(); // error - can assign only exactly <Integer>

		List<? extends Integer> listExtendsInteger_ListInteger = new ArrayList<Integer>();

		List<? super Integer> listSuperInteger_ListNumber = new ArrayList<Number>();
		List<? super Integer> listSuperInteger_ListInteger = new ArrayList<Integer>();
		// List<? super Integer> listSuperInteger_ListDouble = new ArrayList<Double>();  // error : Double is not superclass of Integer

		// ############################################################################################################
		// ## assignment phase
		
		// These next 3 are compile errors for the same reason: You don't know what kind of List<T> is really
		// being referenced - it may not be able to hold an Integer. You can't add anything (not Object, Number, Integer, nor Double) to List<? extends Number> 

		// listExtendsNum_ListNum.add(10); // error: incompatible types: int cannot be converted to CAP#1
		// listExtendsNum_ListDouble.add(10.0); 	
		// listExtendsNum_ListInteger.add(200);

 
		listSuperNum_ListObj.add(10);
		listSuperNum_ListObj.add(10.0);
		// listSuperNum_ListObj.add("10"); // error, as LHS says that only Number should be added
		// listSuperNum_ListObj.add(true); // error
		// listSuperNum_ListObj.add(new Object()); // error

		listSuperNum_ListNum.add(10);
		listSuperNum_ListNum.add(10.23);

		listInteger_ListInteger.add(10);
		// listInteger_ListInteger.add(10.23); // error

		// This fails for same reason above - you can't guarantee what kind of List the var is really pointing to
		// listExtendsInteger_ListInteger.add(10); //  error - can't add Integer to *possible* List<X> that is only allowed to hold X's

		listSuperInteger_ListNumber.add(3);      // ok - allowed to add Integer to List<Integer>, List<Number>, or List<Object>
		listSuperInteger_ListInteger.add(3);     // ok - allowed to add Integer to List<Integer>, List<Number>, or List<Object>		
		// listSuperInteger_ListInteger.add(3.14); // error

		// ############################################################################################################

		
	}
}