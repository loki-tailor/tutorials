package com.inheritance.demo_from_bk;

/*-
	@author lokeshwar @created 10-07-2020

	------------------------------------------------------------------------------------------------------------------------
	To be a legal implementation class, a nonabstract implementation class must do the following:
	* Provide concrete (nonabstract) iplementations for all abstract methods from the declared interface.
	* Follow all the rules for legal overrides, such as:
		- Declare no checked exceptions on implementation methods other than those declared by the interface method or subclasses of those declared by the interface method.
		- Maintain the signature of the interface method, and, maintain the same return type (or a subtype).
		- But it does not have to declare the exceptions declared in the interface method declaration.

	------------------------------------------------------------------------------------------------------------------------

	* A class can implement more than one interface.
	* An interface can itself extend other interface
	------------------------------------------------------------------------------------------------------------------------
*/

interface Bouncable {
	void bounce();
	void setBounceFactor(int bf);
}

class Tire implements Bouncable {
	public void setBounceFactor(int bf) {}
	public void bounce() {}
}

abstract class Ball implements Bouncable {
	// no methods of Bouncable are implemented in 'Ball'
	void beSpherical() {}
}	

public class BeachBall extends Ball {
	public void setBounceFactor(int bf) {}
	public void bounce() {}
	// beSherical() is not abstract, so 'BeachBall' isnot required to implement it
}
