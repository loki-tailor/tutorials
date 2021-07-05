package com.inheritance;

/*-
 * 	@author lokeshwar @created 07-07-20
 * 
 * 	"If a method is overridden but we use a polymorphic (supertype) reference
 * 	to refer to the subtype object with the overriding method, the compiler assumes that
 * 	we're calling the supertype version of the method. If the supertype version declares
 * 	a checked exception, but the overriding subtype method does not, the compiler still
 * 	thinks that we are calling a method that declares an exception"
  
	----------------------------------------------------------------------
  	Output :- 
  	
 	Processing 'Cycle$1.type()' method @ com.inheritance.Cycle$1...

        Processing 'RoadBike$1.type()' method @ com.inheritance.RoadBike$1...
        
        Processing 'RoadBike$1.type()' method @ com.inheritance.RoadBike$1...
        
	----------------------------------------------------------------------
 */

public class CallByReferenceAndObjType {
    public static void main(String[] args) {
	Cycle$1 c = new Cycle$1();
	Cycle$1 cr = new RoadBike$1();
	RoadBike$1 r = new RoadBike$1();

	// handling exception or 'c' & 'cr' is mandatory since 'Cycle$1' is delcaring a
	// checked exception
	try {
	    c.type();
	    System.out.println();

	    cr.type();
	    System.out.println();

	} catch (Exception e) {
	}

	r.type();
	System.out.println();
    }
}

class Cycle$1 {
    public void type() throws Exception {
	System.out.println("Processing 'Cycle$1.type()' method @ " + this.getClass().getCanonicalName() + "...");
    }
}

class RoadBike$1 extends Cycle$1 {
    public void type() {
	System.out.println("Processing 'RoadBike$1.type()' method @ " + this.getClass().getCanonicalName() + "...");
    }
}
