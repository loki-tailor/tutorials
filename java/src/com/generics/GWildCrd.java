package com.generics;

import java.util.List;
import java.util.ArrayList;

/***
	@ref https://stackoverflow.com/questions/2776975/how-can-i-add-to-list-extends-number-data-structures
*/

// ############################################################################################################
class GreatGrandParent {}
class GrandParent extends GreatGrandParent {}
class Parent extends GrandParent {}
class Child extends Parent {}

// ############################################################################################################
public class GWildCrd {
	public static void main(String[] args) {

		// ############################################################################################################

		// ## generic - exact match
		List<GrandParent> o1 = new ArrayList<GrandParent>();
				  o1 = new ArrayList<>();

		// ############################################################################################################
		// ## assigning P to GP
		// List<GrandParent> o2 = new ArrayList<Parent>(); // error: incompatible types: ArrayList<Parent> cannot be converted to List<GrandParent>

		// ############################################################################################################
		// ## wildcard : unbounded : assign 'any' to ?
		List<?> o3 = new ArrayList<Parent>();
			o3 = new ArrayList<String>();
			o3 = new ArrayList<Object>();
			o3 = new ArrayList<GrandParent>();
			o3 = new ArrayList<Child>();

		// ## unbounded assignments : 
		// ## nothing allowedd
		// o3.add("lokeshwar"); // error: incompatible types: String cannot be converted to CAP#1
		// o3.add(new Parent()); //  error: incompatible types: Parent cannot be converted to CAP#1
		// o3.add(new Object()); // error: incompatible types: Object cannot be converted to CAP#1



		// ############################################################################################################
		// ## wildcard : upperbounded : immutable
		// ## does ? extend GrandParent ??
		// ## read gurantee

		// ## You can't add any object to List<? extends T> because you can't guarantee what kind of List it is really pointing to, 
		// ## so you can't guarantee that the object is allowed in that List. 
		// ## The only "guarantee" is that you can only read from it and you'll get a T or subclass of T.

		List<? extends GrandParent> o4 = new ArrayList<Parent>();
					    o4 = new ArrayList<Child>();
					    o4 = new ArrayList<GrandParent>();
					    // o4 = new ArrayList<String>(); // error: incompatible types: ArrayList<String> cannot be converted to List<? extends GrandParent>
					    // o4 = new ArrayList<GreatGrandParent>(); // error: incompatible types: ArrayList<GreatGrandParent> cannot be converted to List<? extends GrandParent>

		// ## upperbounded assignments : immutable : nothing allowed
		// o4.add(new Parent());			// error: incompatible types: Parent cannot be converted to CAP#1
		// o4.add(new Child());				// error: incompatible types: Child cannot be converted to CAP#1
		// o4.add(new GrandParent());			// error: incompatible types: GrandParent cannot be converted to CAP#1
		// o4.add(new GreatGrandParent());		// error: incompatible types: GreatGrandParent cannot be converted to CAP#1
		// o4.add(new String());			// error: incompatible types: String cannot be converted to CAP#1
		// o4.add(new Object());			// error: incompatible types: Object cannot be converted to CAP#1
		// o4.add(1);					// error: incompatible types: int cannot be converted to CAP#1

		// ############################################################################################################
		// ## wildcard : lowerbounded
		// ## is ? super of Type: 
		// ## add gurantee

		// ## You can't read the specific type T (e.g. Number) from List<? super T> 
		// ## because you can't guarantee what kind of List it is really pointing to. 
		// ## The only "guarantee" you have is you are able to add a value of type T (or any subclass of T) 
		// ## without violating the integrity of the list being pointed to.

		List<? super Parent> o5 = new ArrayList<GrandParent>();
				     o5 = new ArrayList<GreatGrandParent>();
				     o5 = new ArrayList<Parent>();
				     o5 = new ArrayList<Object>();
				     // o5 = new ArrayList<Child>(); // error: incompatible types: ArrayList<Child> cannot be converted to List<? super Parent>
				     // o5 = new ArrayList<String>(); // error: incompatible types: ArrayList<String> cannot be converted to List<? super Parent>

		// ## lowerbounded assignment : NOT immutable : adding allowed
		// ## check: is ? immediate super of 'Type' or itself 'Type'or is ? a subclass of 'Type'
		o5.add(new Child()); 
		o5.add(new Parent());
		// o5.add(new GrandParent()); 	// error: incompatible types: GrandParent cannot be converted to CAP#1
		// o5.add(new GreatGrandParent()); // error: incompatible types: GreatGrandParent cannot be converted to CAP#1
		// o5.add(new Object()); // error: incompatible types: Object cannot be converted to CAP#1

		// ############################################################################################################


		System.out.println("execution completed");
	}
}