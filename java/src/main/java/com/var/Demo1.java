package com.var;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	// ===================================================================================================
	// var invalid_var = "loki"; // compile error var is not allowed here

	// final var invalid_final_var; // compie error: var is not allowed here

	// ===================================================================================================
	{
		var num = 1.0; System.out.println("initialization block: var num = 1.0; @ " + num);	

		// if 'num' is double, 
		// then compile error for below: double cannot be deferenced
		// System.out.println("initialization block: var = " + num + ", type = " + num.getClass());  

		// if 'num' is double,
		// then compile error for below: unexpected type, required 'reference' found 'double'
		// System.out.println("initialization block: var = " + num + ", type = " + (num instanceof Double));
	}

	// ===================================================================================================
	static {
		var num = 1.0; System.out.println("static initialization block: var num = 1.0; @ " + num);	

	}

	// ===================================================================================================
	Demo1() {
		var name = "Main";

		System.out.println("constructor block: var value = " + name+ ", var type = " + name.getClass());
	}

	// ===================================================================================================
	public static void main(String[] args) {

		// #################################################################

		for (var i = 0; i < 10; i++) { }
		for(var arg : args) { }
		Demo1 d = new Demo1();

		// #################################################################		

		System.out.println("main method: execution completed");		

		// assigning value to a var variable other then initial one
		var d_d = 10.3; // no compile error
		d_d = 1; // no compile error

		// #################################################################

		var var = "var"; System.out.println("main method: permitted => var var = 'var'; @ " + var); // permitted :D
		// below will compile, if above is commented
		// having a variable with var as name is not illegal, why??
		// int var = 1; System.out.println("main method: int var = 1 @ " + var);
		var size = 7; System.out.println("main method: var size = 7 @ " + size);
		// static var static_var = "lokeshwar"; // compile error: illegal start of expression ; var is not allowed
		final var final_var = "lokeshwar"; System.out.println("main method: final var final_var = 'lokeshwar'; @ " + final_var);

		// #################################################################

		// var = "loki";  // if 'var' was earlier initialized as int, then compile error: string cannot be converted to int
		// size = "loki"; // incompatible types: string cannot be converted to int
		// final_var = "changed"; // cannot assign a value to final variable
		// var = 10.2; // if'var' was earlier initialized as int, then incompatible type, possible lossy conversion from double to int
		// size = 3.14; // incompatible type, possible lossy conversion from double to int
		// java.util.List<var> list = null; // var is not allowed here

		// below is possible, as in java a statement ends with a semi-colon
		var silly
			= "silly initialized on new line";

		// ## can't do points
		cant_do_points();

		var(); // call to 'var' method	
	}

	// ===================================================================================================

	private static void cant_do_points() {

		// #################################################################
		// ## var cannot be declared and then initialized separately
		// var loki; loki = "name";
		/*- above will give below compile error

			.\com\var\Demo1.java:60: error: cannot infer type for local variable loki
			                var loki; loki = "name";
			                    ^
			  (cannot use 'var' on variable without initializer)
		*/
		// #################################################################
		// cannot assign null to var
		//  var a = null; 
		/*- above will give below error:
			.\com\var\Demo1.java:88: error: cannot infer type for local variable a
			                var a = null;
			                    ^
			  (variable initializer is 'null')
		*/

		// allowed as null if type is mentionde
		var b = (String) null; // no compile error
	
		Integer c = null; 
		var e = c; // no compile error, as at compile time jvm is aware of the type of RHS for 'var e'
		// int d = null; compile error: <null> cannot be converted to int

		// ## allows an already declared var to null ; no error
		var f = "loki"; System.out.println("method_1 : var f = 'loki' @ " + f);
		f = null; System.out.println("method_1 : f = null @ " + f);

		// ## not allowed to make null, primitive types ; error
		var h = true;
		// h = null; // compile error: <null> cannot be converted to boolean

		// #################################################################
		// ## compound delcaration not allowed

		// var i=1, j=2; // compile error: var is not allowed in a compound declaration

		// int k=1, var l=2; // compile error: ';' expected	


		// #################################################################
		// ## var cannot be used to initialize array

		// var a[] = { 1, 2, 3 }; // error: var is not allowed as an element type of an array	
		// var a[] = (int[]) { 1, 2, 3 }; illegal start of expression	
		
		// below will not give compiler error
		int a1[] = { 1, 2, 3, 4 }; System.out.println("method_1 : int a1[] = { 1, 2, 3, 4 }; @ " + a1);
		var a2 = a1; System.out.println("method_1 : var a2 = a1; @ " + a2);

		// #################################################################
	}

	// #################################################################
	// ## var cannot be used in parameter type, return type & fields
	// private static vodi var_in_param_return(var a) {} // compile error: var is not allowed here
	//					    ^

	// private static var method_returns_var() { var i = 0; return i; } // compile error: var is not allowed here
	//		   ^

	private static int method_returns_var_from_int() { var i = 0; return i; } // no compile error
	//						    ^

	private static Object method_returns_obj_from_int() { var i = 0; return i; } // no compile error
	// 						       ^

	// #################################################################
	// ## var is a reserved type and not a reserved keyword
	// ## i.e. can be used as an identifier or in a package or method-name, but not as a class, interface, or enum name

	// String int = "10"; // error: identifier expected
	// String var = "10"; // permitted, no error


	// class Var {} // permitted, no error
	// class var {} // error: // error: 'var' is a restricted type name and cannot be used for type declarations

	// interface Var {} // same as above
	// interface var {} // same as above

	enum  Var {} // same as above
	// enum var {} // same as above

	private static void var() { System.out.println("var method: hello"); } // permitted: no error

	// #################################################################
	// ## var with diamond expression
	private static void var_with_diamond_expr() {
		// List<String> l1 = new ArrayList<var>(); // error: var is not allowed here
		var l2 = new ArrayList<>(); // list of type Object is created
		var l3 = new ArrayList<String>(); // list of type String is created
		var l4 = new ArrayList<>(l2); // object list
		var l5 = new ArrayList<>(l3); // String list
	}

	// #################################################################		
	// ## take care with 'var' and literals

	private static void var_with_literals() {
		
		boolean b = true;
		char ch = '\ufffd';
		long l = 0L;
		String s = "label";
		float f = 1.0f;
		double d = 3.0;

		var v_b = true; 	// boolean
		var v_ch = '\ufffd'; 	// char
		var v_l = 0L;		// long			
		var v_s = "label";	// string
		var v_f = 1.0f;		// float
		var v_d = 3.0;		// double

		// whole number inferred Integer
		byte flags = 0;
		short mask = 0x7fff;
		long base = 17;

		var v_flags = 0;		// int
		var v_flags_2 = (byte)0;	// byte
		var v_mask = 0x7fff; 		// int
		var v_base = 17;		// int
		

	}
}