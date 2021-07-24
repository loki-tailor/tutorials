package com.logics.t11._51;

class Lock { 
	public void open() {
		System.out.println("LOCK-OPEN");
	}
}

class Padlock extends Lock {
	public void open() {
		System.out.println("PADLOCK-OPEN");
	}
}

class  DigitalPadlock extends Padlock {

	public void open() {
		// ((Lock)super).open(); // compile error

		// (Lock)super.open(); // compile error

		// super.super.open(); // compile error

		// super.open(); // no error: but prints PADLOCK-OPEN instead of LOCK-OPEN (which we wanted)
	}
	
}

public class Test {
	public static void main(String[] args) {
		Lock lock = new DigitalPadlock();
		lock.open();
	}
}

/*-

super.open(); => Using super keyword, you can access methods and variables of immediate parent class, hence if you replace /*INSERT*/ with `super.open();`, then open() method of Padlock class will be invoked.



super.super.open(); => super.super is not allowed in java, it causes compilation error.



((Lock)super).open(); => Not possible to cast super keyword in java, it causes compilation error.



(Lock)super.open(); => super.open(); will be evaluated first as dot (.) operator has higher precedence than cast. super.open(); returns void and hence it cannot be casted to Lock. It also causes compilation error.



In fact, it is not possible to directly reach to 2 levels, super keyword allows to access methods and variables of immediate parent class only (just 1 level up). Hence, correct answer is: 'None of the other options'

*/