package com.variables;

/*- 	created @ 31-03-20 @author lokeshwar
	
	Ref: https://www.dummies.com/programming/java/shadowed-classes-or-variables-in-java/
	
	Shadowing refers to the practice in Java programming of using two variables with the same name within scopes that overlap.
*/

public class Shadowing {
    int count = 9;

    public void logIn() {
	int count = 10;
	System.out.println("local variable count is " + count);
    }

    public void count() {
	System.out.println("instance variable count is " + count);
    }

    public void count(int count) {
	count = count;
    }

    public static void main(String[] args) {
	Shadowing s = new Shadowing();
	s.logIn(); // this prints local variable value
	s.count(20); // this does nothing, since the assignment has no effect
	s.count(); // this prints instance variable value
	
	// below demonstrates that a variable name can also be same as instance variable name
	System.out.println();
	Shadowing Shadowing = new Shadowing();
	Shadowing.logIn();
	
    }
} // end of class
