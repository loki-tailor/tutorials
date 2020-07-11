package com.inheritance;

/*-
	@author lokeshwar @created 10-07-2020

	If we want to implement multiple interfaces, and they can have methods with same method-signature
*/

interface I2 { default int doStuff() { return 2; } }
interface I1 { default int doStuff() { return 1; } }
class C1 { public int doStuff() { return 3; } }

public class MultiInheritance implements I2, I1 { 

// case 1 - when I1 has 'void doStuff()' below will give compile error: class MultiInheritance inherits unrelated defaults for doStuff() from types I1 and I2
// case 2 - when I1 has 'int doStuff()' below will give compile error: types I2 and I1 are incompatible; both define doStuff(), but with unrelated return types
	public static void main(String[] args) {
		MultiInheritance mi = new MultiInheritance();
		System.out.println(mi.doStuff());
	}

	public int doStuff() { return 4; } 
	// for case 1 - if above is uncommented, then compile error will as: doStuff() in MultiInheritance cannot implement doStuff() in I1
	// for case 2 - if above is commented, the compile error will come as: class MultiInheritance inherits unrelated defaults for doStuff() from types I2 and I1
}
