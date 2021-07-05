package com.logics.app_ocajavatest;

/**
	@created on 22-01-2020
	@author lokeshwar
	
	This class demonstrates cases in which "default constructor" will be called,
	and cases in which it will not be called.

	valid = default constructor will be called
	invalid = default constructor will NOT be called
*/


	
	// invalid & compile error: return type required
	//public class DefaultConstructorDemo  { public defaultConstructorDemo() {} }

	// invalid & compile error: return type required
	//public class DefaultConstructorDemo { public defaultConstructorDemo(String name) {} }

	// valid
	//public class DefaultConstructorDemo { void DefaultConstructorDemo() {} }
	
	// invalid & NO compile error
	//public class DefaultConstructorDemo { DefaultConstructorDemo(String name) {} }

	// valid
	//public class DefaultConstructorDemo {}

	// invalid & NO compile error
	//public class DefaultConstructorDemo { public DefaultConstructorDemo() {} }

	// invalid & NO compile error
	//public class DefaultConstructorDemo { private DefaultConstructorDemo(int age) {} }
