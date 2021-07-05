package com.overloading;

/*-
	@author lokeshwar @created 09-07-2020

	* The choice of which overloaded method to call (in other words, the signature of the method),
	  is NOT dynaically decided at runtime.

	* Which overridden version of the method to call (in other words, from which class in the
	  inheritance tree) is decided at runtime based on object type, but which overloaded version
	  of the method to call is based on the reference type of the argument passed at compile time.
*/

class Cycle {}
class RoadBike extends Cycle {}
public class UseCycles {
	public void ride(Cycle c) { System.out.println("In the Cycle version"); }
	public void ride(RoadBike r) { System.out.println("In the RoadBike version"); }
	public static void main(String[] args) {
		UseCycles uc = new UseCycles();
		Cycle c = new Cycle();
		RoadBike r = new RoadBike();
		Cycle cr = new RoadBike();		

		uc.ride(c);
		uc.ride(r);
		uc.ride(cr);
	}
}
