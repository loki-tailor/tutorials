package com.logics.sierra_book.ST_ch1._6;

/**
	@created 05-07-2020

	v - Compilation succeeds
		x - Compilation fails with an error on line 1
		x - Compilation fails with an error on line 3
		x - Compilation fails with an error on line 5
		x - Compilation fails with an error on line 7
		x - Compilation fails with an error on line 9 
*/

public class Electronic implements Device // line 1
{ public void doIt() {} }

abstract class Phone1 extends Electronic {} // line 3

abstract class Phone2 extends Electronic // line 5
{ public void doIt(int x) {} }

class Phone3 extends Electronic implements Device // line 7
{ public void doStuff() {} }

interface Device { public void doIt(); } // line 9
