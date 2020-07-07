package com.inheritance;

/*-
 * 	@author lokeshwar @created 07-07-2020
 * 
 * 	Demo of - "Run the supertype version of the method, and then come back down
 * 	here and finish with the subtype version of the method's code.
 * 	Note: There is not requirement / rule that the supertype version should run 
 * 	before the subtype code"
 */

public class CallSuperTypeVersionOfOverriden {
    public static void main(String[] args) {
	Cycle c = new Cycle();
	RoadBike r = new RoadBike();
	MTBBike m = new MTBBike();

	c.handle();
	System.out.println();

	r.handle();
	System.out.println();

	m.handle();
	System.out.println();
    }
}

class Cycle {
    public void handle() {
	System.out.println("I am performing 'Cycle.handle()' method...");
    }
}

class RoadBike extends Cycle {
    public void handle() {
	super.handle();
	System.out.println("I am performing 'RoadBike.handle()'");
    }
}

class MTBBike extends Cycle {
    public void handle() {
	System.out.println("I am performing 'MTBBike.handle()");
	super.handle();
    }
}