package com.logics;

/**
*	@author lokeshwar created @ 4-12-19
*	practice from https://stackoverflow.com/q/17966406/7415499
*	ref: https://stackoverflow.com/questions/36276451/java-coding-eclipse-showing-compile-time-error-on-line-4-only-why?noredirect=1&lq=1
*	ref: https://stackoverflow.com/questions/129178/difference-between-int-array-and-int-array
*/

public class CompilationSequenceCheck {

	public static void main(String[] args) {

		Syste.out.rintln("Hello"); 
		// no.1 - comes in CLI
		// package Syste does not exist

		Syste.Out.rintln("Hello");		
		// no.2 - comes in CLI with no.1
		// package Syste does not exist
		// as per SO, this should not be printed on CLI, however it's getting printed, TO POST

		Lokeshwar.add();
		// no.3 -  comes in CLI with no.1 and no.2
		// error: cannot find symbol

		Lokeshwar.add()();
		// no.4 - The very 1st error precludes all the above errors. no.1, no.2 and no.3 don't come at all.
		// error: ';' expected

		if();
		// no.5 - This comes with no.4 only on CLI, others no.1-3 don't come at all
		// error: illegal start of expression

		try { int i = 10/0; }
		// no.6 - This comes with no.4 & no.5 on CLI. 
		// error: 'try' without 'catch', 'finally' or resource declarations, others no.1-3 don't come at all

	} // end of main

} // end of class
