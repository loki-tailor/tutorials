package com.logics.t11._61;

// #################################################################################
// ## when interface has default & abstract class has static
/*-
interface ILog {
	default void log() {
		System.out.println("ILog");
	}
}

abstract class Log {
	public static void log() {
		System.out.println("Log");
	}
}


class MyLogger extends Log implements ILog {} */

/*- output:
.\com\logics\t11\_61\Test.java:15: error: log() in Log cannot implement log() in ILog
class MyLogger extends Log implements ILog {}
^
  overriding method is static
1 error
*/

// #################################################################################

// ## when interface has default & abstract class has non-static

/*-
interface ILog {
	default void log() {
		System.out.println("ILog");
	}
}

abstract class Log {
	public void log() {
		System.out.println("Log");
	}
}

class MyLogger extends Log implements ILog {}  */

/*-
NO ERROR: Log.log() hides & overrides ILog.log()
*/

// #################################################################################

// ## when interface has static & abstract class has non-static

/*

interface ILog {
	static void log() {
		System.out.println("ILog");
	}
}

abstract class Log {
	public void log() {
		System.out.println("Log");
	}
}

class MyLogger extends Log implements ILog {} */

/*-
NO ERROR
*/

// #################################################################################

// ## when interface has static & abstract class has static

/*

interface ILog {
	static void log() {
		System.out.println("ILog");
	}
}

abstract class Log {
	public static void log() {
		System.out.println("Log");
	}
}

class MyLogger extends Log implements ILog {} */

/*-
NO ERROR
*/

// #################################################################################