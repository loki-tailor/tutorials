package com.logics.sierra_book.ST_ch2._9;

/*-
	@created 18-07-20

	v - An exception is thrown at runtime
		x - The code compiles and runs with no output
		x - Compilation fails with an error at line 8
		x - Compilation fails with an error at line 9
		x - Compilation fails with an error at line 12
		x - Compilation fails with an error at line 13

	"A ClassCastException will be thrown when the code attempts to downcast a Tree to a Redwood"
*/

public class Redwood extends Tree {
	public static void main(String[] args) {
		new Redwood().go();
	}
	void go() {
		go2(new Tree(), new Redwood()); // line 8
		go2( (Redwood) new Tree(), new Redwood()); // line 9
	}	

	void go2(Tree t1, Redwood r1) {
		Redwood r2 = (Redwood) t1; // line 12
		Tree t2 = (Tree) r1; // line 13
	}
}

class Tree {}

/*-
	OUTPUT :- 

	Exception in thread "main" java.lang.ClassCastException: com.logics.sierra_book.ST_ch2._9.Tree cannot be cast to com.logics.sierra_book.ST_ch2._9.Redwood
		at com.logics.sierra_book.ST_ch2._9.Redwood.go2(Redwood.java:17)
		at com.logics.sierra_book.ST_ch2._9.Redwood.go(Redwood.java:12)
		at com.logics.sierra_book.ST_ch2._9.Redwood.main(Redwood.java:9)

*/
