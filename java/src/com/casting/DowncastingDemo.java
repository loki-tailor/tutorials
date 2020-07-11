package com.casting;

/*-
	@author lokeshwar @created 09-07-2020

	* compiler is forced to trust on dev when downcasting

	* All the compiler can do is verify that the two types involved during casting are
	  belonging to the same inheritance tree. The compiler must allow things that
	  might possibily work at runtime. 

	* However, if the compiler knows with certainity that the cast could not possibily work,
	  compilation will fail. 	
*/

class Cycle {
	public void material() { System.out.println("generic material - steel"); }
}

class Frame extends Cycle {
	public void material() { System.out.println("material - aluminium"); }
	public void bottleCage() { System.out.println("bottle cage included"); }
}

public class DowncastingDemo {
	public static void main(String[] args) {
		Cycle[] parts = { new Cycle(), new Frame(), new Cycle() };
		for(Cycle part : parts) {
			part.material();
			if(part instanceof Frame) {
				((Frame)part).bottleCage();
			}
		System.out.println();
		}
		
		Cycle c = new Cycle();
		// below line compiles but fails at runtime with java.lang.ClassCastException
		Frame f = (Frame) c;
		f.bottleCage();

		// String s = (String) c; // compile error - incompatible types
	}
}
