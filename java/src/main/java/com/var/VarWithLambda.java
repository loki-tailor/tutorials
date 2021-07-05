package com.var;

import java.io.Serializable;
import java.util.function.Function;

import javax.annotation.Nonnull;

import java.util.function.BiFunction;

public class VarWithLambda {
	
	public static void main(String[] args) {
	
		// ------------------------------------------------

		Function<Integer, Integer> g = (@Nonnull Integer name) -> 1;

		// ## no compile error
		Function<Integer, Integer> f = (@Nonnull var name) -> 1;
		f.apply(10); f.apply(null);

		// ------------------------------------------------

		// ## compile error, as we don't know what will the function return
		// var f2 = (var name) -> 1; 
		/*- above will give compile error as :
			.\com\var\VarWithLambda.java:12: error: cannot infer type for local variable f2
			                var f2 = (var name) -> 1;
			                    ^
			  (lambda expression needs an explicit target-type)
			1 error
		*/

		// ------------------------------------------------
	
		// ## no compile error, as we are mentioning what will the function return
		var f2 = (Function<Integer,Integer>) (var f3) ->  1;	
	
		// ------------------------------------------------	

		// ## either both or either none should be var
		// BiFunction<Integer, Integer, String> f3 = (@NotNull var a, b) -> "lokeshwar";	
		/*- above will give below compile error:
			.\com\var\VarWithLambda.java:35: error: invalid lambda parameter declaration
			                BiFunction<Integer, Integer, String> f3 = (@NotNull var a, b) -> "lokeshwar";
			                                                          ^
			  (cannot mix 'var' and implicitly-typed parameters)
			1 error
		*/

		// ------------------------------------------------	

		// ## annotations can be used with 'var' reserved reference type
		BiFunction<Integer, Boolean, String> f4 = (@NotNull var a, var b) -> "lokeshwar"; 


		// ------------------------------------------------	
		// ## anon class vars not accessible outside it's body, if not 'var'
		// Anonymous Class
		Object o = new Object() {
			String name = "lokeshwar"; // not accessible outsite this inner class
			int total = 0; // not accessible outsite this inner class

			// final String name = "lokeshwar"; // not accessible outsite this inner class
			// final int total = 0; // not accessible outsite this inner class
		};
		// System.out.println("name = " + o.name + " ; total = " + o.total); // compile error cannot find symbol

		// ------------------------------------------------	
		// ## anon class variables accessible if declaration is 'var'
		var o2 = new Object() {
			// String name = "lokeshwar"; // no error
			// int total = 0; // no error

			final String name = "lokeshwar"; // no error
			final int total = 0; // no error
		};
		System.out.println("name = " + o2.name + " ; total = " + o2.total); // no error

		// ------------------------------------------------	
		// ## Intersection Type: e.g. as below
		// OLDER APPROACH: 
		Function<Integer, Integer> f3 = (Function<Integer, Integer> & Serializable) i -> i + 1; // no error

		Serializable s = (Function<Integer, Integer> & Serializable) i -> i + 1; // no error

		// (Function<Integer, Integer> & Serializable) f4 = (Function<Integer, Integer> & Serializable) i -> i + 1; // compile error

		// NEW APPROACH
		var action = (Function<Integer, Integer> & Serializable) i -> i + 1; // type of action = (Function<Integer, Integer> & Serializable)

		// ------------------------------------------------	
		// ## can't do and do's with 'var' + 'lambda'
		
		// var _1 = (var a, Integer b) -> true; // error: cannot mix 'var' and explicitly-typed parameters
		// var _2 = (String x, var y, String z) -> true; // error: cannot mix 'var' and explicitly-typed parameters
		// var _3 = (var a, b) -> 101; // error: cannot mix 'var' and explicitly-typed parameters
		// var _4 = var w -> 99; // error: not a statement

		// ------------------------------------------------			
				
	}
}

@interface NotNull {}