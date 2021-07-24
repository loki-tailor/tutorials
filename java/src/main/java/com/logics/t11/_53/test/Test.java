package com.logics.t11._53.test;

import com.logics.t11._53.*;

public class Test {
	public static void main(String[] args) {
		M o1 = new M();
		N o2 = (N) o1; // line #n
		o2.printName();
	}
}

/*- line #n gives runtime exception: iff N extends M

Exception in thread "main" java.lang.ClassCastException: com.logics.t11._53.M cannot be cast to com.logics.t11._53.N
        at com.logics.t11._53.test.Test.main(Test.java:8)

*/


/*- line #n gives below compile time error: iff N DOES NOT EXTEND M

.\com\logics\t11\_53\test\Test.java:8: error: incompatible types: M cannot be converted to N
                N o2 = (N) o1;
                           ^
1 error

*/

